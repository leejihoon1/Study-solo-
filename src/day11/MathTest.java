package day11;

import java.util.Random;

public class MathTest {
	public static void main(String[] args) {
		//Math.random() : 0.0 ~ 1.0 ������ ������ �Ǽ� ��ȯ(double)
//		while(true) {
//		int data = (int)(Math.random()*10+1);
//		System.out.println(data);
		
		Random r = new Random();
//		r.nextInt(10) : 0 ~ 9������ ������ ����
//		System.out.println(r.nextInt(10)+1);
		
		//Math.round(�Ǽ�) : �Ҽ��� ù°�ڸ����� �ݿø�
		double test = 21.11180930;
		System.out.println(Math.round(21.11180930));
	
		//�ݤ��ڸ����� �ݿø� �ϰ� ���� ��
		//1. 1000(10��3��)���ϱ�
		//test*1000 --- > 21111.8090030
		//2.�ݿø�( Math.round())
		//Math.round(2111.8090030)-- >  21112
		//3.�ٽ� 1000.0���γ�����
		// 21112 / 1000.0 --> 21.112
		System.out.println(Math.round(test*1000)/ 1000.0);
		
		//Math.ceil(�Ǽ�) : �ø�
		System.out.println(Math.ceil(1.1));
		//Math.floor(�Ǽ�) : ����
		System.out.println(Math.floor(1.999));
		//Math.abs(��) : ���밪
		System.out.println(Math.abs(-418974));
		//Math.pow(n,m): n�� m����
		System.out.println(Math.pow(10, 3));
	}
}

















