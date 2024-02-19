package strings;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (isPrime(number)) {
			System.out.println("PRIME NUMBER");
		} else {
			System.out.println("NOT A PRIME NUMBER");
		}
		scanner.close();
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
