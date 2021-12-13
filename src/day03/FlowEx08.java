package day03;

public class FlowEx08 {
	public static void main(String[] args) {
		// 1부터 100 까지의 합
		
		int sum = 0;
		
		for (int i  = 1; i <= 100; i++) {
			sum +=i; // sum = sum + i;
		}
		System.out.println("최종 값 : " + sum);
	}
}
