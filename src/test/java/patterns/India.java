package patterns;

public class India {

	public static void main(String[] args) {
		String s = "INDIA";
		String sum = "";
		for (int i = 0; i < s.length(); i++) {
			sum = sum + s.charAt(i);
			System.out.println(sum);
		}
	}
}
