package day05;

import java.util.Scanner;

public class Movie {
	public static void main(String[] args) {
		int menu = 0;	//�޴� ��ư
		int genre =0;	//�帣 ��ư
		int choiceMovie =0;	// ��ȭ����
		int moviePrice =0;	// ��ȭ����
		String movieName = "";	//��ȭ�̸�
		int tiket= 0;	//	Ƽ�� ��
		int payment =0;	// ����ڰ� �����ϴ� �ݾ�
		int refund =0;	// ȯ��
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("[�ڸ��� ��ī���� ��ȭ���� ���Ű��� ȯ���մϴ�.]");
			System.out.println("1.���� 2.����Ȯ�� 3.ȯ�� 4.����");
			System.out.println("�޴��� �������ּ��� >> ");
			menu = sc.nextInt();
			if(menu == 4) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}	
			if(menu == 1) { // ���Ź�ư�� ��������
				System.out.println("��ȭ�帣�� �������ּ���.");
				System.out.println("1.�׼� 2.�ڹ̵� 3.�θǽ� 4.���ư���");
				System.out.print(">> ");
				genre = sc.nextInt();
				if(genre == 4) {
					continue;
				}
				if(genre == 1) { //�׼� ��ȭ�� ����������
					System.out.println("��ȭ�� �������ּ���.");
					System.out.println("1.007�׹������� 2.���� 3.�г�������");
					System.out.println(">> ");
					choiceMovie = sc.nextInt();
					if(choiceMovie ==1 ) {
						movieName = "007�׹�������";
					}else if(choiceMovie == 2) {
						movieName =  "����";
					}else if(choiceMovie == 3) {
						movieName = "�г�������";
					}else {
						System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
						continue;
					}
					System.out.print("����̼� �����Ͻʴϱ�? >> ");
					tiket = sc.nextInt();
				}else if(genre ==2) { // �ڹ̵� ��ȭ�� �����Ͽ�����
					System.out.println("��ȭ�� �������ּ���.");
					System.out.println("1.������������ϱ� 2.Ÿ¥ 3.��Ʈ��");
					System.out.print(">> ");
					choiceMovie = sc.nextInt();
					if(choiceMovie ==1 ) {
						movieName = "�������� �����ϱ�";
					}else if(choiceMovie == 2) {
						movieName =  "Ÿ¥";
					}else if(choiceMovie == 3) {
						movieName = "��Ʈ��";
					}else {
						System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
						continue;
					}
					System.out.print("����̼� �����Ͻʴϱ�? >> ");
					tiket = sc.nextInt();
				}else if (genre == 3) { // �θǽ� ��ȭ�� �����Ͽ�����
					System.out.println("��ȭ�� �������ּ���.");
					System.out.println("1.�ϱؼ� 2.��� 3.Ȳ������ù���");
					System.out.print(">> ");
					choiceMovie = sc.nextInt();
					if(choiceMovie ==1 ) {
						movieName = "�ϱؼ�";
					}else if(choiceMovie == 2) {
						movieName =  "���";
					}else if(choiceMovie == 3) {
						movieName = "Ȳ������ ù���";
					}else {
						System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
						continue;
					}
					System.out.print("����̼� �����Ͻʴϱ�? >> ");
					tiket = sc.nextInt();
					
					int totalPrice = tiket * moviePrice;
					System.out.printf("�� �ݾ��� %d���Դϴ�.\n", totalPrice);
					System.out.print("�����Ͻ� �ݾ��� �Է����ּ��� >> ");
					payment = sc.nextInt();
					
					while(true) {
						int result = payment - totalPrice; 
						totalPrice -= payment;
						
						if(result < 0) {
							System.out.printf("���� �ݾ��� �����մϴ�. �߰��ݾ��� %d���Դϴ�.\n", totalPrice);
							System.out.println("�߰��ݾ� �Է� >>");
							payment = sc.nextInt();
						}else if(result > 0) {
							System.out.printf("�Ž������� %d���Դϴ�. �����մϴ�.\n", result);
							break;
						}else {
							System.out.println("���Ű����մϴ�.");
							break;
						}
					}
				}else if (menu ==2) { // ��������Ȯ��
					if(tiket == 0) {
						System.out.println("���������� �����ϴ�.");
						continue;
					}
					System.out.println("[��������]");
					System.out.println("���� ��ȭ : " + movieName);
					System.out.println("���� �ο� : " + tiket);
				}else if(menu == 3) { // ȯ��
					if(tiket ==0) {
						System.out.println("���������� �����ϴ�.");
						continue;
					}
					System.out.printf("���� �����Ͻ� �� Ƽ���� %d���Դϴ�.\n", tiket);
					System.out.print("������ ����Ͻðڽ��ϱ�? >>");
					refund = sc.nextInt();
					if(tiket - refund < 0) { //����Ϸ��� Ƽ���� �� ���ٸ�
						System.out.printf("�� ����� �� �ִ� Ƽ���� %d���Դϴ�.\n, tiket");
						continue;
					}else {
						System.out.printf("�� %d�� ��� �Ϸ��Ͽ����ϴ�.\n", refund);
						System.out.printf("ȯ�� �ݾ��� %d���Դϴ�.\n, refund * moviePrice");
						tiket -= refund;
					}
				}
			}
		}
	}
}

