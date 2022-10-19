package lsp;

import java.util.ArrayList;
import java.util.List;

// 이 클래스는 리스코프의 치환 원칙을 준수한 방식
public class LspMain {
	public static void main(String[] args) {
		List<JoinGame> list = List.of(
				new LspFreeMember("김성수"),
				new LspPremiumMember("킹성수")
				);
		
		for(JoinGame member : list) {
			member.joinGame();
		}
		
		List<CreateGame> list2 = List.of(
//				new LspFreeMember("김성수"), 서로의 타입이 다르므로 즉, LspFreeMember에선 createGame을 구현하지 않기 때문에 리스트에 등록 x
				new LspPremiumMember("킹성수")
				);
		
		
		for(CreateGame member2 : list2) {
			member2.createGame();
		}
		
		
	}
}
