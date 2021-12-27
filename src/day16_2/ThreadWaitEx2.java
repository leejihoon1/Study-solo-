package day16_2;

import java.util.ArrayList;

public class ThreadWaitEx2 {
	public static void main(String[] args) throws Exception {
		Table table = new Table(); // 여러 쓰레드가 공유하는객체
		
		new Thread(new Cook(table), "COOK1").start(); //요리 추가하는 쓰레드 
		new Thread(new Customer(table, "donut"), "CUST1").start(); // donut을 가져가는 쓰레드
		new Thread(new Customer(table,"burger"), "CUST2").start();; // burger를 가져가는 쓰레드
		
		Thread.sleep(10000);
		System.exit(0);
	}
}

class Table{
	String[] dishNames = { "donut","donut","burger"}; // donut이 더 자주나온다.
	final int MAX_FOOD = 6; // 테이블에 놓을 수 있는 최대 음식 개수
	
	private ArrayList<String> dishes = new ArrayList<String>();
	
	public synchronized void add(String dish) { //음식 추가 메소드
		if(dishes.size() >= MAX_FOOD) {	// 테이블에 음식이 가득 찼으면 테이블에 음식을 추가하지 않는다.
			return;
		}
		dishes.add(dish);
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public boolean remove(String dishName) { // 음식을 가져가는 메소드
		synchronized (this) {
			while(dishes.size() == 0) {
				String name = Thread.currentThread().getName();
				System.out.println(name + " is waiting");
				try { Thread.sleep(500);} catch (InterruptedException e) {}
			}
		}
		
		for(int i =0; i < dishes.size(); i++) {
			if(dishName.equals(dishes.get(i))){
				dishes.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public int dishNum() {return dishNames.length;}
}

class Cook implements Runnable{ //음식을 추가하는 메소드
	private Table table;
	
	public Cook(Table table) {this.table = table;}
	
	@Override
		public void run() {
		while(true) {
			int idx = (int)(Math.random()* table.dishNum()); // 0 <=idx <= 2 ==> 0, 1, 2
			table.add(table.dishNames[idx]);
			
			try {Thread.sleep(100);} catch (InterruptedException e) {}
		}
	}
}

class Customer implements Runnable{
	private Table table;
	private String food;
	
	public Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}
	
	@Override
	public void run() {
		while(true) {
			try { Thread.sleep( 10 );} catch (InterruptedException e) { }
			String name = Thread.currentThread().getName();
			if(eatFood()) {
				System.out.println(name + " ate a " + food);
			}else {
				System.out.println(name + " failed to eat.");
			}
		}
	}
	
	boolean eatFood() { return table.remove(food); }
}

/*
 * [위 코드에서 발생할 수 있는 오류}
 * 1. ConcurrentModificationException
 * 		요리가 쓰레드가 테이블에 음식을 놓는 도중에 소님 쓰레드가 음식을 가져가려 했기 때문에 발생하는 예외
 * 2. IndexOutOfBoundsException
 * 		손님쓰레드가 테이블의 마지막 음식을 가져가려는 도중에 다른 손님 쓰레드가 먼저 음식을 낚아채는 경우
 */


