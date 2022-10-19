package lsp;

public class FreeMember extends Member{
	private String name;
	
	public FreeMember(String name) {
		super(name);
		this.name = name;
	}
	
	@Override
	public void joinGame() {
		System.out.println(name + "님이 게임에 참가합니다.");
	}
	
	@Override
	public void createGame() {
		System.out.println(name + "님은 게임에 참가할 수 없습니다.");
	}

}
