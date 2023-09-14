package ch12_generics;

enum Transportation {
	// 열거형 상수, 추상메소드를 구현
	BUS(100) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	TRAIN(150) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	SHIP(100) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	AIRPLANE(300) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	};

	// 열거형 상수의 값에 대한 변수, protected로 해야 각 상수에서 접근가능
	protected final int BASIC_FARE;

	// 열거형 상수의 값에 대한 생성자
	Transportation(int basicFare) {
		BASIC_FARE = basicFare;
	}

	public int getBasicFare() {
		return BASIC_FARE;
	}

	// 추상메소드, 거리에 따른 요금 계산
	abstract int fare(int distance);
}

public class EnumEx3 {
	public static void main(String[] args) {
		// 거리 100에 대한 각 열거형 상수들의 요금계산
		System.out.println("bus fare=" + Transportation.BUS.fare(100));
		System.out.println("train fare=" + Transportation.TRAIN.fare(100));
		System.out.println("ship fare=" + Transportation.SHIP.fare(100));
		System.out.println("airplane fare=" + Transportation.AIRPLANE.fare(100));
	}
}