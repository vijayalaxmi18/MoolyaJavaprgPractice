package patterns;

public class OccuranceOfWrds {

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 8, 10 };
		int[] b = { 3, 4, 5, 5 };
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
