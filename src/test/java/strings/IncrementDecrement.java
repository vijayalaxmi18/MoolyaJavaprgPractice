package strings;

public class IncrementDecrement {

	public static void main(String[] args) {
		String s = "123djd8jsuhdhi^&*@&";
		String cha = "";
		String num = "";
		String oth = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				cha = cha + s.charAt(i);
			} else if (ch >= '0' && ch <= '9') {
				num = num + s.charAt(i);
			} else {
				oth = oth + s.charAt(i);
			}
		}
		System.out.println(num);
		System.out.println(oth);
		System.out.println(cha);
	}
}
