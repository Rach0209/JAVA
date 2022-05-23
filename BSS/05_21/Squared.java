// 2의 제곱 수를 32개 나열하고 결과값을 확인해보세요
// 2 4 8 16 32 64 128 256 512 ...

// 사용자의 입력 n, m에 대해
// n^m(n의 m제곱)을 출력하기

// 자판기 프로그램
// 돈 입력
// 반복하여 입력을 받아
// 1번 콜라 : 1500
// 2번 사이다 : 1300
// 3번 계산
// 총 몇 개의 캔을 구입하고, 거스름돈은 얼마인지 출력하세요

// 사용자가 입력한 정수의 약수를 나열하고 총 개수를 출력해보세요.

// 사용자가 입력한 5개의 정수 중 가장 큰 수를 출력하세요.

// 사용자가 입력한 영단어(latin문자열)에서 모음(a e i o u)이 몇 개인지 출력하세요.

// 1번

import java.util.Scanner;

public class Squared {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		long x = 1;
		for (int i = 1; i <=32; i++) {
			x *= 2;
			System.out.println(x);
		}
	}
}