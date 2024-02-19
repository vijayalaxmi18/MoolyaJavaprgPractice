package practice;

public class MethodOverriding {

	public static void main(String[] args) {
		

	}

}

class Phone{
	
	public void call() {
		System.out.println("calling");
	}
}

class Iphone extends Phone{
	public void call() {
		
		System.out.println();
	}
}
