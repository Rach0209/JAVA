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
		
		int calc;
		if (symbol.equals("+")) {
			calc = x + y;
			System.out.println(calc);
		} else if (symbol.equals("-")) {
			calc = x - y;
			System.out.println(calc);
		} else if (symbol.equals("*")) {
			calc = x * y;
			System.out.println(calc);
		} else if (symbol.equals("/")) {
			calc = x / y;
			System.out.println(calc);
		} else {
			System.out.print("보여준 연산자( +, -, *, /)만 입력해!!");
		}
	}
}