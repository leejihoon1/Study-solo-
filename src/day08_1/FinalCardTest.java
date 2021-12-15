package day08_1;

class Card {
	final int NUMBER;			// ������� ����� �Բ� �ʱ�ȭ ���� �ʰ� �����ڿ��� �� �ѹ��� �ʱ�ȭ �� �� �ִ�.
	final String KIND;
	static int width  = 100;
	static int height = 200;
	
//	static final int CONST = 10; // ����� static�̺����� ����� ���ÿ� �ʱ�ȭ�� �������
	
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
