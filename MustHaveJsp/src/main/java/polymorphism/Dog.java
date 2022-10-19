package polymorphism;

public class Dog implements AnimalType{

	@Override
	public void run() {
		System.out.println("개가 달립니다");
		
	}

	@Override
	public void walk() {
		System.out.println("개가 걷습니다.");
	}
}
