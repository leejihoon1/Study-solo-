package day5;

public class CallStackTest {
	public static void main(String[] args) {
		System.out.println("main()이 시작되었음");
		firstMethod(); // CallStackTest.firstMethod(); 둘 다 동일 (같은 클래스내의 메소드 호출 시 클래스 이름 생략 가능
		System.out.println("main()이 끝났음");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()가 시작되었음");
		secondMethod();
		System.out.println("firstMethod()가 끝났음");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()가 시작되었음");
		System.out.println("secondMethod()가 끝났음");
	}
}
