package ch6_object;

class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv; // 에러. 클래스변수는 인스턴스 변수를 사용 못함	
	static int cv2 = new MemberCall().iv; // 객체 생성해야 사용 가능
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); / 에러. 클래스메서드에서 인스턴스변수 사용 불가
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // 객체를 생성해야 참조 가능
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // 인스턴스메서드에서는 인스턴스변수 바로 사용 가능
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); / 에러. 클래스메서드에서 인스턴스변수 사용불가
		MemberCall c = new MemberCall();
		c.instanceMethod1();; // 인스턴스 생성해야 호출 가능
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}
