package interviewQuestions;

public class RemoveLetters {

	public static void main(String[] args) {
		String s = "Tushar sharma";

		int countA = 0;
		int countR = 0;
		int countS = 0;
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 's') {
				countS++;
			} else if (c == 'a') {
				countA++;
			} else if (c == 'r') {
				countR++;
			} else {
				res += c;
			}
		}
		if (countS == 1) {
			res += 's';
		}
		if (countR == 1) {
			res += 'r';
		}
		if (countA == 1) {
			res += 'a';
		}
		System.out.println(res);
	}

}
