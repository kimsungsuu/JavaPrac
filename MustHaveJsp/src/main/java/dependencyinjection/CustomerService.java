package dependencyinjection;


/**
 * interface를 설계하여 Order 클래스와 Customer 클래스 간의 결합도를 낮춘다.
 * @return
 */
public interface CustomerService {
	public void setName(String name);
	public String getName();
	public void setAddress(Address address);
	public Address getAddress();
	public void setEmail(String email);
	public String getEmail();

}
