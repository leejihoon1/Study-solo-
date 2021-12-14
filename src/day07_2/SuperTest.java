package day07_2;

public class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.method2();
	}
}

class Parent{
	int x = 10;
	int y = 20;
}

class Child extends Parent{
	int y = 30;
	void method() {
		System.out.println("x = " + x);			// 10 
		System.out.println("x = " + this.x);	// 10 
		System.out.println("x = " + super.x);	// 10 
	}
	
	void method2() {
		System.out.println("y = " + y);			// 30
		System.out.println("y = " + this.y);	// 30 
		System.out.println("y = " + super.y);	// 20
	}
}