package patterns;

public class RecursionUsingNo {

	public static void main(String[] args) {
		naturalNumbers(1);
    }

    // Recursive method to print numbers from start to 100
    public static void naturalNumbers(int n) {
        // Base case: stop recursion when reaching 101
        if (n <= 100) {
            System.out.println(n);
            // Recursive call with the next number
            naturalNumbers(n + 2);
        }
    }
}
	


