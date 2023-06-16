package ch7_object2;

import java.util.Objects;

public class InstanceofTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();

		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}

		if (fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}

		if (fe instanceof Object) {
			System.out.println("This is an Object instance.");
		}

		System.out.println(fe.getClass().getName()); // 클래스의 이름을 출력
	}
}

class Car2 { }

class FireEngine2 extends Car2 { }