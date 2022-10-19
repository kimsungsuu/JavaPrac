package doWhilePrac;

public class DoWhilePrac {
	
	public static void main(String[] args) {
			int a = 1;
			
			do {
				System.out.println(a);
				
				if(a == 1) {
				System.out.println("1일 1회만 참여할 수 있는 이벤트입니다.");
				}
				a++;
			}while(a <= 1);
	}

}
