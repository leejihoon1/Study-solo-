package day11;

import java.util.Random;

public class MathTest {
	public static void main(String[] args) {
		//Math.random() : 0.0 ~ 1.0 사이의 랜덤한 실수 반환(double)
//		while(true) {
//		int data = (int)(Math.random()*10+1);
//		System.out.println(data);
		
		Random r = new Random();
//		r.nextInt(10) : 0 ~ 9까지의 랜덤한 정수
//		System.out.println(r.nextInt(10)+1);
		
		//Math.round(실수) : 소수점 첫째자리에서 반올림
		double test = 21.11180930;
		System.out.println(Math.round(21.11180930));
	
		//넷쨰자리에서 반올림 하고 싶을 때
		//1. 1000(10의3승)곱하기
		//test*1000 --- > 21111.8090030
		//2.반올림( Math.round())
		//Math.round(2111.8090030)-- >  21112
		//3.다시 1000.0으로나누기
		// 21112 / 1000.0 --> 21.112
		System.out.println(Math.round(test*1000)/ 1000.0);
		
		//Math.ceil(실수) : 올림
		System.out.println(Math.ceil(1.1));
		//Math.floor(실수) : 내림
		System.out.println(Math.floor(1.999));
		//Math.abs(값) : 절대값
		System.out.println(Math.abs(-418974));
		//Math.pow(n,m): n의 m제곱
		System.out.println(Math.pow(10, 3));
	}
}


















