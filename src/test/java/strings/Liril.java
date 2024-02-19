package strings;

public class Liril {

	public static void main(String[] args) {
		String s = "liril";
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
			System.out.println("yes palindrome");
		} else {
			System.out.println("No palindrome");
		}
	}
}
