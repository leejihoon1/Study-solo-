package day10_1;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i = 0; i < 100; i++) { // �ݺ�Ƚ�� : 100��
			result = number / (int)(Math.random () * 10); // (int)(Math.random()*10) ���� : 0 ~ 9
			System.out.println("result: " +result );
			// ���ܹ߻� �ν��Ͻ� : new ArtimeticException();
		}
		
		System.out.println("for���� ���������� ����Ǿ����ϴ�.");
	}
}
