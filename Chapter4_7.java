package thisIsJava;

import java.util.Scanner;

public class Chapter4_7 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;

		
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------------");
			System.out.print("선택 > ");
			
			int choice;
			int deposit;
			int withdraw;
			
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			if(choice > 0 && choice < 5) {
				if(choice == 1) {
					System.out.print("예금액 > ");
					
					Scanner depositSc = new Scanner(System.in);
					deposit = depositSc.nextInt();
					
					balance += deposit;
					
					System.out.println();
					
				} else if(choice == 2) {
					System.out.print("출금액 > " );
					
					Scanner  withdrawSc = new Scanner(System.in);
					withdraw = withdrawSc.nextInt();
					
					balance -= withdraw;
					
					if(balance < 0) {
						System.out.println("잔액이 부족하여 출금할 수 없습니다.");
					}
					
					System.out.println();
					
				} else if(choice == 3) {
					
					System.out.print("잔고 > " + balance + "\n");
					System.out.println();
				
				} else break;
				
			} else {
				System.out.println("1부터 4까지의 숫자만 입력해주세요.\n"); 
			}
			
		}
		
		System.out.println("프로그램 종료");
		
	}

}
