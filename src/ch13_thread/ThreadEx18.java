package ch13_thread;

public class ThreadEx18 {
	public static void main(String[] args) {
		Thread18_1 th1 = new Thread18_1("*");
		Thread18_1 th2 = new Thread18_1("**");
		Thread18_1 th3 = new Thread18_1("***");
		th1.start();
		th2.start();
		th3.start();

		try {
			Thread.sleep(2000);
			th1.suspend(); // th1쓰레드 잠시중단
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume(); // th1쓰레드 재실행
			Thread.sleep(3000);
			th1.stop(); // th1쓰레드 종료
			th2.stop(); // th2쓰레드 종료
			Thread.sleep(2000);
			th3.stop(); // th3쓰레드 종료
		} catch (InterruptedException e) {
		}
	}
}

class Thread18_1 implements Runnable {
	volatile boolean suspended = false;
	volatile boolean stopped = false;

	Thread th;

	Thread18_1(String name) {
		th = new Thread(this, name); // Thread(Runnable r, String name)
	}

	public void run() {
		String name = th.getName();

		while (!stopped) {
			if (!suspended) {
				System.out.println(name);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(name + " - interrupted");
				}
			} else {
				Thread.yield(); 
			}
		}
		System.out.println(Thread.currentThread().getName() + " - stopped");
	}

	public void start() {
		th.start();
	}

	public void suspend() {
		suspended = true;
		th.interrupt(); 
		System.out.println(th.getName() + " - interrupt() by suspend()");
	}

	public void stop() {
		stopped = true;
		th.interrupt(); 
		System.out.println(th.getName() + " - interrupt() by stop()");
	}

	public void resume() {
		suspended = false;
	}
}