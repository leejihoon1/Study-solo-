package day03;

public class FlowEx15 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
	
		while(true) {
			// ������ (sum)�� 100�� ������ �ݺ��� ����
			if (sum > 100) {
				break;
			}
			
			i++;
			sum +=i;
		}
		int sum1 = 0;
		for(int j = 0; j <=14; j++) {
			sum1 += j;
		}
		System.out.println("sum1 : " + sum1);
		System.out.println("���� i�� : " + i);
		System.out.println("���� sum�� : " + sum);
		
	}
}
