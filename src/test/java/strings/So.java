package strings;

public class So {

	public static void main(String[] args) {
		String s = "my name is Vijayalaxmi";
		String res="";
		int count = 0;
		int counter=0;
			char[] c = s.toCharArray();
			for(int j=0;j<c.length;j++) {
				if(c[j]=='m') {
					count++;
				}
				if(c[j]=='a') {
					counter++;
				}
				if(count==1) {
					res+=c[j];
				}
				else {
					continue;
				}
				if(counter==1) {
					res+=c[j];
				}
				else {
					continue;
				}
				res+=c[j];
			}
			
            System.out.println(res);
		}

}
