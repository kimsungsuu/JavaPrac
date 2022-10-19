package lsp;

public class LspPremiumMember implements JoinGame, CreateGame{
	private final String name;
	
	public LspPremiumMember(String name) {
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
