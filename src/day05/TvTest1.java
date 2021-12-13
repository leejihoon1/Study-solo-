package day05;

public class TvTest1 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 채널 : " + t1.channel);	//	0
		System.out.println("t2의 채널 : " + t2.channel);	//	0
		
		t1.channel =7;
		
		System.out.println("t1의 채널 : " + t1.channel);	//	7
		System.out.println("t2의 채널 : " + t2.channel);	//	0
	}
}
