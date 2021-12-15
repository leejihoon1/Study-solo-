package day08_1;

public class AcccessEx {
	public static void main(String[] args) {
		Access ac = new Access();
		System.out.println(ac.publicVar);
		System.out.println(ac.protectedVar);
		System.out.println(ac.defaultVar);
//		System.out.println(ac.privateVar);  // 에러  private는 같은 클래스에서만 사용가능 
	}
}
