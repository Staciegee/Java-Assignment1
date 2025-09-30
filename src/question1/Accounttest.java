package question1;

public class Accounttest {

	public static void main(String[] args) {
		 Account acc = new Account("Mufaro Stacie", 500.0);

	        acc.deposit(200.0);
	        acc.withdraw(100.0);
	        acc.withdraw(700.0);
	        acc.deposit(-50.0);

	        System.out.println("Balance: " + acc.getBalance());
	    }
		

	}

