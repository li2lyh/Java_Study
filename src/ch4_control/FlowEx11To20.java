package ch4_control;

import java.util.Scanner;

public class FlowEx11To20 {
	public static void main(String[] args) {
		
/*		// FlowEx11
		System.out.print("당신의 주민번호를 입력하세요. (011231-1111222)>");

		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();		
		char gender = regNo.charAt(7); // 입력받은 8번째 문자 저장

		switch (gender) {
		case '1':  case '3':
			switch (gender) {
				case '1':
					System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
					break;
				case '3':
					System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
					break;
			}
			break;
		case '2':  case '4':
			switch (gender) {
				case '2':
					System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
					break;
				case '4':
					System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
					break;
			}
			break;
		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");
		}
		
		// FlowEx12
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
		for (int i = 0; i <= 5; i++) {
			System.out.print(i); // 가로 출력
		}
		System.out.println(); 
		
		// FlowEx13
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += 1;
			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
		} 
		
		// FlowEx14
		for (int i = 1, j = 10; i <= 10; i++, j--) {
			sum += 1;
			System.out.printf("%d \t %d%n", i, j);
		} 
		
		// FlowEx15
		System.out.println("i\t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
		System.out.println("-----------------------------------------------------");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n", i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
		}
		
		// FlowEx16
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		
		// FlowEx17
		int num = 0;
		System.out.println("*을 출력할 라인의 수를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();	
		num = Integer.parseInt(tmp);
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// FlowEx18
		// 구구단 출력
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d%n", i, j, i * j);
			}
		}
		
		// FlowEx19
		for (int i = 1; i <= 3; i++)
			for (int j = 1; j <= 3; j++)
				for (int k = 1; k <= 3; j++)
					System.out.println("" + i + j + k); */
		
		// FlowEx20
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("[%d, %d]", i, j);
			}
			System.out.println();
		}

	}

}
