package abstractEx;

public class Dog extends AnimalType{
	String name;
	int age;
	
	
	public void input(String name, int age) {
		this.age = age;
		this.name = name;
	
		this.howl();
	}
	
	public void howl() {
		System.out.print("\""+ "왈왈!" + "\"" + " 내 이름은 " + name + " 내 나이는 " + age + "이다 멍!");
	}
	
	public void force() {
		System.out.println("강제로 구현해야하는 메소드");
	}
}
