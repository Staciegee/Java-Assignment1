package question2;
import java.util.Scanner;

public class Exceptionhandling {
	public static void checkAge(int age) throws AgeException{
		if (age < 18) {
			throw new AgeException("You should be 18 years old.") ;
		}
		else {
			System.out.println("Age is valid, You may proceed.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your Age: ");
		int userAge =scanner.nextInt();
		
		try {
			checkAge(userAge);
		}
		catch(AgeException e) {
			System.out.println("Error: " + e.getMessage());
		}
		scanner.close();
		
		

	}

}
