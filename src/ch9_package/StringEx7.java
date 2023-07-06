package ch9_package;

public class StringEx7 {
	public static void main(String[] args) throws Exception {
		String fullName = "Hello.java";

		// fullName에서 .의 위치 찾음
		int index = fullName.indexOf('.');

		// fullName의 첫번째 글자부터 .이 있는 곳까지 문자열 추출
		String fileName = fullName.substring(0, index);

		// .의 다음 문자부터 시작해서 문자열의 끝까지 추출
		String ext = fullName.substring(index + 1);

		System.out.println(fullName + "의 확장자를 제외한 이름은 " + fileName);
		System.out.println(fullName + "의 확장자는 " + ext);
	}
}
