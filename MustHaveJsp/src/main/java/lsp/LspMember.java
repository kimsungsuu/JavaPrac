package lsp;

public abstract class LspMember implements JoinGame, CreateGame{
	private final String name;
	
	public LspMember(String name) {
		this.name = name;
	}
}
