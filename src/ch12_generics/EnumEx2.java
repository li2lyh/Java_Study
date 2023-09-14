package ch12_generics;

enum Direction2 {
	EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

	private static final Direction2[] DIR_ARR = Direction2.values(); // 배열로 반환
	private final int value;
	private final String symbol;

	// 생성자
	Direction2(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}

	public int getValue() {
		return value;
	}

	public String getSymbol() {
		return symbol;
	}

	public static Direction2 of(int dir) {
		if (dir < 1 || dir > 4) {
			throw new IllegalArgumentException("Invalid value :" + dir);
		}
		return DIR_ARR[dir - 1];
	}

	// 방향을 회전시키는 메소드, 90도씩 회전
	public Direction2 rotate(int num) {
		num = num % 4;
		if (num < 0)
			num += 4;
		return DIR_ARR[(value - 1 + num) % 4];
	}
}

public class EnumEx2 {
	public static void main(String[] args) {
		for (Direction2 d : Direction2.values())
			System.out.printf("%s=%d, %s\n", d.name(), d.getValue(), d.getSymbol());

		Direction2 d1 = Direction2.EAST; // 열거형의 참조변수에 EAST값 넣어줌
		Direction2 d2 = Direction2.valueOf("WEST"); // 열거형의 참조변수에 WEST값 넣어줌

		System.out.printf("d1=%s, %d, %s\n", d1.name(), d1.getValue(), d1.getSymbol());
		System.out.printf("d2=%s, %d, %s\n", d2.name(), d2.getValue(), d2.getSymbol());
		System.out.println(Direction2.SOUTH.rotate(1));
		System.out.println(Direction2.SOUTH.rotate(2));
		System.out.println(Direction2.SOUTH.rotate(3));
		System.out.println(Direction2.SOUTH.rotate(4));
		System.out.println(d1.rotate(3));
	}
}