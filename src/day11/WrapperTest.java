package day11;

public class WrapperTest {
	public static void main(String[] args) {
//		System.out.println("Hello".equals(20));
		
		//�ڽ�
		Integer obj = new Integer(20); // ������
		obj = (Integer)20;			   // �Ź���
		
		//��ڽ�
		int data = obj.intValue();
		Double obj2 = (Double)10.24;
		obj2.doubleValue();
		
		System.out.println(obj);
	}
}
