package patterns;

public class Divya {

	public static void main(String[] args) {
		String s = "DIVYA,vijayalaxmi,Moolya";
		String[] str = s.split(",");
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i] + " ");
		}
	}
}
