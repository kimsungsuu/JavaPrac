package templatemethodprac;


/**
 * hook method example
 *
 */
public abstract class IntroduceSelfTemplate {

	private final String name;
	private final int age;
	
	public IntroduceSelfTemplate(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public final void introduceOneSelf() {
		sayName();
		sayAge();
		saySpecially();
		sayMessage();
		
	}
	
	public void sayName() {
		System.out.println("안녕하세요 저의 이름은 " + name + "입니다." );
	}
	
	public void sayAge() {
		System.out.println("안녕하세요 저의 나이는 " + age + "입니다.");
	}
	
	/**
	 * 아래 메서드가 hook method
	 */
	
	public void saySpecially() {
		
	}
	
	public abstract void sayMessage();
	
}