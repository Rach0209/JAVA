// 사용자에게 비밀번호를 물어보고 동일할 경우 통과
// 최대 3번의 기회를 줌

// Fizz Buzz
// 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz 16...
// 100까지 3의 배수 = Fizz 5의배수 = Buzz 공통 = Fizz Buzz

// Fibonacci 수열
// 1 1 2 3 5 8 13 21 34 ...
// 100이하

// 사용자가 입력한 정수가 소수임을 확인하여 출력하는 프로그램

// 1번 비밀번호

import java.util.*;

public class Q1Password {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password = "qwer";
		System.out.println("비밀번호 입력");
		String word = scan.nextLine();
		int count = 3;
		for (int i = 0; i < 3; i++) {
			if (word.equals(password)) {
				System.out.println("잠금 해제");
				break;
			} else if (!word.equals(password)) {
				System.out.println("남은 입력 기회 : " + count);
				System.out.println("비밀번호 입력");
				word = scan.nextLine();
				count--;
			} if (count == 0 && !word.equals(password)) {
				System.out.println("접근 금지");
			} else if (count == 0 && word.equals(password)) {
				System.out.println("잠금 해제");
			}
		}
	}
}