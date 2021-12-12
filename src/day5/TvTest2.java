package day5;

public class TvTest2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		
		t2 = t1;
		t1.channel =7;
		System.out.println("t1의 채널 : " + t1.channel);
		System.out.println("t2의 채널 : " + t2.channel);
	}
}
