package polymorphism;

public class Animal {
		AnimalType animalType;
		
		public Animal(AnimalType animalType) {
			this.animalType = animalType;
		}
		
		public void run() {
			animalType.run();
		}
		
		public void walk() {
			animalType.walk();
		}
	}

