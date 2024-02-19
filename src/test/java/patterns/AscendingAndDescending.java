package patterns;

public class AscendingAndDescending {

	public static void main(String[] args) {
		int[] a = { 2, 5, 6, 3 };

		// Sorting in ascending order
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		// Displaying in ascending order
		System.out.println("Ascending Order:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// Displaying in descending order
		System.out.println("Descending Order:");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}
}