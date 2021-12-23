package day14_2;

import java.util.ArrayList;

interface Eatable{}

class Fruit implements Eatable{
	@Override
	public String toString() { return "Fruit";}
}

class Apple extends Fruit{
	@Override
	public String toString() {return "Apple";}
	}

class Grape extends Fruit{
	@Override
	public String toString() { return "Grape";}
}

class Toy {
	@Override
	public String toString() { return "Toy";}
}

public class FruitBoxEx2 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
//		FruitBox<Grape> grapeBox2 = new FruitBox<Apple>();  // 에러
//		FruitBox<Fruit> fruitBox2 = new FruitBox<Apple>(); //  에러
//		FruitBox<Toy> toyBox = new fruitBox<Toy>(); 에러  Fruit에도 Eatable에도 적용이안댐
		
		fruitBox.add(new Fruit()); // Fruit item = new Fruit();
		fruitBox.add(new Apple()); // Fruit item = new Apple();
		fruitBox.add(new Grape()); // Fruit item = new Grape();
		
		appleBox.add(new Apple()); // Apple item = new Apple();
//		appleBox.add(new Grape()); // 에러 -> Apple item = new Grape();
		
		grapeBox.add(new Grape()); // Grape item = new Grape();
		
		System.out.println("fruitBox : " + fruitBox);
		System.out.println("appleBox : " + appleBox);
		System.out.println("grapeBox : " + grapeBox);
	}
}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

class Box<T>{
	ArrayList<T> list = new ArrayList<>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	int size() {
		return list.size();
	}
	
	@Override
	public String toString() {return list.toString();}	
}







