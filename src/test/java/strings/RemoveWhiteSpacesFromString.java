package strings;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		String s="vijaya       divya       sadiya";
		s=s.replaceAll("[\\s]", "");
		System.out.println(s);

	}

}
