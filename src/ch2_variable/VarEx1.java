package ch2_variable;
public class VarEx1 {
	public static void main(String[] args) {
		// 변수의 초기화
		int year = 0;
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		// 대입연산은 우변 계산이 끝난 후 마지막에 수행
		year = age + 2000;
		age = age + 1;
		
		System.out.println(year);
		System.out.println(age);
	}
}
