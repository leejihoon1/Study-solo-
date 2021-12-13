package day03;

import java.util.Scanner;

public class FlowEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나를 입력하세요 > " );
		int num = sc.nextInt();
		
		switch(num) { 
			case 1:
				System.out.println("num는 1입니다.");
				break;
			case 2:
				System.out.println("num는 2입니다.");
				break;
			case 3:
				System.out.println("num는 3입니다.");
				break;
			default:
				System.out.println("num는 1, 2, 3이 아닙니다.");
		}
	}
}
