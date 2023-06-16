package ch6_object;

class Data2 { int x; }

class ReferenceParamEx {
	public static void main(String args[]) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x); // 매개변수 x의 값이 변경된 것 즉, 복사본이 변경
	}

	static void change(Data2 d) { // 참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}
