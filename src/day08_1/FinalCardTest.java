package day08_1;

class Card {
	final int NUMBER;			// 상수지만 선언과 함께 초기화 하지 않고 생성자에서 단 한번만 초기화 할 수 있다.
	final String KIND;
	static int width  = 100;
	static int height = 200;
	
//	static final int CONST = 10; // 상수에 static이붙으면 선언과 동시에 초기화를 해줘야함
	
	public Card () {
		this("HEART", 1);
	}
	
	Card(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
}


public class FinalCardTest {
	public static void main(String[] args) {
		Card c = new Card();
		System.out.println(c.KIND);		// HEART
		System.out.println(c.NUMBER);	// 1
	}
}
