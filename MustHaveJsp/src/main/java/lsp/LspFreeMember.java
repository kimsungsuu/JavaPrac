package lsp;

public class LspFreeMember implements JoinGame{
	
	private final String name;
	
	public LspFreeMember(String name) {
		this.name = name;
	}
	
	@Override
	public void joinGame() {
		System.out.println(name+"게임에 참가합니다.");
	}

}
