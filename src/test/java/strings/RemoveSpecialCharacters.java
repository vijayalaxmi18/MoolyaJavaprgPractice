package strings;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String s="v4775669 tushar 1234 >,/[[[8368273947";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
