package ch9_package;

class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}

public class CardToString {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();

		// Object클래스로부터 상속ㄱ받은 toString()을 오버라이딩하지 않았기에
		// Object클래스의 toString()이 호출됨
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
