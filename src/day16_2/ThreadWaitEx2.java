package day16_2;

import java.util.ArrayList;

public class ThreadWaitEx2 {
	public static void main(String[] args) throws Exception {
		Table table = new Table(); // ���� �����尡 �����ϴ°�ü
		
		new Thread(new Cook(table), "COOK1").start(); //�丮 �߰��ϴ� ������ 
		new Thread(new Customer(table, "donut"), "CUST1").start(); // donut�� �������� ������
		new Thread(new Customer(table,"burger"), "CUST2").start();; // burger�� �������� ������
		
		Thread.sleep(10000);
		System.exit(0);
	}
}

class Table{
	String[] dishNames = { "donut","donut","burger"}; // donut�� �� ���ֳ��´�.
	final int MAX_FOOD = 6; // ���̺� ���� �� �ִ� �ִ� ���� ����
	
	private ArrayList<String> dishes = new ArrayList<String>();
	
	public synchronized void add(String dish) { //���� �߰� �޼ҵ�
		if(dishes.size() >= MAX_FOOD) {	// ���̺� ������ ���� á���� ���̺� ������ �߰����� �ʴ´�.
			return;
		}
		dishes.add(dish);
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public boolean remove(String dishName) { // ������ �������� �޼ҵ�
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

class Cook implements Runnable{ //������ �߰��ϴ� �޼ҵ�
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
 * [�� �ڵ忡�� �߻��� �� �ִ� ����}
 * 1. ConcurrentModificationException
 * 		�丮�� �����尡 ���̺� ������ ���� ���߿� �Ҵ� �����尡 ������ �������� �߱� ������ �߻��ϴ� ����
 * 2. IndexOutOfBoundsException
 * 		�մԾ����尡 ���̺��� ������ ������ ���������� ���߿� �ٸ� �մ� �����尡 ���� ������ ����ä�� ���
 */


