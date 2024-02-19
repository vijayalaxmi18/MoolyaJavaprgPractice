package interviewQuestions;

public class RemoveParticularLetters {

	public static void main(String[] args) {
		String s = "my name is Vijayalaxmi";
		String res = "";
		int countM = 0;
		int countA = 0;

		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			if (c == 'm') {
				countM++;
			} else if (c == 'a') {
				countA++;
			} else {
				res += c;
			}
		}

		// Append 'm' and 'a' if they occurred only once in the original string
		if (countM == 1) {
			res += 'm';
		}
		if (countA == 1) {
			res += 'a';
		}

		System.out.println(res);
	}
}
