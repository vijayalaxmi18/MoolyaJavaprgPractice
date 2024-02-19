package strings;

public class AddingTwoArrays {

	public static void main(String[] args) {
		int[] a = { 3, 4, 5, 10, 17 };
		int sum=15;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==sum) {
					System.out.println(a[i]+ " "+a[j]);
					break;
				}
			}
		}
	}
}
