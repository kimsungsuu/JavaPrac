package dependencyinjection;


/**
 * CustomerService 인터페이스를 변경시키지 않는 선에서 Customer 클래스를 변경시켜도 Order 클래스에 영향을 주지 않는다.
 * Order 클래스는 Customer 클래스를 사용하지 않고 CustomerService 인터페이스를 사용하기 때문이다. 이로써 느슨한 결합성을 갖게 되었다.
 * 또한 Order 생성자에서 customer = new Customer와 같이 Customer 클래스를 인스턴스화 해서 사용하지 않고 메서드 매개변수에 주입함으로써
 * 의존성 주입을 성립하게 된다.
 * 이를 위해 IoC 클래스를 따로 생성하여 인스턴스를 관리한다.
 */
public class Order {
	private CustomerService customer;
	
	public Order(CustomerService customer) {
		this.customer = customer;
	}
}
