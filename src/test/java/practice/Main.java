// Superclass
package practice;

class Animal {
	public void makeSound() {
		System.out.println("Animal makes a generic sound");
	}
}

// Subclass
class Dog extends Animal {
	// Override the makeSound method to provide a specific implementation for dogs
	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}
}

// Subclass
class Cat extends Animal {
	// Override the makeSound method to provide a specific implementation for cats
	@Override
	public void makeSound() {
		System.out.println("Cat meows");
	}
}

public class Main {
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal animal2 = new Dog(); // Upcasting
		Animal animal3 = new Cat(); // Upcasting

		// Call makeSound method for each object
		animal1.makeSound(); // Output: Animal makes a generic sound
		animal2.makeSound(); // Output: Dog barks
		animal3.makeSound(); // Output: Cat meows
	}
}