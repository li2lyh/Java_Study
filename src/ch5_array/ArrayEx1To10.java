package ch5_array;

import java.util.*;

public class ArrayEx1To10 {
	public static void main(String[] args) {
		
/*		// ArrayEx1
		int[] score = new int[5];
		int k = 1;

		score[0] = 50;
		score[1] = 60;
		score[k + 1] = 70;
		score[3] = 80;
		score[4] = 90;

		int tmp = score[k + 2] + score[4];

		for (int i = 0; i < 5; i++) {
			System.out.printf("score[%d]:%d%n", i, score[i]);
		}
		System.out.printf("tmp:%d%n", tmp);
		System.out.printf("score[%d]:%d%n", 7, score[7]); // 인덱스 범위를 넘어난 값
		
		// ArrayEx2
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100,95,80,70,60};
		int[] iArr3 = { 100, 95, 80, 70, 60 };
		char[] chArr = { 'a', 'b', 'c', 'd' };

		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1; // 1~10 숫자를 배열에 넣음
		}
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 10) + 1; // 1~10 값을 저장
		}
		for (int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] + ","); // 배열 저장 값 출력
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
		
		// ArrayEx3
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; // 배열 초기화
		}
		System.out.println("[변경전]");
		System.out.println("arr.length:"+arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		// 두배로 배열을 늘림
		int[] tmp = new int[arr.length*2];
		
		 // 늘린 배열에 첫번째 배열 복사
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		arr = tmp; // tmp에 저장된 값을 arr에 저장
		
		System.out.println("[변경후]");
		System.out.println("arr.length:"+arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		} 
		
		// ArrayEx4
		// 배열의 복사 - System.arraycopy 이용
		// System.arraycopy(~로부터 복사할 배열이름, ~로부터 복사할 배열 인덱스, 복사한 배열을 붙여넣을 배열이름, 붙여넣을 배열의 시작 인덱스, 몇개를 붙여넣을지)
		char[] abc = { 'A', 'B', 'C', 'D' };
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		System.out.println(abc);
		System.out.println(num);

		// 배열 abc와 num을 붙여 하나의 배열로 만듦
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length); // abc[0]에서 result[0]으로 abc.length개의 데어터를 복사
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);

		// 배열 abc을 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num); 
		
		// ArrayEx5
		int sum = 0;
		float average = 0f;

		int[] score = { 100, 88, 100, 100, 90 };

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		average = sum / (float) score.length; // int간의 연산은 int결과를 얻기에 float으로 형변환

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average); 		
		
		// ArrayEx6
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0];
		int min = score[0];

		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min); 
		
		// ArrayEx7
		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
		} 
		
		// ArrayEx8
		int[] ball = new int[45];

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 4;
		}
		int temp = 0;
		int j = 0;

		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 10);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.printf("baa[%d]=%d%n", i, ball[i]);
		}
		
		// ArrayEx9
		int[] code = { -4, -1, 3, 6, 11 }; // 불연속적인 값들로 구성된 배열
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int tmp = (int) (Math.random() * code.length);
			arr[i] = code[tmp];
		}
		System.out.println(Arrays.toString(arr));*/
		
		// ArrayEx10
		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));
		}
		System.out.println();

		for (int i = 0; i < numArr.length; i++) {
			boolean changed = false;

			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) { // 옆의 값이 작으면 서로 바꿈
					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					changed = true; // 자리바꿈이 발생했으니 true로 변경
				}
			}
			if (!changed) break; // 자리변경 없으면 반복문 벗어남

			for (int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]);
			}
			System.out.println();
		}

	}

}
