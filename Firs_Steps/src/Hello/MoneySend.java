package Hello;

class Account implements InterfMoney{
	int balance;
	String account_name;
	String exp_date;
	final String acc_number;
	
	Account(int b, String a, String e, String n) {
		balance = b;
		account_name = a;
		exp_date = e;
		acc_number = n;
	}
	
	void credit_account(String a_n, int summ) { //a_n - account number
		if (acc_number.equals(a_n)) updateBalance(a_n, summ, "+");
		else System.out.println("\n.........\nIncorrect account number. Cannot provide crediting."
				+ "\nYou give us this ---" + a_n + "--- account number\n.........\n");
	}
	
	void debit_account(String a_n, int summ) {
		if (acc_number.equals(a_n)) updateBalance(a_n, summ, "-");
		else System.out.println("\n.........\nIncorrect account number. Cannot provide crediting\n.........\n");
	}
	
	public int getBalance(String a_n) {
		if (acc_number.equals(a_n)) {
			return balance;
		}
		
		return 0;
	}
	
	public void updateBalance(String a_n, int amount, String z) {
		if (acc_number.equals(a_n)) {
			if (z.equals("-")) balance -= amount;
			else balance += amount;
		}
		else {
			System.out.println("False....... error!!!");
		}
	}
}


public class MoneySend {
	public static void main(String args[]) {
		Account acc1 = new Account(1000, "MasterCard", "12/19", "221564789");
		Account acc2 = new Account(100, "Visa", "12/19", "001");
		
		System.out.println("Account balce is: " + acc1.balance);
		System.out.println("Let's credit aacount with 200 RUB...");
		acc1.credit_account("221564787", 1500);
		System.out.println("Account balce is: " + acc1.balance + "\n");
		
		System.out.println("Let's debit aacount with 1500 RUB...");
		acc1.debit_account("221564789", 200);
		System.out.println("Account balce is: " + acc1.balance + "\n");
		
		System.out.println("\nThis is you information about your account: \n" + 
							"Your accout name: " + acc1.account_name + "\n" + 
							"Expiration date: " + acc1.exp_date + "\n" +
							"Balance: " + acc1.balance + "\n" + 
							"Account number: " + acc1.acc_number);
		
	}
	
}
