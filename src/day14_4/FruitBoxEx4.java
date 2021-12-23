package day14_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit{
	String name;
	int weight;
	
	public Fruit(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String toString() {return name+ "(" + weight + ")";}
}

class Apple extends Fruit{
	public Apple(String name, int weight) { 
		super(name, weight);
	}
}

class Grape extends Fruit{
	public Grape(String name, int weight) {
		super(name,weight);
	}
}

class AppleComp implements Comparator<Apple>{
	@Override
	public int compare(Apple o1, Apple o2) {
		return o2.weight = o1.weight;
	}
}

class GrapeComp implements Comparator<Grape>{
	@Override
	public int compare(Grape o1, Grape o2) {
		return o1.weight - o2.weight;
	}
}

class FruitComp implements Comparator<Fruit>{
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.weight - o2.weight;
		
		// Apple�� �������� Grape�� ��������
//		if(o1 instanceof Apple && o2 instanceof Apple) {
//			return o2.weight - o1.weight;
//		}else if (o1 instanceof Grape && o2 instanceof Grape){
//			return o1.weight - o2.weight;
//		}
//		return -1;
	}
}

public class FruitBoxEx4 {
	public static void main(String[] args) {
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
			
			appleBox.add(new Apple("GreenApple", 300));
			appleBox.add(new Apple("GreenApple", 100));
			appleBox.add(new Apple("GreenApple", 200));
			
			grapeBox.add(new Grape("GreenGrape", 200));
			grapeBox.add(new Grape("GreenGrape", 400));
			grapeBox.add(new Grape("GreenGrape", 100));
			
//			System.out.println("== Apple ���� �� ==");
//			System.out.println("appleBox : " + appleBox);
//			Collections.sort(appleBox.getList(), new AppleComp());
//			System.out.println("== Apple ���� ��==");
//			System.out.println("appleBox : " + appleBox);
//			System.out.println();
//			System.out.println("== Grape ���� �� ==");
//			System.out.println("grapeBox : " + grapeBox);
//			Collections.sort(grapeBox.getList(),new GrapeComp());
//			System.out.println("== Grape ���� �� ==");
//			System.out.println("grapeBox : " + grapeBox);
//			System.out.println();
			
//			System.out.println("==Apple, Grape ���� �� ==");
//			System.out.println("appleBox : " + appleBox);
//			System.out.println("grapeBox : " + grapeBox);
//			Collections.sort(appleBox.getList(), new FruitComp());
//			Collections.sort(grapeBox.getList(), new FruitComp());
//			System.out.println("==Apple, Grape ���� �� ==");
//			System.out.println("appleBox : " + appleBox);
//			System.out.println("grapeBox : " + grapeBox);
			 
			// AppleComp, GrapeComp : Apple ��������, Grape�� ��������
			// FruitComp : �� �� ���� ����
			// FruitCompŬ������ �����ؼ�, Apple�� ��� ��������,
			// Grape�� ��� ���������� �ǵ��� ����
	}
}

class FruitBox<T extends Fruit> extends Box<T>{}

class Box<T>{
	ArrayList<T>list = new ArrayList<T>();
	
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



















