package ch12_generics;

import java.util.ArrayList;

class Fruit {
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}

class Toy {
	public String toString() {
		return "Toy";
	}
}

public class FruitBoxEx1 {
	public static void main(String[] args) {

		Box<Fruit> fruitBox = new Box<>(); // Box<Fruit> fruitBox = new Box<Fruit>();와 같음
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
//      Box<Grape> grapeBox = new Box<Apple>(); // 에러, 타입불일치

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // ok, Apple은 Fruit의 자식이므로

		appleBox.add(new Apple());
		appleBox.add(new Apple());
//      appleBox.add(new Toy());    // 에러, 타입불일치 Box<Apple>엔 APPLE만 담을 수 있음

		toyBox.add(new Toy());
//      toyBox.add(new Apple());    // 에러, 타입불일치 Box<Toy>엔 APPLE만 담을 수 없음

		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}
}

class Box<T> {
	ArrayList<T> list = new ArrayList<>(); // ArrayList<T> list = new ArrayList<T>();와 같음

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}
