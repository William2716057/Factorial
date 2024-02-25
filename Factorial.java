import java.util.Scanner;

public class Factorial {
	//function to perform calculation
	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n -1));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to calculate factorial");
		int num = scanner.nextInt();
		scanner.close();

		if (num < 0) {
			System.out.println("No negative numbers");
		} else {
			int fact = factorial(num);
			System.out.println("Factorial of " + num + " = " + fact);
		}
	}
}
