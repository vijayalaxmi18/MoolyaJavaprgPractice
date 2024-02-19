package pavanScripts;

public class ReverseNumberUsingRecursion {

	public static void main(String[] args) {
		rev(123);
		rev(6278);
	}
	
	public static void rev(int num) { 
		if(num<10) {
			System.out.println(num);
			return;
		}else {
			System.out.print(num%10);
			rev(num/10);
		}
	}

}
