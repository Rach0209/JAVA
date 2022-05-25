// 정수 2개와 연산자(문자열 + - * /) 등을 입력받아 사칙연산을 수행하는 계산기 프로그램

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("계산할 정수 하나를 입력 하세요 : ");
		int x = scan.nextInt();
		scan.nextLine();
		System.out.print("계산할 연산자( +, -, *, /)를 입력 하세요 : ");
		String symbol = scan.nextLine();
		System.out.print("계산할 정수 나머지를 입력 하세요 : ");
		int y = scan.nextInt();
		
		// int calc;
		// if (symbol.equals("+")) {
			// calc = x + y;
			// System.out.println("값은 : " + calc + "입니다.");
		// } else if (symbol.equals("-")) {
			// calc = x - y;
			// System.out.println("값은 : " + calc + "입니다.");
		// } else if (symbol.equals("*")) {
			// calc = x * y;
			// System.out.println("값은 : " + calc + "입니다.");
		// } else if (symbol.equals("/")) {
			// calc = x / y;
			// System.out.println("값은 : " + calc + "입니다.");
		// } else {
			// System.out.print("보여준 연산자( +, -, *, /)만 입력해!!");
		// }
		
			int calc = 0; // 변수를 항상 초기화를 시켜야함. 그렇지 않으면 컴파일러 에러; 사용자가 사용하지 않을 만한 값을 입력하기
			// 보기싫으면 그 값을 공백으로 처리해버림; => (46줄 if절)
			if (symbol.equals("+")) {
				calc = x + y;	
			} else if (symbol.equals("-")) {
				calc = x - y;
			} else if (symbol.equals("*")) {
				calc = x * y;
			} else if (symbol.equals("/")) {
				calc = x / y;
			} else {
				System.out.print("보여준 연산자( +, -, *, /)만 입력해라 했자너!!");
			}
			if (calc == 0){
				System.out.println("");
			} else {
				System.out.println("값은 : " + calc + "입니다.");
			}
		System.out.println("프로그램을 종료합니다.");
	}
}