package ch8_exception;

public class ExceptionEx12 {
	// 예외처리를 하지 않고 자신을 호출한 메서드에게 예외를 넘겨줄 수는 있지만 단순히 전달만 하는 것임
	// try-catch문으로 예외처리를 해줘야 함
	public static void main(String[] args) throws Exception{
		method1(); // 같은 클래스내 static멤버이므로 객체생성없이 직접 호출가능
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception(); 
	}
}
