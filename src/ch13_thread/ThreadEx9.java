package ch13_thread;

public class ThreadEx9 {
	public static void main(String[] args) {
		ThreadGroup main = Thread.currentThread().getThreadGroup(); // 쓰레드 자신이 속한 쓰레드 그룹을 반환
		ThreadGroup grp1 = new ThreadGroup("Group1"); // Group1이름의 쓰레드 그룹 생성
		ThreadGroup grp2 = new ThreadGroup("Group2");

		// ThreadGroup(ThreadGroup parent, String name)
		ThreadGroup subGrp1 = new ThreadGroup(grp1, "SubGroup1"); // Group1에 포함되는 새로운 쓰레드 그룹 생성

		grp1.setMaxPriority(3); // 쓰레드 그룹 grp1의 최대우선순위를 3으로 변경

		Runnable r = new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000); // 1초 지연
				} catch (InterruptedException e) {
				}
			}
		};

		// Thread(ThreadGroup tg, Runnable r, String name)
		new Thread(grp1, r, "th1").start();
		new Thread(subGrp1, r, "th2").start();
		new Thread(grp2, r, "th3").start();

		System.out.println(">>List of ThreadGroup : " + main.getName() // 쓰레드 그룹의 이름 반환
				+ ", Active ThreadGroup: " + main.activeGroupCount() // 쓰레드 그룹에 포함된 활성상태에 있는 쓰레드 그룹의 수 반환
				+ ", Active Thread: " + main.activeCount()); // 쓰레드 그룹에 포함된 활성상태에 있는 쓰레드의 수 반환
		main.list(); // 쓰레드 그룹에 속한 쓰레드와 하위 쓰레드그룹에 대한 정보 출력
	}
}