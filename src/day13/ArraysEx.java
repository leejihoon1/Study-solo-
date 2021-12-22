package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysEx {
	public static void main(String[] args) {
		// copyOf(), copyOfRange()
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {
				{11,12,13},
				{21,22,23},
		};
		
		int[]arr2 = Arrays.copyOf(arr, arr.length);
		int[]arr3 = Arrays.copyOf(arr2, 3);
		int[]arr4 = Arrays.copyOf(arr, 7);
		int[]arr5 = Arrays.copyOfRange(arr, 2, 4); // 마지막 인덱스 전까지 복사해라 
		int[]arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		// toString()
		System.out.println("arr2 = " + Arrays.toString(arr2));
		System.out.println("arr2 = " + Arrays.toString(arr3));
		System.out.println("arr2 = " + Arrays.toString(arr4));
		System.out.println("arr2 = " + Arrays.toString(arr5));
		System.out.println("arr2 = " + Arrays.toString(arr6));
		
		// fill(), setAll()
		int [] arr7 = new int[5];
		Arrays.fill(arr7,  9);
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		Arrays.setAll(arr7,  i -> (int)(Math.random() * 6) + 1);
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		// equals(), deepEqauls()
		
		System.out.println(Arrays.equals(arr, arr2));
		
		String[][]str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}}; 
		String[][]str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}}; 
		
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(str2D);
		System.out.println(str2D2);
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		// sort( ) , binarySearch( ) 
		int [] numArr = {0, 7, 5, 1, 2};
		System.out.println("numArr : " + Arrays.toString(numArr));
		System.out.println("Index of 1 : " + Arrays.binarySearch(numArr, 1)); // 에러 
		Arrays.sort(numArr);
		System.out.println("====== After sorting ======");
		System.out.println("numArr : " + Arrays.toString(numArr));
		System.out.println("Index of 1 : " + Arrays.binarySearch(numArr, 1));
		
		// asList ( )
		List list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("List : " + list);
//		list.add(7);
		list = new ArrayList(list);
		list.add(7);
		System.out.println("list : " + list);
		
		
	}
}
