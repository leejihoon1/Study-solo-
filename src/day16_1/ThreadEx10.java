package day16_1;

import javax.swing.JOptionPane;

public class ThreadEx10 {
	public static void main(String[] args) {
		ThreadEx10_1 th1 = new ThreadEx10_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� �� : " + input);
		
		th1.interrupt();
		//interrupt()�� ȣ���ϸ� interrupted()���°� true�� �ȴ�.
		System.out.println("main�����忡�� th1.isInterrupted() ; " + th1.isInterrupted());
	}
}

class ThreadEx10_1 extends Thread{
	@Override
	public void run() {
		int i =10;
		// isInterrupted() == false�̰� i�� 0�� �ƴϾ�� while���� �����Ѵ�.
		while(i !=0 && !isInterrupted()) { 
			System.out.println(i--);
			for(long x = 0; x < 00000000000000000; x++); // 0�� 17��, �ð������� ����
			System.out.println("!isInterrupted() : " + !isInterrupted());
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
}