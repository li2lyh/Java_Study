package ch7_object2;

class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;

	class InstanceInner {
		int iiv = outerIv; // 외부 클래스의 private멤버도 접근 가능
		int iiv2 = outerCv;
	}

	static class StaticInner {
//		int siv = outerIv; // 스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근 불가
		static int scv = outerCv;
	}

	void myMethod() {
		int lv = 0;
		final int LV = 0;

		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;

//			int liv3 = lv; // 외부 클래스의 지역변수는 상수만 접근 가능 (JDK1.8부터 에러아님)
			int liv4 = LV;
		}
	}
}
