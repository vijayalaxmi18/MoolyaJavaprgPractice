package patterns;

public class AddingTwoArrays {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 8 };
		int[] b = { 2, 3, 2, 3, 3, 2 };
		int count = a.length;
		if (a.length < b.length) {
			count = b.length;
		}
		for (int i = 0; i < count; i++) {
			try {
				System.out.println(a[i] + b[i]);
			} catch (Exception e) {
				if (a.length > b.length) {
					System.out.println(a[i]);
				} else {
					System.out.println(b[i]);
				}
			}
		}
	}
}
