package abstractEx;

public class Cat extends AnimalType{
	
	String name;
	int age;
	
	public void input(String name, int age) {
		
		this.age = age;
		this.name = name;
		
		this.howl();
	}
	
	public void howl() {
		System.out.print("\""+ "니아옹~" + "\"" + " 내 이름은 " + name + " 내 나이는 " + age + "이다 냐옹~");
	}
	
	
	public void force() {
		System.out.println("강제로 구현해야하는 메소드");
	}
	
	// 만약 input 메서드에 String woman 필드를 임의로 추가해서 추상 클래스와 다르게 구현한다면 값을 넘겨주지 않는다.(에러는 발생하지 않음)
	
	
}
