package ch7_object2;

class BindingTest {
	public static void main(String[] args) {
		Parent3 p = new Child3();
		Child3 c = new Child3();

		System.out.println("p.x = " + p.x);
		p.method();

		System.out.println("c.x = " + c.x);
		c.method();

	}
}

class Parent3 {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child3 extends Parent3 {
	int x = 200; // 멤버변수 중복정의

	void method() { // 메서드 오버라이딩
		System.out.println("Child Method");
	}
}
