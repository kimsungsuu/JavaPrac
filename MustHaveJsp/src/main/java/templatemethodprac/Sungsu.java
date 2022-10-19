package templatemethodprac;

/**
 * hook method 구현 클래스
 */
public class Sungsu extends IntroduceSelfTemplate{

	public Sungsu(String name, int age) {
		super(name,age);
	}
	
	
	/**
	 * 아래 클래스는 hook 메서드로써 강제하지 않는 메서드이다.
	 */
	@Override
	public void saySpecially() {
		System.out.println("저의 특기는 노래입니다.");
	}
	
	@Override
	public void sayMessage() {
		System.out.println("제가 하고 싶은 말은 이 회사 꼭 다니고 싶다!입니다.");
	}
	
	public static void main(String[] args) {
		IntroduceSelfTemplate ist = new Sungsu("김성수", 26);
		
		ist.introduceOneSelf();
	}
}