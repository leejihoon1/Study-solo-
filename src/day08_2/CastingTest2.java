package day08_2;

public class CastingTest2 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
//		fe = (FireEngine)car;  // 에러 FireEngine의 인스턴스변수는 5개 Car는 4개 그래서 에러남
	}
}
