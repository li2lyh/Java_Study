package ch10_date;

import java.text.*;

public class ChoiceFormatEx1 {
	public static void main(String[] args) {
		double[] limits = { 60, 70, 80, 90 }; // 낮은 값부터 큰 값의 순서로 적어야 함
		// limits, grades간의 순서와 개수를 맞추어야 함
		String[] grades = { "D", "C", "B", "A" };

		int[] scores = { 100, 95, 88, 70, 52, 60, 70 };

		ChoiceFormat form = new ChoiceFormat(limits, grades);

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + " : " + form.format(scores[i]));
		}
	}
}
