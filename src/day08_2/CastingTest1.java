package day08_2;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		fe.water();
		car = fe; // car = (car)fe; ���� ����ȯ�� �����Ȱ��̴�.
//		car.water(); CarŸ���� ���������� water()�� ȣ���� �� ����.
		fe2 = (FireEngine)car;
		fe2.water();
		System.out.println(car);
		System.out.println(fe);
		System.out.println(fe2);
	}
}
