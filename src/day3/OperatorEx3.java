package day3;

public class OperatorEx3 {
	public static void main(String[] args) {
		boolean power = false;
		
		System.out.println("power: " + power);		//	false
		
		power = !power;
		System.out.println("power : " + power);		// true
		
		power = !power;
		System.out.println("power : " + power); 	// false
		
		System.out.println("power : " + !power);	//	true
		System.out.println("powre : " + power);		//	false
		
		if (!power) {
			//조건식이 참이어야 실행될 문장
			System.out.println("if문 내부");
		}
	}
}
