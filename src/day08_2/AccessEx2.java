package day08_2;

import day08_1.Access;

public class AccessEx2 extends Access{
	void method() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
//		System.out.println(defaultVar);	// �ٸ� ��Ű���� ����
//		System.out.println(privateVar); // �ٸ� Ŭ������ ����
	}
	
}

class AccessEx3{
	Access ac = new Access();
	int num = ac.publicVar;
//	int num1 = ac.protectedVar; // 
}
