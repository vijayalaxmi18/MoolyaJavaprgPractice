package interviewQuestions;

public class RemoveDuplicateFromGivenString {

	public static void main(String[] args) {
		String s="poooooja";
		String res="";
		char[] ch = s.toCharArray();
		for(char c:ch) {
			if(c != 'o') {
				res+=c;
			}
		}
		System.out.println(res);
	}
}
