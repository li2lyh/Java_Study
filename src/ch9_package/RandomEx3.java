package ch9_package;

import java.util.*;

public class RandomEx3 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(getRand(5, 10) + ","); 
		}
		System.out.println();

		int[] result = fillRand(new int[10], new int[] { 2, 3, 7, 5 }); 

		System.out.println(Arrays.toString(result));
	}

	// arr배열에 from~to 사이의 난수값을 저장후 반환
	public static int[] fillRand(int[] arr, int from, int to) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = getRand(from, to);
		}
		return arr;
	}

	// data배열에 저장되어 있는 요소들을 랜덤으로 arr에 저장
	public static int[] fillRand(int[] arr, int[] data) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = data[getRand(0, data.length - 1)];
		}
		return arr;
	}

	// from~to 사이의 난수를 발생
	public static int getRand(int from, int to) {
		return (int) (Math.random() * (Math.abs(to - from) + 1)) + Math.min(from, to);
	}
}