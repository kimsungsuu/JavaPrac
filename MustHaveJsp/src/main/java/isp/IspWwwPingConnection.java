package isp;

public class IspWwwPingConnection implements IspHttpConnection{
	
	private final String www;
	
	public IspWwwPingConnection(String www) {
		this.www = www;
	}
	
	@Override
	public void http() {
		System.out.print("Setup on the ping" + www);
	}
	
	@Override
	public void connect() {
		
	}

}
