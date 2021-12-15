package day08_1;

public class Access {
	public int publicVar;
	protected int protectedVar;
	int defaultVar;
	private int privateVar;
	
	void hello() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
		System.out.println(defaultVar);
		System.out.println(protectedVar);
	}
}
