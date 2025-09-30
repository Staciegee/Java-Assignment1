package question1;

	public class Account extends Bank {
	    public Account(String accountName, double balance) {
	        super(accountName, balance);
	    }

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            String message = accountName + " deposited: " + amount + " | New Balance: " + balance;
	            System.out.println(message);
	            logTransaction(message);
	        } else {
	            System.out.println("Invalid deposit amount. Must be greater than 0.");
	            logTransaction(accountName + " attempted invalid deposit: " + amount);
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid withdrawal amount. Must be > 0.");
	            logTransaction(accountName + " attempted invalid withdrawal: " + amount);
	            return;
	        }
	        if (amount <= balance) {
	            balance -= amount;
	            String message = accountName + " withdrew: " + amount + " | New Balance: " + balance;
	            System.out.println(message);
	            logTransaction(message);
	        } else {
	            System.out.println("Withdrawal amount exceeded account balance");
	            logTransaction(accountName + " attempted withdrawal exceeded balance: " + amount);
	        }
	    }

	    @Override
	    public double getBalance() {
	        String message = accountName + " checked balance: " + balance;
	        logTransaction(message);
	        return balance;
	    }

}
