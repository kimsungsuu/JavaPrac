package switchPrac;

import java.util.Scanner;

public class SwitchPrac {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int grade = sc.nextInt();
		
		switch(grade) {
		case(100):
			System.out.println("A");
		break;
		case(90):
			System.out.println("B");
		break;
		case(80):
			System.out.println("C");
		break;
		default:
			System.out.println("F");
		break;
		}
	}

}
