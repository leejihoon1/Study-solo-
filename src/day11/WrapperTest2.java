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
		//�⺻�ڷ����� data2�� �ڽ����ְ� �Ǹ� Integer ��ü�� ��ȭ�ȴ�.
		//��ĳ������ ���� �ʾƵ� ��ü�� �ѱ��� ���� ������ f()�� ȣ��ǰ� �ȴ�.
		Test1.f((Integer)data2);
		
		Object[] arr = {10, 'A', "String", 10.204, true};
	}
}
class Test1{
	static void f(int data) {
		System.out.println("�⺻ �ڷ������� ȣ���� f()");
	}
//	static void f(Integer obj) {
//		System.out.println("Ŭ���� Ÿ������ ȣ���� f()");
//	}
	
	//ObjectŸ���� �Ű������� ��¡�� �ǹ�
	//������ �Ѱܶ�! Ȥ�� ��ü�� �Ѱܶ�!
	static void f(Object obj) {
		System.out.println("Object Ÿ������ ȣ���� f()");
	}
}



