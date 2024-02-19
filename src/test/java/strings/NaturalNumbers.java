package strings;

public class NaturalNumbers {

	public static void main(String[] args) {

		naturalNumbers(1);

	}

	public static void naturalNumbers(int n) {
		if (n <= 100) {
			System.out.println(n);
			naturalNumbers(n + 1);
		}
	}

}
