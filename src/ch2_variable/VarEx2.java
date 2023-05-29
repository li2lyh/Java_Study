package ch2_variable;
public class VarEx2 {
	public static void main(String[] args) {
		// 변수 값 교환
		int x =10, y = 20;
		int tmp = 0;

		System.out.println("x:" + x + "y" + y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x:" + x + "y" + y);		
	}
}
