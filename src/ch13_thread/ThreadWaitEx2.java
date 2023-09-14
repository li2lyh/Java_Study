package ch13_thread;

import java.util.ArrayList;

class Customer2 implements Runnable {
	private Table2 Table2;
	private String food;

	Customer2(Table2 Table2, String food) {
		this.Table2 = Table2;
		this.food = food;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}

			String name = Thread.currentThread().getName();

			if (eatFood())
				System.out.println(name + " ate a " + food);
			else
				System.out.println(name + " failed to eat. :(");
		}
	}

	boolean eatFood() {
		return Table2.remove(food);
	}
}

class Cook2 implements Runnable {
	private Table2 Table2;

	Cook2(Table2 Table2) {
		this.Table2 = Table2;
	}

	public void run() {
		while (true) {
			int idx = (int) (Math.random() * Table2.dishNum());
			Table2.add(Table2.dishNames[idx]);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}

class Table2 {
	String[] dishNames = { "donut", "donut", "burger" };
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();

	public synchronized void add(String dish) {
		if (dishes.size() >= MAX_FOOD)
			return;

		dishes.add(dish);
		System.out.println("Dishes: " + dishes.toString());
	}

	public synchronized boolean remove(String dishName) {
		while (dishes.size() == 0) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting.");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}

		for (int i = 0; i < dishes.size(); i++) {
			if (dishName.equals(dishes.get(i))) {
				dishes.remove(i);
				return true;
			}
		}

		return false;
	}

	public int dishNum() {
		return dishNames.length;
	}
}

public class ThreadWaitEx2 {
	public static void main(String[] args) throws Exception {
		Table2 Table2 = new Table2(); // 여러 쓰레드가 공유하는 객체

		new Thread(new Cook2(Table2), "Cook").start();
		new Thread(new Customer2(Table2, "donut"), "CUST1").start();
		new Thread(new Customer2(Table2, "burger"), "CUST2").start();

		Thread.sleep(5000);
		System.exit(0);
	}
}
