package thisIsJava;

public class BankAccount {
		// field
		private String ano;
		private String owner;
		private int balance;
		
		// constructor
		public BankAccount(String ano, String owner, int balance) {
			this.ano = ano;
			this.owner = owner;
			this.balance = balance;
		}
		
		// getters and setters
		public String getAno() {
			return ano;
		}

		public void setAno(String ano) {
			this.ano = ano;
		}

		public String getOwner() {
			return owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}
}
