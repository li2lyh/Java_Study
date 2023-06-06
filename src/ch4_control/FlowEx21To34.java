package ch4_control;

import java.util.Scanner;

public class FlowEx21To34 {
	public static void main(String[] args) {
		
		// FlowEx21
/*		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j) {
					System.out.printf("[%d,%d]", i, j);
				} else {
					System.out.printf("%5c", ' ');
				}
			}
			System.out.println();
		} 
		
		// FlowEx22
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++)
			System.out.printf("%d ", arr[i]);
		System.out.println();

		for (int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();
		System.out.println("sum=" + sum);
		
		// FlowEx23
		int i = 5;

		while (i-- != 0) {
			System.out.println(i + " - I can do it.");
		} 
		
		// FlowEx24
		int i = 11;

		System.out.println("카운트 다운을 시작합니다.");

		while (i-- != 0) {
			System.out.println(i);

			for (int j = 0; j < 2_000_000_000; j++) {
				; // 생략 가능
			}
		}
		System.out.println("GAME OVER");
		
		// FlowEx25
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);

		while (num != 0) {
			sum += num % 10; // num을 10으로 나눈 나머지를 sum에 더함
			System.out.printf("sum=%3d num=%d%n", sum, num);

			num /= 10; // num을 10을 나눈 값을 다시 num에 저장
		}
		System.out.println("각 자리수의 합: " + sum);
		
		// FlowEx26
		int sum = 0;
		int i = 0;
		
		// i를 증가시켜서 sum에 계속 더함
		while ((sum += ++i) <= 100) {
			System.out.printf("%d - %d%n", i, sum);
		} 
		
		// FlowEx27
		int num;
		int sum = 0;
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);

		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");

		while (flag) { // flag 값 true이므르 조건식 참
			System.out.print(">>");

			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);

			if (num != 0) {
				sum += num;
			} else {
				flag = false; // num이 0이면 false변경
			}
		}
		System.out.println("합계:" + sum);
		
		// FlowEx28
		int input = 0, answer = 0;

		answer = (int) (Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = scanner.nextInt();

			if (input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if (input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while (input != answer);

		System.out.println("정답입니다.");
		
		// FlowEx29
		for (int i = 1; i <= 100; i++) {
			System.out.printf("i=%d ", i);

			int tmp = i;

			// 369 가 포함된 개수만큼 짝
			do {
				if (tmp % 10 % 3 == 0 && tmp % 10 != 0)
					System.out.print("짝");
			} while ((tmp /= 10) != 0);
			System.out.println();
		}
		
		// FlowEx30
		int sum = 0;
		int i = 0;

		while (true) {
			if (sum > 100)
				break; // 실행되면 while문을 벗어남
			++i;
			sum += i;
		}
		System.out.println("i=" + i);
		System.out.println("sum=" + sum); 
		
		// FlowEx31
		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0)
				continue; // 블럭의 끝으로 이동
			System.out.println(i);
		} // -> 여기로 이동 
		
		// FlowEx32
		int menu = 0;
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");

			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);

			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
				continue;
			}
			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
		}
		
		// FlowEx33
		Loop1: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5)
					break Loop1;
//					break;
//					continue Loop1;
//					continue;
				System.out.println(i + "*" + j + "=" + i * j);
			} // end of for i
			System.out.println();
		} // end of Loop1 */
		
		// FlowEx34
		int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);

        outer: while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
                continue;
            }

            for (;;) {
                System.out.print("계산할 값을 입력하세요. (계산종료:0, 전체종료:99)>");
                tmp = scanner.nextLine();
                num = Integer.parseInt(tmp);

                if (num == 0)
                    break;
                if (num == 99)
                    break;

                switch (menu) {
                    case 1:
                        System.out.println("result=" + num * num);
                        break;
                    case 2:
                        System.out.println("result=" + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result=" + Math.log(num));
                        break;
                }
            }
        }

	}

}
