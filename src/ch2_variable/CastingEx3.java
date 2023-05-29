package ch2_variable;
public class CastingEx3 {
	public static void main(String[] args) {
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double) f;

		System.out.printf("f =%20.18f\n", f);
		System.out.printf("d =%20.18f\n", d); // float와 double의 정밀도 차이때문에 같은 값을 저장해도 다른 값이 저장됨
		System.out.printf("d2 =%20.18f\n", d2); // 다른 값이기에 형변환을 해도 값이 같아지지 않음
	}

}