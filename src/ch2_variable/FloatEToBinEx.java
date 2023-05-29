package ch2_variable;
public class FloatEToBinEx {
	public static void main(String[] args) {
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f); // float -> int 타입으로 해석

		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i); // 
	}

}
