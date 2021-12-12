package day5;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money = 10000; //�ʱ��� 10000��
		int maxMoney = 50000; // �ִ� �Ա� ���� �ݾ�
		int menu = 0; // �޴���ư
		int inputMoney = 0; //�Աݾ�
		int outputMoney = 0; //��ݾ�
		
		while(true) {
			System.out.println("�޴� 1.�Ա� 2.��� 3.����");
			System.out.print("�޴��� �����ϼ��� >> ");
			menu = sc.nextInt();
			
			if(menu == 3) {
				break;
			}else if(menu ==1){	// �Աݸ޴��� ����������
				System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ� ? >>");
				inputMoney = sc.nextInt();
				if((money + inputMoney) > maxMoney) {
					System.out.printf("�ִ� �Աݾ��� �ʰ��Ͽ����ϴ�. �Ա��� �� �ִ� �ݾ��� %d���Դϴ�.\n", maxMoney - money);
				}else {
					money += inputMoney;
					System.out.println("�Ա� ���� !!");
					System.out.printf("���� �ݾ��� %d�Դϴ�.\n", money);
					System.out.println("�̿��� �ּż� �����մϴ�.");
				}
			}else if(menu == 2) {
				System.out.println("�󸶸� ����Ͻðڽ��ϱ�? >>");
				outputMoney = sc.nextInt();
				if ((money - outputMoney) < 0 ) {
					System.out.printf("�ִ� ��ݾ��� �ʰ��Ͽ����ϴ�. ����Ҽ� �ִ� �ݾ��� %d���Դϴ�.\n", money);
				}else {
					money -= outputMoney;
					System.out.println("��� ���� !");
					System.out.printf("���� �ݾ��� %d�Դϴ�.\n", money);
					System.out.println("�̿��� �ּż� �����մϴ�.");
				}
			}else {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.");
			}
		}
	}
}
