package ch8_exception;

public class ExceptionEx1To10 {
	public static void main(String[] args) {

/*		// ExceptionEx1
		try {
			try { } catch (Exception e) { } // 블럭에 또 다른 try-catch문이 포함될 수 있음
		} catch (Exception e) {
//			try { } catch (Exception e) { } // 변수 e 중복 선언
											// 참조변수의 영역이 서로 겹치므로 다른 이름을 사용해야만 서로 구별 됨
		}
		
		try {
			
		} catch (Exception e) {
			
		} 
		
		// ExceptionEx2
		int number = 100;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			result = number / (int) (Math.random() * 10); // ArithmeticException 에러 (산술연산과정에서 오류)
			System.out.println(result);
		}
		
		// ExceptionEx3
		int number = 100;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			try {
				result = number / (int) (Math.random() * 10); 
				System.out.println(result);
			} catch (ArithmeticException e) { // ArithmeticException 발생하면 실행
				System.out.println("0");
			}			
		}
		
		// ExceptionEx4
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5); // 예외가 발생하지 않았으므로 실행안됨
		}
		System.out.println(6);
		
		// ExceptionEx5
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 고의로 예외 발생
			System.out.println(4); // 예외가 발생했기에 try블럭을 바로 벗어나서 실행안됨
		} catch (ArithmeticException e) {
			System.out.println(5); // 예외가 발생하지 않았으므로 실행안됨
		}
		System.out.println(6); 
		
		// ExceptionEx6
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 고의로 예외 발생
			System.out.println(4); // 예외가 발생했기에 try블럭을 바로 벗어나서 실행안됨
		} catch (Exception e) { // ArithmeticException는 Exception 자손이므로 예외 처리 가능
			System.out.println(5); // 예외가 발생하지 않았으므로 실행안됨
		}
		System.out.println(6); 
		
		// ExceptionEx7
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); 
			System.out.println(4); 
		} catch (ArithmeticException ae) { // 첫 번째 검사에서 일치하는 블럭을 찾아기에 나머지 블럭 검사 안함
			if (ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception"); 
		}
		System.out.println(6); 
		
		// ExceptionEx8
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); 
			System.out.println(4); 
		} catch (ArithmeticException ae) { 
			ae.printStackTrace(); // 예외 발생원인을 알 수 있음
			System.out.println("예외메세지 : " +ae.getMessage()); // 예외 발생원인을 알 수 있음
		} 
		System.out.println(6); 
		
		// ExceptionEx9
		try {
			Exception e = new Exception("고의로 발생시켰음.");
			throw e; // 예외 발생
			// throw new Exception("고의로 발생시켰음."); // 위의 두 줄을 한 줄로 쓸 수 있음
		} catch (Exception e) { 
			System.out.println("예외메세지 : " +e.getMessage()); 
			e.printStackTrace();
		} 
		System.out.println("프로그램이 정상 종료되었음."); */
		
		// ExceptionEx10
		// throw new Exception("고의로 발생시켰음."); // Exception을 고의로 발생시킴
	}
}
