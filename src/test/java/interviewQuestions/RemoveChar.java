package interviewQuestions;

public class RemoveChar {

	public static void main(String[] args) {
		String s="tushar";
		String res="";
		char[] ch = s.toCharArray();
		for(char c:ch) {
			if(c == 't') {
				continue;
			}else if(c == 'r') {
				continue;
			}else if(c == 's') {
				continue;
			}else {
				res+=c;
			}
		}
		System.out.println(res);
	}
}
