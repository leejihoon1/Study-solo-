package day04;

import java.util.Arrays;

public class ArrayEx08 {
	public static void main(String[] args) {
		// 임의의 값으로 배열 채우기
		int[] code = {-1, -1, 3, 6, 11};
		int[] arr = new int [10];
		
		for ( int i = 0; i < arr.length; i ++) { // arr.length == 10
			int tmp = (int)(Math.random()* code.length);
			// int tmp = (int)(Math.random() * 5);  위랑 동일
			// tmp 의 범위 // 0 ~ 4
			arr[i] = code[tmp];
			// i의 범위 : 0 ~ 9
		}
		System.out.println("arr : " + Arrays.toString(arr));
	}
}
