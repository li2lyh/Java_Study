package ch9_package;

public class ToStringTest {
	public static void main(String[] args) {
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();

		System.out.println(str);
		// String클래스의 toString()은 문자열을 반환하도록 오버라이딩되어 있음
		System.out.println(str.toString()); 
		System.out.println(today);
		// Date클래스의 경우 Date인스턴스가 갖고 있는 날짜와 시간을 문자열로 변환하여 반환하도록 오버라이딩되어 있음
		System.out.println(today.toString()); 
	}
}
