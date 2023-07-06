package ch9_package;

import java.util.StringTokenizer;

public class StringTokenizerEx5 {
	public static void main(String[] args) {
		String data = "100,,,200,300";

		String[] result = data.split(",");
		StringTokenizer st = new StringTokenizer(data, ",");

		// split()은 빈 문자열도 토큰으로 인식
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i] + "|");

		System.out.println("개수 :" + result.length);

		int i = 0;
		// StringTokenizer는 빈 문자열을 토큰으로 인식X
		for (; st.hasMoreTokens(); i++)
			System.out.print(st.nextToken() + "|");

		System.out.println("개수 :" + i);
	}
}
