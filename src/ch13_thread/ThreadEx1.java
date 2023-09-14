package ch13_thread;

public class ThreadEx1 {
	public static void main(String[] args) {
		// Thread의 자손클래스의 인스턴스 생성
		ThreadEx1_1 t1 = new ThreadEx1_1();

		Runnable r = new ThreadEx1_2(); // Runnable을 구현한 클래스의 인스턴스를 생성해
		Thread t2 = new Thread(r); // Thread클래스의 생성자의 매개변수로 제공해 인스턴스생성

		// 쓰레드 실행
		t1.start();
		t2.start();
	}
}

class ThreadEx1_1 extends Thread {
	// Thread클래스의 run()재정의
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName()); // / 조상인 Thread의 getName() 호출
		}
	}
}

// Runnable인터페이스를 상속받아 쓰레드 구현
class ThreadEx1_2 implements Runnable {
	// Runnable인터페이스의 run()구현
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()); // 현해 실행중인 Thread 반환
		}
	}
}
