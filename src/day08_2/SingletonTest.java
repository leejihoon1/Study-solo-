package day08_2;

class Singleton{
	
	private static Singleton s = new Singleton();
	
	private Singleton() {}

	public static Singleton gerInstance() {
		if( s == null) {
			s = new Singleton();
		}
		return s;
	} 
}


public class SingletonTest {
	public static void main(String[] args) {
//  	Singleton s = new Singleton();
		Singleton s = Singleton.gerInstance();
		Singleton s1 = Singleton.gerInstance();
		System.out.println("s : " + s );
		System.out.println("s1 : " + s1) ;
		
	}
	
}
