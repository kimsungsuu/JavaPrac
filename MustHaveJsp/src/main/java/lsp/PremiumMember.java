package lsp;

public class PremiumMember extends Member{

	private String name;
	
	public PremiumMember(String name) {
		super(name);
		this.name = name;
	}
	
	@Override
	public void joinGame() {
		System.out.println(name + "님이 게임에 참가합니다.");
	}
	
	@Override
	public void createGame() {
		System.out.println(name + "님이 게임을 생성합니다.");
	}
}
