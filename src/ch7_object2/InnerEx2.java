package ch7_object2;

class InnerEx2 {
	class InstanceInner {}
	static class StaticInner {}

	InstanceInner iv = new InstanceInner(); // 인스턴스멤버 간에 서로 직접 접근 가능
	static StaticInner cv = new StaticInner(); // static 멤버 간에 서로 직접 접근 가능

	static void staticMethod() {
//		InstantceInner obj1 = new InstantceInner(); //인스턴스멤버에 직접 접근 불가능
		StaticInner obj2 = new StaticInner();
		
		// 굳이 접근하려면 객체를 생성
		// 인스턴스클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있음		
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
	}

	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner(); // 인스턴스메서드에선 인스턴스, static멤버 모두 접근 가능
		StaticInner obj2 = new StaticInner();
// 		LocalInner lv = new LocalInner(); // 메서드 내 지역적으로 선언된 내부 클래스는 외부에서 접근X
	}

	void myMethod() {
		class LocalInner {
		}
		LocalInner lv = new LocalInner();
	}
}
