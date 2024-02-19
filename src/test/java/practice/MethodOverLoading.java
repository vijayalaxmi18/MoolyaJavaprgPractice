package practice;

public class MethodOverLoading {

	public static void main(String[] args) {

		MethodOverLoading over = new MethodOverLoading();
		int adding = over.add(2, 1);
		String addingString = over.add("Helllo", "hello");
		double addingDouble = over.add(2.2, 3.9);
		System.out.println(addingDouble);
		System.out.println(adding);
		System.out.println(addingString);
	}

	public int add(int a, int b) {
		return a + b;
	}

	public String add(String a, String b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}
}
