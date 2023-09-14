package ch13_thread;

import javax.swing.JOptionPane;

public class ThreadEx13 {
	public static void main(String[] args) {
		ThreadEx13_1 th1 = new ThreadEx13_1();
		th1.start(); 

		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은 " + input + "입니다.");
		// 21,22행 실행 후, interrupted()실행
		th1.interrupt();// 쓰레드의 interrupted상태 -> true로 변경, 작업을 멈춤
		System.out.println("isInterrupted() : " + th1.isInterrupted());
	}
}

class ThreadEx13_1 extends Thread {
	public void run() {
		int i = 10;

		while (i != 0 && !isInterrupted()) {
			System.out.println(i--);
			for (long x = 0; x < 2500000000L; x++)
				;
		}
		System.out.println("카운트가 종료되었습니다.");
	}
}
