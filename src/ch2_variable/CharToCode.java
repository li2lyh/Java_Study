package ch2_variable;
public class CharToCode {
	public static void main(String[] args) {
		char ch = 'A';
		int code = (int) ch; // 형변환
		
		System.out.printf("%c=%d(%#X)%n", ch, code, code);
		
		char hch = '가';
		System.out.printf("%c=%d(%#X)%n", ch, (int)hch,(int)hch);
	}

}
