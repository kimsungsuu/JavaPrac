package staticPractice;

public class StaticPractice {

	static String name = "kimsungsu";
	
	public static void staticMethod() {
		String staticMethod = "kimsungsu";
		System.out.println(staticMethod);
	}
	
	public static void main(String[] args) {
		System.out.println(name);
		StaticPractice.staticMethod();
		
		
	}
}
