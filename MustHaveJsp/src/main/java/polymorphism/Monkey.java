package polymorphism;

public class Monkey implements AnimalType{

	@Override
	public void run() {
		System.out.println("원숭이가 뜁니다.");
		
	}
	
	@Override
	public void walk() {
		System.out.print("원숭이가 걷습니다.");
	}
}
