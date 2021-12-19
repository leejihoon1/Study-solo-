package day09_1;

public class InterfaceTest2 {
	public static void main(String[] args) {
		A1 a = new A1();
		a.methodA();
	}
}

interface I1{
	void methodB();
}

class B1 implements I1{
	@Override
	public void methodB() {
		System.out.println("methodB() in B Class");
	}
	
	@Override
	public String toString() {
		return "Class B1";
	}
}

class C1 implements I1{
	@Override
	public void methodB() {
		System.out.println("methodB() in C Class");
	}
	@Override
	public String toString() {
		return "Class C1";
	}
}

class InstanceMamager{
	public static I1 getInstance() { 
		return new B1(); // new B1():
	}
}

class A1{
	void methodA() {
		I1 i = InstanceMamager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}





