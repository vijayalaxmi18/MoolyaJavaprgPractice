package strings;

public class AddingTwoArrayss {

	public static void main(String[] args) {
		String s="VIJAYALAXMI Tippanna patil";
		String[] str = s.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
	}
}
