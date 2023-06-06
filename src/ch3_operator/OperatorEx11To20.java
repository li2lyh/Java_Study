package ch3_operator;

public class OperatorEx11To20 {
	public static void main(String[] args) {
		
/*		// OperatorEx11
		char c1 = 'a';
		char c2 = c1;
		char c3 = ' ';

		int i = c1 + 1;

		c3 = (char) (c1 + 1); // c1 + 1 결과가 int이므로 char형으로 형변환 
		c2++;
		c2++;

		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
		
		// OperatorEx12
		char c1 = 'a';
		char c2 = c1;
		char c3 = ' ';

		int i = c1 + 1;

		c3 = (char) (c1 + 1); // c1 + 1 결과가 int이므로 char형으로 형변환 
		c2++;
		c2++;

		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
		
		// OperatorEx13
		char c1 = 'a';

//		char c2 = c1 + 1;
		char c2 = 'a' + 1; // 리터럴 연산

		System.out.println(c2); 

		// OperatorEx14
		char c = 'a';
		for (int i = 0; i < 26; i++) {
			System.out.println(c++);
		}
		System.out.println();

		c = 'A';
		for (int i = 0; i < 26; i++) {
			System.out.println(c++);
		}
		System.out.println();

		c = '0';
		for (int i = 0; i < 10; i++) {
			System.out.println(c++);
		}
		System.out.println();
		
		// OperatorEx15
		char lowerCase = 'a';
		char upperCase = (char) (lowerCase - 32);
		System.out.println(upperCase);
		
		// OperatorEx16
		float pi = 3.141592f;
		float shortPi = (int) (pi * 1000) / 1000f;
		System.out.println(shortPi); 

		// OperatorEx17
		double pi = 3.141592;
		double shortPi = (int) (pi * 1000 + 0.5) / 1000.0; // 반올림을 위해 0.5 더함
		System.out.println(shortPi);

		// OperatorEx18
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0; // round 메서드 소수점 첫째자리에서 반올림하고 그 결과를 정수로 돌려줌
		System.out.println(shortPi); 

		// OperatorEx19
		int x = 10;
		int y = 8;

		System.out.printf("%d을  %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d을, 나머지는 %d입니다. %n", x / y, x % y); */

		// OperatorEx20
		// 왼쪽 피연산자의 부호를 붙임
		System.out.println(-10 % 8);
		System.out.println(10 % -8);
		System.out.println(-10 % -8);
	}

}