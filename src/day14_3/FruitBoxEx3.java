package day14_3;

import java.util.ArrayList;

class Fruit{
	@Override
	public String toString() { return "Fruit";}
	}

class Apple extends Fruit{
	@Override
	public String toString() { return "Apple";}
	} 

class Grape extends Fruit{
	@Override
	public String toString() {return "Grape";}
	}

class Juice{
	String name;
	
	public Juice(String name) {
		this.name = name + "Juice";
	}
	@Override
	public String toString() {return name;}
}

class Juicer{
//	// 1.���ϵ�ī�带 �̿��� �޼ҵ�
////	static Juice makeJuice(FruitBox<Fruit> box) {
//	static Juice makeJuice(FruitBox<? extends Fruit> box) {
//		String tmp = "";
//
//		// 1.���� for��	
////		for(Fruit f : box.getList()) {
////			tmp += f + " ";	
////		}
//		
//		// 2.�Ϲ����� for��
//		for(int i=0; i < box.getList().size(); i++) {
//			tmp += box.getList().get(i) + " ";
//		}
//		
//		return new Juice(tmp);
//	}
	// 2.���׸��޼ҵ�
	static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {
		String tmp = "";
		for(Fruit f : box.getList()) {
			tmp += f + " ";
		}
		return new Juice(tmp);
	}
}
public class FruitBoxEx3 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox= new FruitBox<>();
		FruitBox<Apple> appleBox= new FruitBox<>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
		
		
	}
}

class FruitBox<T extends Fruit> extends Box<T>{
}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	ArrayList<T> getList(){
		return list;
	}
	
	int size() {
		return list.size();
	}
	
	@Override
	public String toString() {return list.toString();}
}












