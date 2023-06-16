package ch6_object;

class Data { int x; }

class PrimitiveParamEx {
	public static void main(String args[]) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x); // 매개변수 x의 값이 변경된 것 즉, 복사본이 변경
	}

	static void change(int x) { // 기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}
