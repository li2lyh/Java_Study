package ch2_variable;
public class FloatEx1 {
	public static void main(String[] args) {
		float f = 9.1234567890123456789f;
		float f2 = 1.1234567890123456789f;
		double d = 9.12345678901234567890d;

		System.out.printf("		12345678901234567890123%n");
		System.out.printf("f : %f%n", f); // 실수형 값 출력 시 %f 사용
										  // %f는 소수점 이하 6자리까지만 출력, 7번째 자리에서 반올림 됨
		System.out.printf("f : %24.20f%n", f);
		System.out.printf("f2+ : %24.20f%n", f2);
		System.out.printf("d : %24.20f%n", d);
	}

}
