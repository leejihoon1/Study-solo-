package day07_1;

public class Child extends Parent{
	public static void main(String[] args) {
		Child c= new Child();
		c.x = 10;
		c.y = 10;
		c.hello();
		System.out.println("c.x : " + c.x);
		System.out.println("c.y : " + c.y);
		

	}
	@Override
	void hello() {
		System.out.println("Child()�� hello() �޼ҵ��Դϴ�.");
	}
}

class Parent{
	int x;
	int y;
	
	void hello() {
		System.out.println("Parent�� hello() �޼ҵ��Դϴ�.");
	}
}