package day1;

public class CastingEx {
	public static void main(String[] args) {
		double d = 85.4;
		int score = (int)d;
		System.out.println("score : " + score);
		System.out.println("d : " + d);
		
		double d1 = 80; // 원칙적으론 (double)80; 이 맞음
		System.out.println("d1 : " +  d1);
	}
}
