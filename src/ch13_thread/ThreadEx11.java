package ch13_thread;

import java.util.Iterator;
import java.util.Map;

public class ThreadEx11 {
	public static void main(String[] args) {
		ThreadEx11_1 th1 = new ThreadEx11_1("Thread1");
		ThreadEx11_2 th2 = new ThreadEx11_2("Thread2");
		th1.start();
		th2.start();
	}
}

class ThreadEx11_1 extends Thread {
	ThreadEx11_1(String name) {
		super(name);
	}

	public void run() {
		try {
			sleep(5 * 1000); // 5초동안 기다
		} catch (InterruptedException e) {
		}
	}
}

class ThreadEx11_2 extends Thread {
	ThreadEx11_2(String name) {
		super(name);
	}

	public void run() {
		Map map = getAllStackTraces();
		Iterator it = map.keySet().iterator();

		int x = 0;
		while (it.hasNext()) {
			Object obj = it.next();
			Thread t = (Thread) obj;
			StackTraceElement[] ste = (StackTraceElement[]) (map.get(obj));

			System.out.println();
			for (int i = 0; i < ste.length; i++) {
				System.out.println(ste[i]);
			}
			System.out.println();
		}
	}
}