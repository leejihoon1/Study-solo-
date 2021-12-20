package day11;

import java.util.Scanner;

public class ObjTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String msg1 = "Hello";
//		String msg2 = "Hello";
//		System.out.println(msg1 == msg2);	// true
//		
//		String msg3 = "Hello";
//		String msg4 = sc.next();
//		String msg5 = new String("Hello");
//	
//		System.out.println(msg3 == msg4);	//	false 
//		System.out.println((msg3.equals(msg4))); // true 
		
		// 동위객체
		Test obj1 = new Test(10, "Hello");
		Test obj2 = new Test(10, "Hello");
//		System.out.println(obj1);
//		System.out.println(obj1.toString());
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		
		System.out.println(obj1.hashCode() == obj2.hashCode());
	}
}
class Test{
	int intData;
	String strData;
	
	public Test(int intData, String strData) {
		this.intData = intData;
		this.strData = strData;
	
	}
	
	@Override
	public String toString() {
		return "정수 : "+intData+" / 문자열 : " +strData;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 1.타입비교
		if(obj instanceof Test) {
			 // 2.다운캐스팅
			Test target = (Test)obj;
			// 3.조건비교
//			if(this.intData == target.intData) {
//				if(this.strData.equals(target.strData)) {
//					return true;
//				}
//			}
			return this.intData == target.intData && this.strData.equals(target.strData);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return intData + strData.length();
	}	
}
