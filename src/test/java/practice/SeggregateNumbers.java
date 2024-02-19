package practice;

public class SeggregateNumbers {

	public static void main(String[] args) {
		String s = "ssdd464377&&@&&@&";
		String cha = "";
		String num = "";
		String oth = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				num = num + s.charAt(i);
			} else if (ch >= 'a' && ch <= 'z') {
				cha = cha + s.charAt(i);
			} else {
				oth = oth + s.charAt(i);
			}
		}
		System.out.println(num);
		System.out.println(cha);
		System.out.println(oth);
	}

}
