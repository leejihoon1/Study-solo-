package day08_2;

public class CastingTest2 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
//		fe = (FireEngine)car;  // ���� FireEngine�� �ν��Ͻ������� 5�� Car�� 4�� �׷��� ������
	}
}