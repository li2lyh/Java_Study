package ch4_control;

import java.util.*;

public class FlowEx1To10 {
	public static void main(String[] args) {
		
/*		// FlowEx1
		int x = 0;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);

		if (x == 0) System.out.println("x==0");
		if (x != 0) System.out.println("x!=0");
		if (!(x == 0)) System.out.println("!(x==0)");
		if (!(x != 0)) System.out.println("!(x!=0)");
		
		x = 1;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);
		if (x == 0) System.out.println("x==0");
		if (x != 0) System.out.println("x!=0");
		if (!(x == 0)) System.out.println("!(x==0)");
		if (!(x != 0)) System.out.println("!(x!=0)");
		
		// FlowEx2
		int input;

		System.out.print("숫자를 하나 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 입력받은 내용 저장
		input = Integer.parseInt(tmp); // 문자 숫자로 변환

		if (input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}

		if (input != 0) 
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d입니다.", input); // 괄호 생략해서 항상 출력 
		
		// FlowEx3
		System.out.print("숫자를 하나 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		int input =  scanner.nextInt();

		if (input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		} 
		
		// FlowEx4
		int score = 0;
		char grade = ' ';

		System.out.print("점수를 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("당신의 학점은" + grade + "입니다.");
		
		// FlowEx5
		int score = 0;
		char grade = ' ', opt = '0';

		System.out.print("점수를 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();

		System.out.printf("당신의 점수는 %d입니다.%n", score);

		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		} else {
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt); 
		
		// FlowEx6
		System.out.print("현재 월을 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();

		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8 :
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9: case 10: case 11 :
			System.out.println("현재의 계절은 가을입니다.");
			break;
		default:
		case 12: case 1: case 2 :
			System.out.println("현재의 계절은 겨울입니다.");
		}
		
		// FlowEx7
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int) (Math.random() * 3) + 1;

		System.out.println("당신은" + user + "입니다.");
		System.out.println("컴퓨터는" + com + "입니다.");

		switch (user - com) {
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
		} 
		
		// FlowEx8
		System.out.print("당신의 주민번호를 입력하세요. (011231-1111222)>");

		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		
		char gender = regNo.charAt(7); // 입력받은 8번째 문자 저장

		switch (gender) {
		case '1': case '3':
			System.out.println("당신은 남자입니다.");
			break;
		case '2': case '4':
			System.out.println("당신은 여자입니다.");
			break;
		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");
		} 
		
		// FlowEx9
		char grade = ' ';
		
		System.out.print("당신의 점수를 입력하세요. (1~100)>");

		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();

		switch (score) {
		case 100: case 99: case 98: case 97: case 96: case 95:
		case 94: case 93: case 92: case 91: case 90:
			grade = 'A';
			break;
		case 89: case 88: case 87: case 86: case 85: 
		case 84: case 83: case 82: case 81: case 80:
			grade = 'B';
			break;
		case 79: case 78: case 77: case 76: case 75:
		case 74: case 73: case 72: case 71: case 70:
			grade = 'C';
			break;
		default:
			grade = 'F';
		}
		System.out.println("당신의 학점은" + grade + "입니다."); */
		
		// FlowEx10
		int score = 0;
		char grade = ' ';
		
		System.out.print("당신의 점수를 입력하세요. (1~100)>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		score = Integer.parseInt(tmp);

		switch (score/10) {
		case 10: 
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'F';
		}
		System.out.println("당신의 학점은" + grade + "입니다.");
		

	}

}
