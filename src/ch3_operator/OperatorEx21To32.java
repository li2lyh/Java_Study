package ch3_operator;

import java.util.*;

public class OperatorEx21To32 {
	public static void main(String[] args) {
		
/*		// OperatorEx21
		System.out.printf("10==10.0f \t %b%n", 10 == 10.0f);
		System.out.printf("'0' == 0 \t %b%n", '0' == 0);
		System.out.printf("'A' == 65 \t %b%n", 'A' == 65);
		System.out.printf("'A' > 'B' \t %b%n", 'A' > 'B');
		System.out.printf("'A' + 1 != 'B' \t %b%n", 'A' + 1 != 'B');
		
		// OperatorEx22
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double) f;

		System.out.printf("10.0==10.0f \t %b%n", 10.0 == 10.0f);
		System.out.printf("'0.1' == 0.1f \t %b%n", 0.1 == 0.1f);

		System.out.printf("f =%19.17f%n", f);
		System.out.printf("d =%19.17f%n", d); // 근사값으로 저장되므로 오차 발생
		System.out.printf("d2 =%19.17f%n", d2);
		System.out.printf("d==f %b%n", d == f);
		System.out.printf("d==d2 %b%n", d == d2);
		System.out.printf("d2==f %b%n", d2 == f);
		System.out.printf("(float)d==f %b%n", (float) d == f); 
		
		// OperatorEx23
		String str1 = "abc";
		String str2 = new String("abc");

		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc" == "abc");
		System.out.printf("str1==\"abc\" ? %b%n", str1 == "abc");
		System.out.printf("str2==\"abc\" ? %b%n", str2 == "abc"); // 내용은 같지만 다른 객체라 false
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC")); // 대소문자 구별X

		// OperatorEx24
		int x = 0;
		char ch = ' ';

		x = 15;
		System.out.printf("x=%2d, 10 < x && x < 20 = %b%n", x, 10 < x && x < 20);

		x = 6;
		System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x%%6!=0 =%b%n", x, x % 2 == 0 || x % 3 == 0 && x % 6 != 0);
		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x%%6!=0 =%b%n", x, (x % 2 == 0 || x % 3 == 0) && x % 6 != 0);

		ch = '1';
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' =%b%n", ch, '0' <= ch && ch <= '9');

		ch = 'a';
		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' =%b%n", ch, 'a' <= ch && ch <= 'z');

		ch = 'A';
		System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z' =%b%n", ch, 'A' <= ch && ch <= 'Z');

		ch = 'q';
		System.out.printf("ch='%c', ch=='q' || ch=='Q' =%b%n", ch, ch == 'q' || ch == 'Q'); 
		
		// OperatorEx25
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';

		System.out.println("문자를 하나 입력하세요.>");

		String input = scanner.nextLine();
		ch = input.charAt(0);

		if ('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}

		if ('a' <= ch && ch <= 'z') {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
		
		// OperatorEx26
		int a = 5;
		int b = 0;

		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a!=0 || ++b!=0 =%b%n", a != 0 || ++b != 0); // 우측 피연산자가 true라 true 반한
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a==0 && ++b!=0 =%b%n", a == 0 && ++b != 0); // 좌측 피연산자가 false라 false 반환
		System.out.printf("a=%d, b=%d%n", a, b); 

		// OperatorEx27
		boolean b = true;
		char ch = 'c';

		// 피연산자와 가까운 것부터 연산
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b);
		System.out.printf("!!b=%b%n", !!b);
		System.out.printf("!!!b=%b%n", !!!b);
		System.out.println();

		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch < 'a' || ch > 'z' =%b%n", ch < 'a' || ch > 'z');
		System.out.printf("!('a' < ch && ch > 'z') =%b%n", !('a' < ch && ch > 'z'));
		System.out.printf("		'a' < ch && ch > 'z' =%b%n", 'a' < ch && ch > 'z'); 
	
		// OperatorEx31
		int dec = 1234;
		int hex = 0xABCD;
		int mask = 0xF;

		System.out.printf("hex=%X%n", hex);
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask); */
		
		// OperatorEx32
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;

		x = 10;
		y = -5;
		z = 0;

		absX = x >= 0 ? x : -x; // x 값이 음수면 양수로 만듦
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;

		signX = x > 0 ? '+' : (x == 0 ? ' ' : '-'); // 조건 연산자 중첩
		signY = y > 0 ? '+' : (y == 0 ? ' ' : '-');
		signZ = z > 0 ? '+' : (z == 0 ? ' ' : '-');

		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
	}

}