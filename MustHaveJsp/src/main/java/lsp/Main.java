package lsp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//리스코프 치환 법칙을 따르지 않는 경우
// 슈퍼클래스인 Member의 createGame 메서드를 서브 클래스인 FreeMember가 대체할 수 없기 때문
// 리스코프 원칙은 슈퍼클래스의 객체와 서브클래스의 객체가 반드시 같은 방식으로 동작해야 함
public class Main {
	public static void main(String[] args) {
		
		List<Member> list = List.of(
				new FreeMember("무과금충 김성수"),
				new PremiumMember("킹갓 제너럴 킹성수")
				);
		
//		ArrayList<Member> list = new ArrayList<>();
//		
//		list.add(new FreeMember("무과금 김성수"));
//		list.add(new PremiumMember("현절리 킹성수"));
		
//List<Member> list = Arrays.asList(new FreeMember("김성수"), new PremiumMember("킹성수"));
		
		for(Member member : list) {
			member.joinGame();
			member.createGame();
		}
		
//		FreeMember fm = new FreeMember("김성수");
//		PremiumMember pm = new PremiumMember("킹성수");
//		
//		fm.createGame();
//		fm.joinGame();
//		
//		pm.createGame();
//		pm.joinGame();
		
	}

}
