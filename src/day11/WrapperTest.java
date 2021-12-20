package day11;

public class WrapperTest {
	public static void main(String[] args) {
//		System.out.println("Hello".equals(20));
		
		//冠教
		Integer obj = new Integer(20); // 备巩过
		obj = (Integer)20;			   // 脚巩过
		
		//攫冠教
		int data = obj.intValue();
		Double obj2 = (Double)10.24;
		obj2.doubleValue();
		
		System.out.println(obj);
	}
}
