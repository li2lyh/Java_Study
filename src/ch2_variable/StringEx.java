package ch2_variable;
public class StringEx {
	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0;

		System.out.println(name);
		System.out.println(str);
		// 왼쪽에서 오른쪽으로 연산 수행
		// 한쪽이 String이면 나머지도 String으로 변환
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
	}
}
