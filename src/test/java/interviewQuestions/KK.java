package interviewQuestions;

public class KK {

	public static void main(String[] args) {
		String s="pooja go and putt";
		String res="";
		int countp=0;
		int counto=0;
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == 'p') {
				countp++;
			}else if(c == 'o') {
				counto++;
			}else {
				res+=c;
			}
		}
		if(countp == 1) {
			res+='p';
		}
		if(counto == 1) {
			res+= 'o';
		}
System.out.println(res);
	}

}
