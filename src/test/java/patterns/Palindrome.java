package patterns;

public class Palindrome {

	public static void main(String[] args) {
		String s = "SADIYA";
		String rev = "";
		int count = 0;
		char[] ch = s.toCharArray();
		for (char c : ch) {
			count++;
		}
		for (int i = count - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println("OK PALINDROME");

		} else {
			System.out.println("NOT PALINDROMES");
		}
	}
}
