package day3;

public class FlowEx01 {
	public static void main(String[] args) {
		int x= 0;
		System.out.println("x = " + x + " 일 때 참인것은 ? ");
		
		if ( x == 0 ) {		// true
			System.out.println("x == 0");
		}
		
		if ( x !=0 ) {		// false
			System.out.println("x !=0");
		}
		
		if (!(x==0)) {		// false
			System.out.println("!(x == 0)");
		}
		
		if ( ! (x !=0 ) ) {	// true
			System.out.println("! (  x ! = 0 ) " );
		}
	}
}
