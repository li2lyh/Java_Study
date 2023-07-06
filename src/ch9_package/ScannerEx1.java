package ch9_package;

import java.util.*;

public class ScannerEx1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] argArr = null;

		while (true) {
			String prompt = ">>";
			System.out.print(prompt);

			// 화면으로부터 라인단위로 입력
			String input = s.nextLine();

			input = input.trim(); // 입력받은 값에서 불필요한 앞뒤 공백을 제거
			argArr = input.split(" +"); // 입력받은 내용을 공백을 구분자로 자름, 하나 이상의 공백을 의미

			String command = argArr[0].trim();

			if ("".equals(command))
				continue;

			// 명령어를 소문자로 바꿈
			command = command.toLowerCase();

			// q또는 Q를 입력하면 실행 종료
			if (command.equals("q")) {
				System.exit(0);
			} else {
				for (int i = 0; i < argArr.length; i++)
					System.out.println(argArr[i]);
			}
		}
	}
}
