package polymorphism;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal(new Dog());
		
		animal.run();
		animal.walk();
	}

}
