package day5;

public class MemberCall {
	int iv = 10;			// �ν��Ͻ� ����
	static int cv = 20;		// Ŭ���� ����
//	static int cv2 = iv;
	// ����, Ŭ���������� �ν��Ͻ��� ��� �� �� ����
	// Ŭ���� ������ �޸𸮿� �ö� �� �ν��Ͻ������� ������ �ȵǾ� �������� �ִ�.
	static int cv2 = new MemberCall().iv;  // ��ü�� �����ϸ� ��밡��
	int iv2 = cv; // Ŭ���������� �ֱ� ������ �ν��Ͻ��� ����

	static void staticMethod() { // Ŭ���� �޼ҵ�
		System.out.println("cv : " + cv);
//		System.out.println("iv : " + iv);  ����, Ŭ�����޼ҵ忡�� �ν��Ͻ� ������ ����� �� ����.
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	
	void instanceMethod() { // �ν��Ͻ� �޼ҵ�
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod();
//		instanceMethod(); 
		MemberCall c = new MemberCall();
		c.instanceMethod();
		
		new MemberCall().instanceMethod();
	}
	
	void instnaceMethod() { // �ν��Ͻ� �޼ҵ忡���� �ν��Ͻ� �޼ҵ�, Ŭ���� �޼ҵ� ��� ��� ����.
		staticMethod();
		instanceMethod();
	}
}
