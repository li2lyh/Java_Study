package ch7_object2;

class InnerEx1 {
	class InstantceInner {
		int iv = 100;
//		static int cv = 100; // static변수 선언 못함
		final static int CONST = 100; // final static은 상수이므로 허용
	}

	static class StaticInner {
		int iv = 200;
		static int cv = 200; // static클래스만 static멤버 정의 가능
	}

	void myMethod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 100; // static변수 선언 못함
			final static int CONST = 300;
		}
	}

	public static void main(String[] args) {
		System.out.println(InstantceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}
