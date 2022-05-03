package thisIsJava;

import java.util.Scanner;

public class BankApplication {
	
	// 전역 변수 : main 밖에 선언 -> class 안에 있는 모든 method에서 사용 가능
	private static BankAccount[] accountArray = new BankAccount[100];
	private static Scanner scanner = new Scanner(System.in);
	static int count = 0;
	
	// main method
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
				case 1:
					createAccount();
					break;
				case 2:
					accountList();
					break;
				case 3:
					deposit();
					break;
				case 4:
					withdraw();
					break;
				case 5:
					run = false;
			}
		} // while
		
		System.out.println("프로그램 종료");
	}
	
	// 계좌 생성하기
	private static void createAccount() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next(); // next() -> string을 입력받는 method
		
		System.out.print("계좌주 : ");
		String owner = scanner.next();
		
		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt();

		accountArray[count] = new BankAccount(ano, owner, balance);
		count++;
			
		System.out.println("결과 : 계좌가 생성되었습니다.");
		
		// count 변수를 사용하지 않는 경우
		/* for(int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new BankAccount(ano, owner, balance);
				break;
			} 
			System.out.println("결과 : 계좌가 생성되었습니다."); 
		} */
	
	}
	
	// 계좌 목록 보기
	private static void accountList() {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		
		for(int i = 0; i < count; i++) {
			System.out.print(accountArray[i].getAno() + "          ");
			System.out.print(accountArray[i].getOwner() + "          ");
			System.out.println(accountArray[i].getBalance());
		}
		
		// count 변수를 사용하지 않는 경우
		/* for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				System.out.print(accountArray[i].getAno() + "          ");
				System.out.print(accountArray[i].getOwner() + "          ");
				System.out.println(accountArray[i].getBalance());
			} else {
				break;
			}
		} */
		
	}
	
	// 예금하기
	private static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		
		System.out.print("예금액 : ");
		int deposit = scanner.nextInt();
		
		BankAccount bankAccount = findAccount(ano); 
		
		if(bankAccount == null) {
			System.out.println("결과 : 존재하지 않는 계좌번호입니다. ");
		} else {
			bankAccount.setBalance(bankAccount.getBalance() + deposit);
			System.out.println("결과 : 예금이 성공되었습니다.");
		}

	}
	
	// 출금하기
	private static void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		
		System.out.print("출금액 : ");
		int withdraw = scanner.nextInt();
		
		BankAccount bankAccount = findAccount(ano); 
		
		if(bankAccount == null) {
			System.out.println("결과 : 존재하지 않는 계좌번호입니다. ");
		} else {
			bankAccount.setBalance(bankAccount.getBalance() - withdraw);
			System.out.println("결과 : 출금이 성공되었습니다.");
		}
		
	}	
	
	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static BankAccount findAccount(String ano) {
		BankAccount bankAccount = null;
		for(int i = 0; i < count; i++) {
			// count 변수를 사용하지 않는 경우
			// for(int i = 0; i < accountArray.length; i++)
			// if(accountArray[i] != null) {
				if(accountArray[i].getAno().equals(ano)) {
					bankAccount = accountArray[i];
					break;
				}
			//} else { break; }
			
		}
		return bankAccount;
	}
	
}




