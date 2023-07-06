package ch9_package;

public class HashCodeEx1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode()); // String클래스는 문자열의 내용이 같으면
		System.out.println(str2.hashCode()); // 동일한 해시코드를 반환하도록 hashCode메서드가 오버라이딩되어 있음
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}
