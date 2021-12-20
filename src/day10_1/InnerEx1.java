package day10_1;

public class InnerEx1 {
	
	class InstanceInner{
		int iv = 100;
//		static int cv = 100; 인스턴스클래스내부에 static변수를 선언할 수 없다.
		final static int CONST = 100; // final static은 상수이므로 허용
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200; // static클래스만 static멤버를 정의 할 수 있다.
	}
	
	void method () {
		class LocalInner{ // 내부클래스는 static을 붙일 수 없다.
			int iv = 300;
//			static int cv1 = 300;
			final static int COST = 300;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(InnerEx1.InstanceInner.CONST);
		System.out.println();
		System.out.println(StaticInner.cv);
		System.out.println(InnerEx1.StaticInner.cv);
		
	}
}










