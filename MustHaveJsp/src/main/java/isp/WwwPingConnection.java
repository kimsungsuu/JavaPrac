package isp;

public class WwwPingConnection implements Connection{
	
	private final String www;
	
	public WwwPingConnection(String www) {
		this.www = www;
	}
	
	@Override
	public void http() {
		System.out.println("Setup an HTTP connection to " + www);
	}
	
	@Override
	public void connection() {
		
	}
	
	//사용하지 않는 기능이지만 ISP를 지키지 않았기 때문에 강제로 구현해야 합니다.
	@Override
	public void socket() {
		
	}

}
