package practice;

public class MainAnimal {

	public static void main(String[] args) {
		Father sm=new Father();
		sm.smoking();
		Father sm2=new Son(); //Upcasting
		sm2.smoking();
	}

}
//super class
class Father{
	public void smoking() {
		System.out.println("Father is a smoker");
	}
}

//Sub class
class Son extends Father{
	public void smoking() {
		System.out.println("Son is chain smoker");
	}
}