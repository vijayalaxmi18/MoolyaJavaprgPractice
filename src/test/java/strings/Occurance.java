package strings;

import java.util.HashSet;

public class Occurance {

	public static void main(String[] args) {
		String s = "VIJAYALAXMI pooooo vvvvvvvvvvvvvvvvvvvv";
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		for (Character ch : hs) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch.equals(s.charAt(i))) {
					count++;
				}
			}
			System.out.println(ch + "  OCCURING   " + count);
		}
	}
}
