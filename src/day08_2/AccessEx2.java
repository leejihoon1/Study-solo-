package day08_2;

import day08_1.Access;

public class AccessEx2 extends Access{
	void method() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
//		System.out.println(defaultVar);	// 다른 패키지라서 못씀
//		System.out.println(privateVar); // 다른 클래스라서 못씀
	}
	
}

class AccessEx3{
	Access ac = new Access();
	int num = ac.publicVar;
//	int num1 = ac.protectedVar; // 
}
