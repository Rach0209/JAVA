// p.101 2번 (나눈 몫과 나머지)  --- 큰 정수가 먼저 오게 합니다.

import java.util.Scanner;

public class ValAndLeft {
	public static void main(String[] args) {
		
		Scanner first = new Scanner(System.in);
		Scanner second = new Scanner(System.in);
		
		
		System.out.print("정수를 입력하세요 : ");
		int a = first.nextInt();
		
		System.out.print("정수를 입력하세요 : ");
		int b = second.nextInt();

		int div = a / b;
		int left = a % b;
		
		System.out.println("몫은 '" + div + "'이고" + "나머지는 '" + left +"'입니다.");
		
		
		// p.101 2번 원래 문제 - 입력 순서 상관없이 큰 정수에서 작은 정수를 나눈 몫과 나머지 
		if (a >= b) {
			System.out.println(a + "를 " + b + "로 나눈 몫은 " + a / b + "이고 " + "나머지는 " + a % b + "입니다.");
		}
		else {
		System.out.println(b + "를 " + a + "로 나눈 몫은 " + b / a + "이고 " + "나머지는 " + b % a + "입니다.");

		}

		
	}
}