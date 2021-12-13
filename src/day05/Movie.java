package day05;

import java.util.Scanner;

public class Movie {
	public static void main(String[] args) {
		int menu = 0;	//메뉴 버튼
		int genre =0;	//장르 버튼
		int choiceMovie =0;	// 영화선택
		int moviePrice =0;	// 영화가격
		String movieName = "";	//영화이름
		int tiket= 0;	//	티켓 수
		int payment =0;	// 사용자가 지불하는 금액
		int refund =0;	// 환불
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("[코리아 아카데미 영화관에 오신것을 환영합니다.]");
			System.out.println("1.예매 2.예매확인 3.환불 4.종료");
			System.out.println("메뉴를 선택해주세요 >> ");
			menu = sc.nextInt();
			if(menu == 4) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}	
			if(menu == 1) { // 예매버튼을 눌렀을떄
				System.out.println("영화장르를 선택해주세요.");
				System.out.println("1.액션 2.코미디 3.로맨스 4.돌아가기");
				System.out.print(">> ");
				genre = sc.nextInt();
				if(genre == 4) {
					continue;
				}
				if(genre == 1) { //액션 영화를 선택했을때
					System.out.println("영화를 선택해주세요.");
					System.out.println("1.007네버투다이 2.엽문 3.분노의질주");
					System.out.println(">> ");
					choiceMovie = sc.nextInt();
					if(choiceMovie ==1 ) {
						movieName = "007네버투다이";
					}else if(choiceMovie == 2) {
						movieName =  "엽문";
					}else if(choiceMovie == 3) {
						movieName = "분노의질주";
					}else {
						System.out.println("번호를 잘못 입력하셨습니다.");
						continue;
					}
					System.out.print("몇명이서 관람하십니까? >> ");
					tiket = sc.nextInt();
				}else if(genre ==2) { // 코미디 영화를 선택하였을떄
					System.out.println("영화를 선택해주세요.");
					System.out.println("1.동갑내기과외하기 2.타짜 3.히트맨");
					System.out.print(">> ");
					choiceMovie = sc.nextInt();
					if(choiceMovie ==1 ) {
						movieName = "동갑내기 과외하기";
					}else if(choiceMovie == 2) {
						movieName =  "타짜";
					}else if(choiceMovie == 3) {
						movieName = "히트맨";
					}else {
						System.out.println("번호를 잘못 입력하셨습니다.");
						continue;
					}
					System.out.print("몇명이서 관람하십니까? >> ");
					tiket = sc.nextInt();
				}else if (genre == 3) { // 로맨스 영화를 선택하였을때
					System.out.println("영화를 선택해주세요.");
					System.out.println("1.북극성 2.사랑 3.황태자의첫사랑");
					System.out.print(">> ");
					choiceMovie = sc.nextInt();
					if(choiceMovie ==1 ) {
						movieName = "북극성";
					}else if(choiceMovie == 2) {
						movieName =  "사랑";
					}else if(choiceMovie == 3) {
						movieName = "황태자의 첫사랑";
					}else {
						System.out.println("번호를 잘못 입력하셨습니다.");
						continue;
					}
					System.out.print("몇명이서 관람하십니까? >> ");
					tiket = sc.nextInt();
					
					int totalPrice = tiket * moviePrice;
					System.out.printf("총 금액은 %d원입니다.\n", totalPrice);
					System.out.print("결제하실 금액을 입력해주세요 >> ");
					payment = sc.nextInt();
					
					while(true) {
						int result = payment - totalPrice; 
						totalPrice -= payment;
						
						if(result < 0) {
							System.out.printf("결제 금액이 부족합니다. 추가금액은 %d원입니다.\n", totalPrice);
							System.out.println("추가금액 입력 >>");
							payment = sc.nextInt();
						}else if(result > 0) {
							System.out.printf("거스름돈은 %d원입니다. 감사합니다.\n", result);
							break;
						}else {
							System.out.println("예매감사합니다.");
							break;
						}
					}
				}else if (menu ==2) { // 예매정보확인
					if(tiket == 0) {
						System.out.println("예매정보가 없습니다.");
						continue;
					}
					System.out.println("[예매정보]");
					System.out.println("예매 영화 : " + movieName);
					System.out.println("예매 인원 : " + tiket);
				}else if(menu == 3) { // 환불
					if(tiket ==0) {
						System.out.println("예매정보가 없습니다.");
						continue;
					}
					System.out.printf("현재 예매하신 총 티켓은 %d장입니다.\n", tiket);
					System.out.print("몇장을 취소하시겠습니까? >>");
					refund = sc.nextInt();
					if(tiket - refund < 0) { //취소하려는 티켓이 더 많다면
						System.out.printf("총 취소할 수 있는 티켓은 %d장입니다.\n, tiket");
						continue;
					}else {
						System.out.printf("총 %d장 취소 완료하였습니다.\n", refund);
						System.out.printf("환불 금액은 %d원입니다.\n, refund * moviePrice");
						tiket -= refund;
					}
				}
			}
		}
	}
}

