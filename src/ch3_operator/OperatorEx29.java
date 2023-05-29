package ch3_operator;

public class OperatorEx29 {
	public static void main(String[] args) {
		byte p = 10;
		byte n = -10;

		System.out.printf("p =%d \t%s%n", p, toBinaryString(p));
		System.out.printf("~p =%d \t%s%n", ~p, toBinaryString(~p));
		System.out.printf("~p+1 =%d \t %s%n", ~p+1, toBinaryString(~p+1)); // p에 대한 음의 정수를 얻음
		System.out.printf("~~p =%d \t %s%n", ~~p, toBinaryString(~~p));
	}

	static String toBinaryString(int x) { // 2진수로 출력하기 위한 메서드
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length() - 32);
	}
}