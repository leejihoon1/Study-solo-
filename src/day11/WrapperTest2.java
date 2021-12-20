package day11;

public class WrapperTest2 {
	public static void main(String[] args) {
		Integer data1 = 100;
		int data2 = 200;
//		
//		int result = data1 + data2;
//		System.out.println(result);
		
//		Test.f(data1);
//		Test.f(data2);
		
//		Test.f(data1.intValue());
//		Test.f((Integer)data2);
		
		Object obj = data1;
		Test1.f(obj);
		Test1.f(data1);
		//기본자료형인 data2를 박싱해주게 되면 Integer 객체로 변화된다.
		//업캐스팅을 하지 않아도 객체를 넘기라는 가장 마지막 f()가 호출되게 된다.
		Test1.f((Integer)data2);
		
		Object[] arr = {10, 'A', "String", 10.204, true};
	}
}
class Test1{
	static void f(int data) {
		System.out.println("기본 자료형으로 호출한 f()");
	}
//	static void f(Integer obj) {
//		System.out.println("클래스 타입으로 호출한 f()");
//	}
	
	//Object타입의 매개변수는 상징적 의미
	//모든것을 넘겨라! 혹은 객체를 넘겨라!
	static void f(Object obj) {
		System.out.println("Object 타입으로 호출한 f()");
	}
}



