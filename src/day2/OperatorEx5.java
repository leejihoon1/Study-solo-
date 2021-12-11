package day2;

public class OperatorEx5 {
	public static void main(String[] args) {
		// 산술 변환
		
		byte b1 = 127;	// -128~ 127 까지 저장가능
		byte b2 = 1; 
		char ch = 'A';	//내부적으로 정수 65로 저장
//		System.out.printf("%c, %d, ch, (int)ch");
		float f1 =15.5F;
		double d1 = 10.5;
		
		int i1 = b1 + b2;	//byte + byte -> int + int
		
		byte b3 =(byte)(b1+b2); //bute + byte -> int + int -> int
		
		int i2 = ch + b2; 	//char + byte -> int + int -> int
		
		float f2 = b1 + f1; // byte + float -> float + float -> float
		
		double d2 = f1 + d1; // float + double -> double + double -> double
		
		System.out.println("i1 :" + i1);
		System.out.println("b3 : " + b3);
		System.out.println("i2 : " + i2);
		System.out.println("f2 : " + f2);
		System.out.println("d2 : " + d2 );
		
		
	}
}
