package interviewQuestions;

public class Remove {

	public static void main(String[] args) {
		String s="vijayalaxmi";
		String res="";
		char[] ch = s.toCharArray();
		for(char c:ch) {
			if(c=='a') {
				continue;
			}
			else if(c=='l') {
				continue;
			}
			else if(c=='m') {
				continue;
			}
			else {
				res+=c;
			}
		}
		System.out.println(res);
		
	}

}
