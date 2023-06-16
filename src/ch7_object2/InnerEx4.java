package ch7_object2;

class Outer {
	class InstanceInner {
		int iv = 100;
	}

	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}

	void myMethod() {
		class LocalInner {
			int iv = 300;
		}
	}
}

class InnerEx4 {
	public static void main(String[] args) {
		// 인스턴스클래스는 외부 클래스를 먼저 생성해야함
		Outer oc = new Outer();  
		Outer.InstanceInner ii = oc.new InstanceInner();

		System.out.println("ii.iv : " + ii.iv);
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);

		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv : " + si.iv);
	}
}
