package thisIsJava;

public class Account {
		// instance field
		private int balance;
		
		// constants		
		static final int MIN_BALANCE = 0;
		static final int MAX_BALANCE = 1000000;
	
		// getter and setter		
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance)  {
			if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
				this.balance = balance;
			}
		}
		
}
