package ch7_object2;

class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit)
			System.out.println("f는 Unit클래스의 자손입니다.");
		
		if (f instanceof Fighter)
			System.out.println("f는 Fighter인터페이스를 구현했습니다.");
		
		if (f instanceof Movable)
			System.out.println("f는 Movable인터페이스를 구현했습니다.");
		
		if (f instanceof Attackble)
			System.out.println("f는 Attackble인터페이스를 구현했습니다.");
		
		if (f instanceof Object)
			System.out.println("f는 Object클래스의 자손입니다.");
		
	}
}

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) { /* 내용생략 */ }
	public void attack(Unit u) { /* 내용생략 */ }
}

class Unit {
	int currentHp;
	int x;
	int y;
}

interface Fightable extends Movable, Attackble { }
interface Movable { void move(int x, int y); }
interface Attackble {void attack(Unit u); }