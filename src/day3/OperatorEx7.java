package day3;

public class OperatorEx7 {
	public static void main(String[] args) {
		//복합대입 연산자
		int result = 0;
		
		result += 10;	//	 result = result + 10;
		System.out.println("result :" + result); // 10
		 
		result -= 5;
		System.out.println("result : " + result); //5
		
		result *= 5;
		System.out.println("result : " + result); //25
		
		result /= 5;
		System.out.println("result : " + result); // 5
		
		result %= 5;
		System.out.println("result : " + result); // 0
		
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum +=i;
		}
		System.out.println("sum: " + sum);
	}
}