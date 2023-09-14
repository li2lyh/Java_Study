package ch13_thread;

import javax.swing.JOptionPane;

public class ThreadEx14 {
	public static void main(String[] args) {
		ThreadEx14_1 th1 = new ThreadEx14_1();
		th1.start(); 

		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은 " + input + "입니다.");
		th1.interrupt();
		System.out.println("isInterrupted() : " + th1.isInterrupted());
	}
}

class ThreadEx14_1 extends Thread {
	public void run() {
		int i = 10;

		while (i != 0 && !isInterrupted()) {
			System.out.println(i--);
			try {
				Thread.sleep(1000); // 쓰레드가 멈춰있을때, interrupt()를 실행하면 상태가 false로 변경
			} catch (InterruptedException e) {
				// interrupt(); // catch블럭에 interrupt()를 추가해 상태를 true로 바꾸면 30행에 의해 작업을 멈춤
			}
		}
		System.out.println("카운트가 종료되었습니다.");
	}
}