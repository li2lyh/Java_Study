package ch7_object2;

class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();

		Marine marine = new Marine();
		SCV scv = new SCV();

		scv.repair(tank);
		scv.repair(dropship);
//		scv.repair(marine); // reparable 인스턴스를 구현하지 않아 에러
	}
}

interface Repairable { }

class Unit2 {
	int hitPoint;
	final int MAX_HP;

	Unit2(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit2 extends Unit2 {
	GroundUnit2(int hp) {
		super(hp);
	}
}

class AirUnit2 extends Unit2 {
	AirUnit2(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit2 implements Repairable {
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit2 implements Repairable {
	Dropship() {
		super(125);
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit2 implements Repairable {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Marine";
	}
}

class SCV extends GroundUnit2 implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) {
		if (r instanceof Unit2) {
			Unit2 u = (Unit2) r;
			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
}
