package day1;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
	// Scanner 클래스 이용
	// ==> 입력을 받기 위한 클래스이다.
	
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 한자리 입력 > ");
//		int num = sc.nextInt();
//		System.out.println("사용자로부터 입력받은 숫자 :" + num);
//		
//		System.out.print("실수 입력 > ");
//		double dnum = sc.nextDouble();
//		System.out.println("사용자로부터 입력받은 숫자(실수) : " + dnum);
		
		//문자열 받기 ==> next(), nextLine()
//		System.out.print("문자열 입력 > ");
//		String str = sc.next();
//		System.out.println("입력받은 문자열 : " + str);
		
//		System.out.print("숫자를 입력하세요 > ");
//		String str = sc.nextLine();
//		System.out.println("입력받은 숫자 : " + str);
//		
//		int result = Integer.parseInt(str); // 문자열 -> 정수로 바꾸는 메소드
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
		 
		char gender = jumin.charAt(7); 		// charAt(int index) 문자열에서 특정 위치의 문자를 추출하는 메소드
		System.out.println("gender : " + gender);
	}
}