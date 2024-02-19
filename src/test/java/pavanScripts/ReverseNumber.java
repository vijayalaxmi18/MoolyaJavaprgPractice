package pavanScripts;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=1234;
		while(num>0) {
			int rev = num%10;
			num=num/10;//4321
			System.out.print(rev);
		}

	}

}
