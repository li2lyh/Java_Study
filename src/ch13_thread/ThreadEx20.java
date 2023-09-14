package ch13_thread;

public class ThreadEx20 {
	public static void main(String[] args) {
		ThreadEx20_1 gc = new ThreadEx20_1();
		gc.setDaemon(true); // 데몬쓰레드 선언
		gc.start();

		int requiredMemory = 0;

		for (int i = 0; i < 20; i++) {
			requiredMemory = (int) (Math.random() * 10) * 20;

			if (gc.freeMemory() < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4)
				gc.interrupt(); // 10행에 의해 sleep상태인 쓰레드를 깨움
			try {
				gc.join(100);
			} catch (InterruptedException e) {
			}

			gc.usedMemory += requiredMemory; // 37행에 의해 생성되는 requiredMemory를 usedMemory에 합
			System.out.println("usedMemory:" + gc.usedMemory);
		}
	}
}

class ThreadEx20_1 extends Thread {
	final static int MAX_MEMORY = 1000; 
	int usedMemory = 0;

	public void run() {
		while (true) {
			try {
				Thread.sleep(10 * 1000); // 10초 기다림
			} catch (InterruptedException e) {
				System.out.println("Awaken by interrupt().");
			}

			gc();
			System.out.println("Garbage Collected. Free Memory : " + freeMemory());
		}
	}

	public void gc() {
		usedMemory -= 300;
		if (usedMemory < 0)
			usedMemory = 0;
	}

	public int totalMemory() {
		return MAX_MEMORY;
	} 

	public int freeMemory() {
		return MAX_MEMORY - usedMemory;
	} 
}