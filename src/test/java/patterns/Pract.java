package patterns;

public class Pract {

	public static void main(String[] args) {
		int[] a = { 2, 4, 3, 3, 4 };
		int sum=6;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==sum) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}
}
