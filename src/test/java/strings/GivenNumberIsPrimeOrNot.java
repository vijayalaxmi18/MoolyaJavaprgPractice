package strings;

import java.util.Scanner;
public class GivenNumberIsPrimeOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		if (isPrime(number)) {
			System.out.println("PRIME NUMBERR");
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
