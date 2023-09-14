package ch12_generics;

import java.util.ArrayList;

interface Eatable {
}
/*
class Fruit implements Eatable {
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

class FruitBox<T extends Fruit & Eatable> extends Box<T> {
}

public class FruitBoxEx2 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>(); // Fruit의 자손이므로 ok
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//      FruitBox<Grape> grapeBox = new FruitBox<Apple>();    // 에러, 타입불일치
//      FruitBox<Toy> toyBox = new FruitBox<Toy>();            // 에러, 타입불일치

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//      appleBox.add(new Grape());    // 에러, 타입불일치 grape는 apple의 자손이 아니라 add불가
		grapeBox.add(new Grape());

		System.out.println("fruitBox - " + fruitBox);
		System.out.println("appleBox - " + appleBox);
		System.out.println("grapeBox - " + grapeBox);
	}
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	public String toString() {
		return list.toString();
	}
}*/
