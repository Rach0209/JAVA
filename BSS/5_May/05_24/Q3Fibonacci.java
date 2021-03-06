// 사용자에게 비밀번호를 물어보고 동일할 경우 통과
// 최대 3번의 기회를 줌

// Fizz Buzz
// 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz 16...
// 100까지 3의 배수 = Fizz 5의배수 = Buzz 공통 = Fizz Buzz

// Fibonacci 수열
// 1 1 2 3 5 8 13 21 34 ...
// 100이하

// 사용자가 입력한 정수가 소수임을 확인하여 출력하는 프로그램

// 3 번

import java.util.*;

public class Q3Fibonacci {
	public static void main(String[] args) {
		int x = 0;
		int count = 1;
		int fibo = 1;
		int num = 0;
		for (int i = 0; i <= num ; i++) {
			if (fibo <= 100) {
				System.out.println(fibo);
				fibo = x + count;
				x = count;
				count = fibo;
				num ++;
			} 
		}
	}
}