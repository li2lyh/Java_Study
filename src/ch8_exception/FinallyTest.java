package ch8_exception;

public class FinallyTest {
	public static void main(String[] args) {
		try {
			startInstall(); // 프로그램 설치에 필요한 준비
			copyFiles(); // 파일들을 복사
			deleteTempFiles(); // 프로그램 설치에 사용된 임시파일들을 삭제
		} catch (Exception e) {
			e.printStackTrace();
			deleteTempFiles(); // 프로그램 설치에 사용된 임시파일들을 삭제
		} 
	} 

	static void startInstall() { /* 프로그램 설치에 필요한 준비를 하는 코드를 작성 */ }
	static void copyFiles() { /* 파일들을 복사하는 코드를 작성 */ }
	static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 작성 */
	}
}
