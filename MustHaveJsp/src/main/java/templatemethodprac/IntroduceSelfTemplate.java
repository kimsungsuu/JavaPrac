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
	
	/**
	 * 아래 메서드는 공통 스팟으로 볼 수 있다.
	 */
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
	 * 아래 메서드는 핫 스팟으로 볼 수 있다.
	 */
	
	public void saySpecially() {
		
	}
	
	public abstract void sayMessage();
	
}