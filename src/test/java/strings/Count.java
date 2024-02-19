package strings;

public class Count {

	public static void main(String[] args) {
		String test="aabbccxx";
		//outer loop
		for(int i=0;i<test.length();i++) {
			int count=1;
			//inner loop
			for(int j=i+1;j<test.length();j++) {
				if(test.charAt(i)==test.charAt(j)) {
					count++;
					i++;//Move to the next character to avoid counting the same character again
				}else {
					break;//Break the inner loop if consecutive characters are not the same
				}
			}
			System.out.println(test.charAt(i)+" "+count);
		}

	}

}
