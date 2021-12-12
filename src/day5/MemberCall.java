package day5;

public class MemberCall {
	int iv = 10;			// 인스턴스 변수
	static int cv = 20;		// 클래스 변수
//	static int cv2 = iv;
	// 에러, 클래스변수는 인스턴스를 사용 할 수 없음
	// 클래스 변수가 메모리에 올라갈 때 인스턴스변수는 생성이 안되어 있을수도 있다.
	static int cv2 = new MemberCall().iv;  // 객체를 생성하면 사용가능
	int iv2 = cv; // 클래스변수가 있기 떄문에 인스턴스는 가능

	static void staticMethod() { // 클래스 메소드
		System.out.println("cv : " + cv);
//		System.out.println("iv : " + iv);  에러, 클래스메소드에서 인스턴스 변수를 사용할 수 없다.
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	
	void instanceMethod() { // 인스턴스 메소드
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod();
//		instanceMethod(); 
		MemberCall c = new MemberCall();
		c.instanceMethod();
		
		new MemberCall().instanceMethod();
	}
	
	void instnaceMethod() { // 인스턴스 메소드에서는 인스턴스 메소드, 클래스 메소드 모두 사용 가능.
		staticMethod();
		instanceMethod();
	}
}
