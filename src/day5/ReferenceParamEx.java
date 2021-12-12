package day5;

public class ReferenceParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 20;
		System.out.println("main() : " + d.x); // 20
		System.out.println("main()������ d�ּ� : " + d);
		change(d);
		System.out.println("main() : " +d.x);
		
		int [] ar = new int [4]; // 0, 0, 0, 0
		PlusOne(ar);
		for (int i = 0; i < ar.length; i++ ) {
			System.out.println(ar[i]); // 
		}
	}
	
	static void change(Data d1) { // Data d1 = d;
		System.out.println("change()������ d1�ּ� : " + d1);
		d1.x = 30;
		System.out.println("change() : " + d1.x); // 
	}
	
	static void PlusOne(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] += 1;
		}
	}
}
 