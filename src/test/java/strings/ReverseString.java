package strings;

public class ReverseString {

	public static void main(String[] args) {
		String s="Tushar VIJAYA KAVYA NAVYA";
		String[] str = s.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
	}
}
