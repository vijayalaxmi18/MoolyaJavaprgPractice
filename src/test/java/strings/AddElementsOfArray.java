package strings;

import java.util.Arrays;

public class AddElementsOfArray {

	public static void main(String[] args) {
		int[] a= {1,3,3,4,5,6,6,7,0,2,1};
		
		/*
		 * int sum=0; for(int i=0;i<a.length;i++) { sum=sum+a[i]; }
		 * 
		 * System.out.println(sum);
		 */
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
