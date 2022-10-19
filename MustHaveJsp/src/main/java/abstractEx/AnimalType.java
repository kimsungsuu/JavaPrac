package abstractEx;

public abstract class AnimalType {
	
	//추상 필드
	String name;
	int age;

	public AnimalType() {} 	// 기본 생성자
	
	public void input(String name, int age) {
		this.age = age;
		this.name = name;
		
		this.howl();
	}

	public void howl() {
		System.out.println( "내 이름은 " + name + "내 나이는 " + age);
	}
	
	// 추상메서드 
	// 하위클래스에서 무조건 구현을 해야함
	abstract void force();
	
}
