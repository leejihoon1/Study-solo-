package day10_1;

public class InnerEx4 {
	public static void main(String[] args) {
		//�ν��Ͻ�Ŭ������ �ν��ͽ��� �����Ϸ��� �ܺ�Ŭ������ �ν��Ͻ��� ���� �����ؾ� �Ѵ�.
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		System.out.println("ii.iv : " + ii.iv);
		
		//static ����Ŭ������ �ν��Ͻ��� �ܺ�Ŭ������ ���� �������� �ʾƵ� �ȴ�.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv : " + si.iv);
		System.out.println("si.cv : " + si.cv);
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);
	}
}

class Outer{
int value = 10;
	
	class InstanceInner{
		int iv = 100;
		int value = 20;
		
		void method() {
			int value = 30;
			System.out.println("value : " + value);							// 30
			System.out.println("this.value : " + this.value);				// 20
			System.out.println("Outer.this.value : " + Outer.this.value);	// 10
		}
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner{
			int iv =400;
		}
	}
}