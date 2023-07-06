package ch9_package;

import java.util.StringJoiner;

public class StringEx4 {
	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr = animals.split(","); // 문자열을 ',' 구분자로 나눠서 배열에 저장

		System.out.println(String.join("-", arr)); // 배열의 문자열을 '-'로 구분해서 결합

		StringJoiner sj = new StringJoiner("/", "[", "]");
		for (String s : arr)
			sj.add(s);

		System.out.println(sj.toString());
	}
}
