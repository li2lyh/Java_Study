package ch12_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
class Fruit {
	String name;
	int weight;

	Fruit(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String toString() {
		return name + "(" + weight + ")";
	}
}

class Apple extends Fruit {
	Apple(String name, int weight) {
		super(name, weight);
	}
}

class Grape extends Fruit {
	Grape(String name, int weight) {
		super(name, weight);
	}
}

// 와일드카드 적용, Apple의 조상만 대입가능, Apple의 조상만 비교가능
class AppleComp implements Comparator<Apple> {
	@Override
	public int compare(Apple t1, Apple t2) {
		return t2.weight - t1.weight;
	}
}

// 와일드카드 적용, Grape의 조상만 대입가능, Grape의 조상만 비교가능 
class GrapeComp implements Comparator<Grape> {
	@Override
	public int compare(Grape t1, Grape t2) {
		return t2.weight - t1.weight;
	}
}

// 와일드카드 적용, Fruit의 조상만 대입가능, Fruit의 조상만 비교가능 ( Apple, Grape이 Fruit의 상속을 받으므로 ok )
class FruitComp implements Comparator<Fruit> {
	@Override
	public int compare(Fruit t1, Fruit t2) {
		return t1.weight - t2.weight;
	}
}

public class FruitBoxEx4 {
	public static void main(String[] args) {
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();

		appleBox.add(new Apple("GreenApple", 300));
		appleBox.add(new Apple("GreenApple", 100));
		appleBox.add(new Apple("GreenApple", 200));

		grapeBox.add(new Grape("GreenGrape", 400));
		grapeBox.add(new Grape("GreenGrape", 300));
		grapeBox.add(new Grape("GreenGrape", 200));

		// 첫번째 매개변수는 정렬대상, 두번째 매개변수는 정렬할 방법이 정의된 Comparator
		Collections.sort(appleBox.getList(), new AppleComp());
		Collections.sort(grapeBox.getList(), new GrapeComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println();
		Collections.sort(appleBox.getList(), new FruitComp());
		Collections.sort(grapeBox.getList(), new FruitComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
	}
}

//제네릭 클래스의 상속을 받고, 타입변수를 Fruit형의 자손만 대입가능하도록 제한
class FruitBox<T extends Fruit> extends Box<T> {
}

//제네릭 클래스
class Box<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	ArrayList<T> getList() {
		return list;
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}*/