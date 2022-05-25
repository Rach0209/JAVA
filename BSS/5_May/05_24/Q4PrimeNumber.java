// 사용자에게 비밀번호를 물어보고 동일할 경우 통과
// 최대 3번의 기회를 줌

// Fizz Buzz
// 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz 16...
// 100까지 3의 배수 = Fizz 5의배수 = Buzz 공통 = Fizz Buzz

// Fibonacci 수열
// 1 1 2 3 5 8 13 21 34 ...
// 100이하

// 사용자가 입력한 정수가 소수임을 확인하여 출력하는 프로그램

// 4번

import java.util.*;

public class Q4PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("소수인지 확인할 정수 입력");

		int num = scan.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count ++;
			}
		}
		if (count == 2) {
			System.out.println("소수 입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
		
	}
}