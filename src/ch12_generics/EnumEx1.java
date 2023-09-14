package ch12_generics;

enum Direction {
	EAST, SOUTH, WEST, NORTH
}

public class EnumEx1 {
	public static void main(String[] args) {
		// 열거형 생성, 초기화
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");

		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		System.out.println("d3=" + d3);

		System.out.println("d1==d2 ? " + (d1 == d2)); // '=='연산자 이용해 비교
		System.out.println("d1==d3 ? " + (d1 == d3));
		System.out.println("d1.equals(d3) ? " + d1.equals(d3)); // equals()메소드 이용해 비교
//      System.out.println("d1 > d3 ? " + d1 > d3);              // '<', '>'연산자 사용불가
		System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2))); // 왼쪽이 크면 양수, 오른쪽이 크면 음수반환

		switch (d1) {
		case EAST: // switch-case문에서는 상수명만 사용 가능
			System.out.println("The Direction is EAST.");
			break;
		case SOUTH:
			System.out.println("The Direction is SOUTH.");
			break;
		case WEST:
			System.out.println("The Direction is WEST.");
			break;
		case NORTH:
			System.out.println("The Direction is NORTH.");
			break;
		default:
			System.out.println("Invalid direction.");
			break;
		}

		Direction[] dArr = Direction.values(); // 열거형의 모든 상수를 배열로 담아 반환

		for (Direction d : dArr) {
			System.out.printf("%s=%d\n", d.name(), d.ordinal()); // 열거형 상수 이름과, 정의된 순서를 반환
		}
	}

}
