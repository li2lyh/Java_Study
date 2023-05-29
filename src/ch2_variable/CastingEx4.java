package ch2_variable;
public class CastingEx4 {
	public static void main(String[] args) {
		int i = 91234567;
		float f = (float) i; // int -> float
		int i2 = (int) f; // float -> int

		double d = (double) i; // int -> double
		int i3 = (int) d; // double -> int

		float f2 = 1.666f;
		int i4 = (int) f2;

		System.out.printf("i=%d\n", i);
		System.out.printf("f=%f 12=%d\n", f, i2); 
		System.out.printf("d=%f 13=%d\n", d, i3);
		System.out.printf("(int)%f=%d\n", f2, i4);
	}

}
