package day04;

import java.util.Arrays;

public class ArrayEx08 {
	public static void main(String[] args) {
		// ������ ������ �迭 ä���
		int[] code = {-1, -1, 3, 6, 11};
		int[] arr = new int [10];
		
		for ( int i = 0; i < arr.length; i ++) { // arr.length == 10
			int tmp = (int)(Math.random()* code.length);
			// int tmp = (int)(Math.random() * 5);  ���� ����
			// tmp �� ���� // 0 ~ 4
			arr[i] = code[tmp];
			// i�� ���� : 0 ~ 9
		}
		System.out.println("arr : " + Arrays.toString(arr));
	}
}
