package dependencyinjection;

public class IoCContainer {
	public Order getOrder() {
		CustomerService customer = new Customer();
		return new Order(customer);
	}

}
