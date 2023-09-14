package ch13_thread;

public class ThreadEx19 {
	static long startTime = 0;
	public static void main(String[] args) {
		Thread19_1 th1 = new Thread19_1();
		Thread19_2 th2 = new Thread19_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		try {
			th1.join(); // 메인쓰레드가 th1의 작업이 끝날 때까지 기다림 
			th2.join(); // 메인쓰레드가 th2의 작업이 끝날 때까지 기다림 
		} catch (InterruptedException e) { }
		System.out.print("소요시간1:" + (System.currentTimeMillis() - ThreadEx19.startTime));
	}
}

class Thread19_1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++)
			System.out.printf("%s", new String("-"));
	}
}

class Thread19_2 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++)
			System.out.printf("%s", new String("|"));
	}
}

