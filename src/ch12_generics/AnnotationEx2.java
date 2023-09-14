package ch12_generics;

import java.util.ArrayList;

class NewClass {
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

public class AnnotationEx2 {
	public static void main(String[] args) {
		NewClass nc = new NewClass();

		nc.oldField = 10; // @Deprecated가 붙은 대상 사용, 경고발생
		System.out.println(nc.getOldField()); // @Deprecated가 붙은 대상 사용, 경고발생
	}
}
