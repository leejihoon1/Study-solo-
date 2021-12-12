package day5;

public class TvTest3 {
	public static void main(String[] args) {
		// °´Ã¼¹è¿­
		Tv[] tvArr = new Tv[3];
		//int[] arr = new int [4];
		System.out.println("tvArr.length : " + tvArr.length);  // 3
		//System.out.println("arr.length: " + arr.length);	   // 4
		
		for(int i = 0; i < tvArr.length; i ++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;
			System.out.println("tvArr[" + i + "] : " +tvArr[i]);
			System.out.println("tvArr[" + i + "].channel : " +tvArr[i].channel);
		}
		System.out.println(tvArr[0].channel);
		/*
		 * tvArr[0] = new Tv();
		 * tvArr[1] = new Tv();
		 * tvArr[2] = new Tv();
		 */
		int i = 0;
		for (i = 0; i <11; i++) {
			int sum = 0;
			sum +=i;
		}
		
		System.out.println(i);
	}
}
