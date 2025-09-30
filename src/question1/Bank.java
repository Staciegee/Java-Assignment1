package question1;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Bank {
	protected String accountName;
    protected double balance;

    public Bank(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    protected void logTransaction(String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        try (FileWriter writer = new FileWriter("Bank.txt", true)) {
            writer.write(timestamp + " - " + message + System.lineSeparator());
        } catch (IOException e) {
            System.err.println("Error writing to Bank.txt: " + e.getMessage());
        }
    }

}
