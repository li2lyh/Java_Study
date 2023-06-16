package ch7_object2;

import static java.lang.System.out; // static import문을 사용하면 static멤버를 호출할 때 클래스 이름을 생략할 수 있음
import static java.lang.Math.*;

class StaticImportEx1 {
	public static void main(String[] args) {
		// System.out.println(Math.random());
		out.println(random());

		// System.out.println("Math.PI :"+Math.PI);
		out.println("Math.PI :" + PI);
	}
}
