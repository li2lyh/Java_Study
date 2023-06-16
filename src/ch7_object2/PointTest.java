package ch7_object2;

class Point2Test {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);
		System.out.println(p3.getLocation());
	}
}

class Point2 {
	int x;
	int y;

	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x:" + x + ", y:" + y;
	}
}

class Point3D extends Point2 {
	int z;

	Point3D(int x, int y, int z) {
		// 컴파일러가 자동으로 'super();'를 삽입
		// Point2()가 존재하지 않아 에러 발생
		super(x,y); // 에러가 나 추가한 코드
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// 오버라이딩
	String getLocation() {
		return "x:" + x + ", y:" + y + ", z:" + z;
	}
}
