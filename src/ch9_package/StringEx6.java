package ch9_package;

public class StringEx6 {
	public static void main(String[] args) throws Exception {
		int iVal = 100;
		String strVal = String.valueOf(iVal); // int -> String

		double dVal = 200.0;
		String strVal2 = dVal + ""; // String으로 변환하는 또 다른 방법

		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

		System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
	}
}
