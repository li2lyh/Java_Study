package ch7_object2;

class CastingTest2 {
	public static void main(String[] args) {
		Car car = new Car(); // Car car = new FireEngine();으로 변경하면 에러발생
		Car car2 = null;
		FireEngine fe = null;

		car.drive();
		fe = (FireEngine) car; // 조상타입의 인스턴스를 자손타입의 참조변수로 참조하는 것은 허용X, 컴파일은 Ok. 실행시 오류
		car2 = fe;
		car2.drive();

	}
}