package ch7_object2;

class PointTest2 {
	public static void main(String[] args) {
		Point4D p4 = new Point4D();
		System.out.println("p4.x = " + p4.x);
		System.out.println("p4.y = " + p4.y);
		System.out.println("p4.z = " + p4.z);
	}
}

class Point3 {
	int x = 10;
	int y = 20;

	Point3(int x, int y) {
		// 컴파일러가 자동으로 'super();'를 삽입
		// 조상인 Object클래스의 기본생성자인 'Object();'를 호출
		this.x = x;
		this.y = y;
	}
}

class Point4D extends Point3 {
	int z = 30;

	// 생성자
	Point4D() {
		this(100, 200, 300); // 같은클래스내의 생성자를 호출 즉, Point4D(int x, int y, int z)를 호출
	}

	Point4D(int x, int y, int z) {
		super(x, y); // 조상클래스의 생성자를 호출 즉, Point(int x, int y) 호출
		this.z = z; // 생성자의 매개변수로 정의된 지역변수 z를 인스턴스변수에 대입하기 위해 this.z로 중복된 이름의 변수를 구분
	}
}