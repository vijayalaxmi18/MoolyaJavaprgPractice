package patterns;

public class EvenOddNumbers {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println("=====================================");
		for (int j = 0; j <= 100; j++) {
			if (j % 2 != 0) {
				System.out.println(j + " ");
			}
		}
	}
}
