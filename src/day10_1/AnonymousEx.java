package day10_1;


public class AnonymousEx {
	// 첫번쨰 활용
	public static void main(String[] args) {
		AnonymousTest at = new A();
		AnonymousTest at1 = new AnonymousTest() {
			@Override
			public void method() {
				System.out.println("anonymousTest");
			}
		};
		at1.method();
		
		// 두번째 활용
		C c = new C();
//		c.parameter(new A());
		c.parameter(new AnonymousTest() {
			@Override
			public void method() {
				System.out.println("C Class");
			}
		});
		
		// 세번째 활용
		B b = new B();
		b.method();
		
		B b1 = new B() {
			@Override
			public void method() {
				System.out.println("Overrided method()");
			}
		};
		b1.method();
	}
}

interface AnonymousTest{
	void method();
}

class A implements AnonymousTest{
	@Override
	public void method() {
		System.out.println("A Class");
	}
}

class B {
	public void method() {
		System.out.println("B Class");
	}
}

class C {
	void parameter(AnonymousTest a) { 
		a.method();
	}
}