package day03;

public class OperatorEx4 {
	public static void main(String[] args) {
		//��Ʈ����
		int x = 8;		//	00001000
		int y = 5;		//	00000101	&
						//  --------
		
		System.out.println("x�� 2������ ��ȯ�� ��� : " + Integer.toBinaryString(x));
		System.out.println("y�� 2������ ��ȯ�� ��� : " +Integer.toBinaryString(y));
		
		// AND : �� ��Ʈ ��� 1�̾�� 1
		System.out.println("x�� y�� &(AND)���� ��� : " + (x&y));
		// OR : ���� �ϳ��� 1�̸� 1
		System.out.println("x�� y�� |(OR)���� ��� : " +(x|y));
		// XOR : �� ��Ʈ�� ���� �ٸ��� 1
		System.out.println("x�� y�� ^(XOR)���� ��� : " + (x^y));
		
	}
}