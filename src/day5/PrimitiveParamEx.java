package day5;

public class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d= new Data();
		d.x = 10;
		System.out.println("main(): " + d.x); 	// 10
		change(d.x);
		System.out.println("main() : " + d.x);  // 10
	}
	
	static void change(int x) {  // int x = 10;
		x = 1000;
		System.out.println("change(): " + x);
	}
}
