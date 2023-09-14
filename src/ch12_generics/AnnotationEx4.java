package ch12_generics;

import java.util.Arrays;

class MyArrayList<T> {
	T[] arr;

	@SafeVarargs // unchecked경고 억제
	@SuppressWarnings("varargs") // varargs경고 억제, 이 애노테이션으로 unchecked를 억제하려면 선언,호출부분에 선언해야함
	MyArrayList(T... arr) { // 가변인자
		this.arr = arr;
	}

	@SafeVarargs
//  @SuppressWarnings("unchecked")
	public static <T> MyArrayList<T> asList(T... a) {
		return new MyArrayList<>(a);
	}

	public String toString() {
		return Arrays.toString(arr);
	}
}

public class AnnotationEx4 {
//  @SuppressWarnings("unchecked")    
	public static void main(String[] args) {
		MyArrayList<String> list = MyArrayList.asList("1", "2", "3");
		System.out.println(list);
	}
}
