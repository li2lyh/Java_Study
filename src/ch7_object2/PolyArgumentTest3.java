package ch7_object2;

// Vector클래스를 사용하기 위해서 추가
import java.util.Vector;

class Product3 {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매시 제공하는 보너스 점수

	// 생성자
	Product3(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}

	// 기본 생성자
	Product3() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv6 extends Product3 {
	Tv6() {
		super(100);
	}

	public String toString() {
		return "Tv6";
	}
}

class Computer3 extends Product3 {
	Computer3() {
		super(200);
	}

	public String toString() {
		return "Computer3";
	}
}

class audio2 extends Product3 {
	audio2() {
		super(50);
	}

	public String toString() {
		return "audio2";
	}
}

class Buyer3 {
	int money = 1000; // 소유금액
	int bonusPoint = 0; // 보너스 점수
	Vector item = new Vector(); // 구입한 제품을 저장하는데 사용될 Vector 객체

	void buy(Product3 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p); // boolean add(Object c) - 메서드를 이용하여 객체를 추가
		System.out.println(p + "을/를 구입하였습니다.");
	}

	void refund(Product3 p) { // 구입한 제품을 환불
		if (item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}

	void summary() {
		int sum = 0; // 구입한 물건의 가격합계
		String itemList = ""; // 구입한 물품 목록

		if (item.isEmpty()) {// boolean isEmpty() - Vector가 비어있는지 검사
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}

		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만듦
		for (int i = 0; i < item.size(); i++) {
			Product3 p = (Product3) item.get(i); // Object get(int index) - 지정된 위치(index)의 객체를 반환
			sum += p.price;
			itemList += (i == 0) ? "" + p : "," + p;
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원 입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class PolyArgumentTest3 {
	public static void main(String[] args) {
		Buyer3 b = new Buyer3();
		Tv6 Tv6 = new Tv6();
		Computer3 com = new Computer3();
		audio2 audio2 = new audio2();

		b.buy(Tv6);
		b.buy(com);
		b.buy(audio2);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}