package day10_1;

public class ExceptionEx3 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i = 0; i < 20; i++) { 
			try {
				result = number / (int)(Math.random () * 10); 
				System.out.println("result: " +result );
//			}catch ( ArithmeticException();
			} catch (Exception e) {
				System.out.println("0���� ������ ���ܰ� �߻��߽��ϴ�");
			}

		}
		
		System.out.println("for���� ���������� ����Ǿ����ϴ�.");
	}
}
