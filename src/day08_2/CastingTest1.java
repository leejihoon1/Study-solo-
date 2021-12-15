package day08_2;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		fe.water();
		car = fe; // car = (car)fe; 에서 형변환이 생략된것이다.
//		car.water(); Car타입의 참조변수는 water()를 호출할 수 없다.
		fe2 = (FireEngine)car;
		fe2.water();
		System.out.println(car);
		System.out.println(fe);
		System.out.println(fe2);
	}
}
