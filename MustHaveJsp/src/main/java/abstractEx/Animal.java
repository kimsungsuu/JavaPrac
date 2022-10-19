package abstractEx;

public class Animal {
	AnimalType animalType;
	
	public Animal(AnimalType animalType) {
		this.animalType = animalType;
	}
	
	public void input(String name, int age) {
		animalType.input(name, age);
	}
}
