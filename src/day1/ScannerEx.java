package day1;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
	// Scanner Ŭ���� �̿�
	// ==> �Է��� �ޱ� ���� Ŭ�����̴�.
	
		Scanner sc = new Scanner(System.in);
//		System.out.print("���� ���ڸ� �Է� > ");
//		int num = sc.nextInt();
//		System.out.println("����ڷκ��� �Է¹��� ���� :" + num);
//		
//		System.out.print("�Ǽ� �Է� > ");
//		double dnum = sc.nextDouble();
//		System.out.println("����ڷκ��� �Է¹��� ����(�Ǽ�) : " + dnum);
		
		//���ڿ� �ޱ� ==> next(), nextLine()
//		System.out.print("���ڿ� �Է� > ");
//		String str = sc.next();
//		System.out.println("�Է¹��� ���ڿ� : " + str);
		
//		System.out.print("���ڸ� �Է��ϼ��� > ");
//		String str = sc.nextLine();
//		System.out.println("�Է¹��� ���� : " + str);
//		
//		int result = Integer.parseInt(str); // ���ڿ� -> ������ �ٲٴ� �޼ҵ�
//		result += 2;
//		System.out.println("result : " + result);
		
		String jumin = "020311-3456789";
		// index
		/*
		 * 		String str = "abc"
		 * 
		 * 				  a	 b	c
		 * 			index 0	 1	2	
		 */
		 
		char gender = jumin.charAt(7); 		// charAt(int index) ���ڿ����� Ư�� ��ġ�� ���ڸ� �����ϴ� �޼ҵ�
		System.out.println("gender : " + gender);
	}
}