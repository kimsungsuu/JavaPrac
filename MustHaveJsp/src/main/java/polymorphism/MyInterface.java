package polymorphism;

public interface MyInterface {
	default void printHello() {
		System.out.println("Hello World!");
	}

}
