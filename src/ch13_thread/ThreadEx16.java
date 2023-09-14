package ch13_thread;

public class ThreadEx16 {
	public static void main(String[] args) {
		RunImplEx16 r1 = new RunImplEx16();
		RunImplEx16 r2 = new RunImplEx16();
		RunImplEx16 r3 = new RunImplEx16();
		Thread th1 = new Thread(r1, "*");
		Thread th2 = new Thread(r2, "**");
		Thread th3 = new Thread(r3, "***");
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

class RunImplEx16 implements Runnable {
	// boolean형 변수를 선언해 이들을 사용해 쓰레드의 작업을 중지시켰다가 재개하거나 종료되도록 함
	boolean suspended = false;
	boolean stopped = false;
	public void run() {
		while (!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) { }
			}
		}
		System.out.println(Thread.currentThread().getName() + " -stopped");
	}

	public void suspend() {suspended = true;}
	public void resume() {suspended = false;}
	public void stop() {stopped = true;}
}
