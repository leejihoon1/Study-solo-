package day5;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money = 10000; //초기비용 10000원
		int maxMoney = 50000; // 최대 입금 가능 금액
		int menu = 0; // 메뉴버튼
		int inputMoney = 0; //입금액
		int outputMoney = 0; //출금액
		
		while(true) {
			System.out.println("메뉴 1.입금 2.출금 3.종료");
			System.out.print("메뉴를 선택하세요 >> ");
			menu = sc.nextInt();
			
			if(menu == 3) {
				break;
			}else if(menu ==1){	// 입금메뉴를 선택했을떄
				System.out.println("얼마를 입금하시겠습니까 ? >>");
				inputMoney = sc.nextInt();
				if((money + inputMoney) > maxMoney) {
					System.out.printf("최대 입금액을 초과하였습니다. 입금할 수 있는 금액은 %d원입니다.\n", maxMoney - money);
				}else {
					money += inputMoney;
					System.out.println("입금 성공 !!");
					System.out.printf("현재 금액은 %d입니다.\n", money);
					System.out.println("이용해 주셔서 감사합니다.");
				}
			}else if(menu == 2) {
				System.out.println("얼마를 출금하시겠습니까? >>");
				outputMoney = sc.nextInt();
				if ((money - outputMoney) < 0 ) {
					System.out.printf("최대 출금액을 초과하였습니다. 출금할수 있는 금액은 %d원입니다.\n", money);
				}else {
					money -= outputMoney;
					System.out.println("출금 성공 !");
					System.out.printf("남금 금액은 %d입니다.\n", money);
					System.out.println("이용해 주셔서 감사합니다.");
				}
			}else {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
			}
		}
	}
}
