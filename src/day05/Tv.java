package day05;

public class Tv {
	//Tv�� �Ӽ�( �������)
	String color;	// ����
	boolean power;	// �������� (on / off)
	public int channel;	// ä��
	
	//Tv�� ��� ( �޼ҵ� )
	
	void power() {
		//Tv�� �Ѱų� ���� ����� �ϴ� �޼ҵ�
		power = !power;
	}
	void channelUP() {
		//Tv�� ä���� ���̴� ����� �ϴ� �޼ҵ�
		++channel;
	}
	void channelDown() {
		//Tv�� ä���� ���ߴ� ����� �ϴ� �޼ҵ�
		--channel;
	}
}
