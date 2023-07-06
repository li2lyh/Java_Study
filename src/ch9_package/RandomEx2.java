package ch9_package;

import java.util.*;

public class RandomEx2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] number = new int[100];
		int[] counter = new int[10];

		for (int i = 0; i < number.length; i++) {
//          System.out.print(number[i] = (int)(Math.random() * 10));
//          0 <= x < 10 범위의 정수 x를 반환
			System.out.print(number[i] = rand.nextInt(10));
		}
		System.out.println();

		for (int i = 0; i < number.length; i++)
			counter[number[i]]++; //

		for (int i = 0; i < counter.length; i++)
			System.out.println(i + "의 개수 :" + printGraph('#', counter[i]) + " " + counter[i]);
	}

	public static String printGraph(char ch, int value) {
		char[] bar = new char[value]; // counter[i]에 저장되어 있는 각 요소의크기만큼 char배열 생성

		for (int i = 0; i < bar.length; i++) // 생성된 배열의 크기만큼 '#'를 저장
			bar[i] = ch;

		return new String(bar); // 문자열로 반환
	}
}
