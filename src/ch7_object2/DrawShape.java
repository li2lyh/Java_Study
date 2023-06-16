package ch7_object2;

class DrawShape {
	public static void main(String[] args) {
		Point[] p = { new Point(100, 100), new Point(140, 50), new Point(200, 100) };
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150, 150), 50);

		t.draw(); // 삼각형을 그린다
		c.draw(); // 원을 그린다
	}
}

class Shape {
	String color = "black";

	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	Point() {
		this(0, 0); // Point(int x, int y)로 초기화. 클래스 내의 다른 생성자를 호출하느라 this 사용
	}

	String getXY() {
		return "(" + x + "," + y + ")"; // x와 y의 값을 문자열로 반환
	}
}

class Circle extends Shape { // 상속관계
	Point center; // 포함관계
	int r;

	Circle() {
		this(new Point(0, 0), 100); // Circle(Point center, int r)를 호출
	}

	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	void draw() {
		System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape {
	Point[] p = new Point[3];

	Triangle(Point[] p) {
		this.p = p;
	}

	void draw() {
		System.out.printf("[p1=%s,p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}
