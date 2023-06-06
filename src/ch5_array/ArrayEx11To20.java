package ch5_array;

import java.util.*;

public class ArrayEx11To20 {
	public static void main(String[] args) {
		
/*		// ArrayEx11
		int[] numArr = new int[10];
		int[] counter = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10);
			System.out.print(numArr[i]);
		}
		System.out.println();

		for (int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++; // 숫자가 몇 번 반복해서 나타나는지 세어서 배열에 담음
		}
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "의 개수 :" + counter[i]); 
		}
		
		// ArrayEx12
		String[] names = { "kim", "Park", "Yi" };

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]:" + names[i]);
		}
		String tmp = names[2]; // Yi 저장
		System.out.println("tmp:" + tmp);
		names[0] = "Yu"; // Kim -> Yu

		for (String str : names)
			System.out.println(str);
		
		// ArrayEx13
		// 16진수를 2진수로 변환하는 예제
		char[] hex = { 'C', 'A', 'F', 'E' }; // 변환하고자 하는 16진수를 나열

		String[] binary = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" }; 

		String result = "";

		for (int i = 0; i < hex.length; i++) {
			if (hex[i] > '0' && hex[i] <= '9') {
				result += binary[hex[i] - '0']; // '8' - '0'의 결과는 8
			} else {
				result += binary[hex[i] - 'A' + 10]; // 'C' - 'A'의 결과는 2
			}
		}
		System.out.println("hex:" + new String(hex));
		System.out.println("binary:" + result);
		
		// ArrayEx14
		// (String문자열).charAt(인덱스)
		// char[] chArr = (String문자열).toCharArray();

		String src = "ABCDE";

		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt("+i+"):" +ch);
		}
		// String을 char[] 변환
		char[] chArr = src.toCharArray();
		
		System.out.println(chArr); 
		
		// ArrayEx16
		String source = "SOSHELP";
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		String result = "";

		for (int i = 0; i < source.length(); i++) {
			result += morse[source.charAt(i) - 'A'];
		}
		System.out.println("source:" + source);
		System.out.println("morse:" + result); 
		
		// ArrayEx17
		// 커멘드 라인을 통해 입력받기
		System.out.println("매개변수의 개수:" + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
		} 

		// ArrayEx18
		if (args.length != 3) {
			System.out.println("usage: java ArrayEx17 NUM1 OP NUM2");
			System.exit(0);
		}
		int num1 = Integer.parseInt(args[0]); // 문자열을 숫자로 변환
		char op = args[1].charAt(0); // 문자열중 operator를 문자로 변환.
		int num2 = Integer.parseInt(args[2]);

		int result = 0;

		switch (op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case 'x':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				System.out.println("지원되지 않는 연산입니다.");
		}
		System.out.println("결과:" + result);

		// ArrayEx19
		// score의 모든 요소 합을 구하고 출력
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 } };
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
			}
		}

		for (int[] tmp : score) {
			for (int i : tmp) {
				sum += i;
			}
		}
		System.out.println("sum=" + sum); */
		
		// ArrayEx20
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		// 과목별 총점
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;

		System.out.println("번호  국어   영어   수학  총점  평균 ");
		System.out.println("============================");

		for (int i = 0; i < score.length; i++) {
			int sum = 0; // 개인별 총점
			float avg = 0.0f; // 개인별 평균

			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i + 1);

			for (int j = 0; j < score[i].length; j++) { // score[j].length가 아니라 score[i].length 임.
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}

			// 평균 계산
			avg = sum / (float) score[i].length;
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("==============================");
		System.out.printf("총점:%3d %4d %4d%n", korTotal, engTotal, mathTotal);

	}

}
