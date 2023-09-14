package ch13_thread;

import java.util.ArrayList;

class Customer3 implements Runnable {
	private Table3 Table3;
	private String food;

	Customer3(Table3 Table3, String food) {
		this.Table3 = Table3;  
		this.food  = food;
	}

	public void run() {
		while(true) {
			try { Thread.sleep(100);} catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			Table3.remove(food);
			System.out.println(name + " ate a " + food);
		} // while
	}
}

class Cook3 implements Runnable {
	private Table3 Table3;
	
	Cook3(Table3 Table3) {	this.Table3 = Table3; }

	public void run() {
		while(true) {
			int idx = (int)(Math.random()*Table3.dishNum());
			Table3.add(Table3.dishNames[idx]);
			try { Thread.sleep(10);} catch(InterruptedException e) {}
		} // while
	}
}

class Table3 {
	String[] dishNames = { "donut","donut","burger" }; // donut의 확률을 높임
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();

	public synchronized void add(String dish) {
		while(dishes.size() >= MAX_FOOD) {
				String name = Thread.currentThread().getName();
				System.out.println(name+" is waiting.");
				try {
					wait(); // Cook3쓰레드를 기다리게 함
					Thread.sleep(500);
				} catch(InterruptedException e) {}	
		}
		dishes.add(dish);
		notify();  // 기다리고 있는 CUST를 깨우기 위함
		System.out.println("Dishes:" + dishes.toString());
	}

	public void remove(String dishName) {

		synchronized(this) {	
			String name = Thread.currentThread().getName();

			while(dishes.size()==0) {
					System.out.println(name+" is waiting.");
					try {
						wait(); // CUST쓰레드를 기다리게 함
						Thread.sleep(500);
					} catch(InterruptedException e) {}	
			}

			while(true) {
				for(int i=0; i<dishes.size();i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify(); // 잠자고 있는 Cook3을 깨우기 위함 
						return;
					}
				}

				try {
					System.out.println(name+" is waiting.");
					wait(); // 원하는 음식이 없는 CUST쓰레드를 기다리게 함
					Thread.sleep(500);
				} catch(InterruptedException e) {}	
			} 
		} 
	}

	public int dishNum() { return dishNames.length; }
}

class ThreadWaitEx3 {
	public static void main(String[] args) throws Exception {
		Table3 Table3 = new Table3();

		new Thread(new Cook3(Table3), "Cook1").start();
		new Thread(new Customer3(Table3, "donut"),  "CUST1").start();
		new Thread(new Customer3(Table3, "burger"), "CUST2").start();
	
		Thread.sleep(2000);
		System.exit(0);
	}
}
