package ch12_generics;

import java.util.ArrayList;

class NewClass2 {
	int newField;

	int getNewField() {
		return newField;
	}

	@Deprecated
	int oldField;

	@Deprecated
	int getOldField() {
		return oldField;
	}
}

public class AnnotationEx3 {
	@SuppressWarnings("deprecation") // deprecation관련 경고를 억제
	public static void main(String[] args) {
		NewClass2 nc = new NewClass2();

		nc.oldField = 10; // @Deprecated가 붙은 대상 사용, 경고발생
		System.out.println(nc.getOldField()); // @Deprecated가 붙은 대상 사용, 경고발생

		@SuppressWarnings("unchecked") // 지네릭스 관련 경고를 억제
		ArrayList<NewClass2> list = new ArrayList(); // 타입 지정x, 경고발생
		list.add(nc);
	}
}
