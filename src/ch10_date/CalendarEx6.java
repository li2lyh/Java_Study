package ch10_date;

import java.util.*;

public class CalendarEx6 {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage : java CalendarEx6 2015 9");
			return;
		}
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;

		Calendar sDay = Calendar.getInstance(); // 시작일
		Calendar eDay = Calendar.getInstance(); // 끝일

		// 월의 경우 0부터 11까지의 값을 가지므로 1을 뺴주어야 함
		// 예를 들어 , 2015년 11월 1일은 sDay.set(2015, 10, 1);과 같이 해줘야 함
		sDay.set(year, month - 1, 1);
		eDay.set(year, month, 1);

		// 다음달의 첫날에서 하루를 빼면 현재달의 마지막 날이 됨
		// 12월 1일에서 하루를 빼면 11월 30일이 됨
		eDay.add(Calendar.DATE, -1);

		// 첫번쨰 요일이 무슨 요일인지 알아냄
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);

		// eDay에 지정된 날짜를 얻어옴
		END_DAY = eDay.get(Calendar.DATE);

		System.out.println("      " + args[0] + "년 " + args[1] + "월");
		System.out.println(" SU MO TU WE TH FR SA");

		// 해당 월의 1일이 어느요일인지에 따라서 공백을 출력
		// 만일 1일이 수요일이라면 공백을 세번 찍음(일요일부터 시작)
		for (int i = 1; i < START_DAY_OF_WEEK; i++) {
			System.out.print("   ");
		}
		for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.print((i < 10) ? "  " + i : " " + i);
			if (n % 7 == 0)
				System.out.println();
		}
	}
}