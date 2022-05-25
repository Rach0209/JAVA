// 사용자의 입력 n, m에 대해
// n^m(n의 m제곱)을 출력하기

// 2번

import java.util.Scanner;

public class UserSquared {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력하라 : ");
		long n = scan.nextLong();
		System.out.print("제곱 수 입력하라 : ");
		long m = scan.nextLong();
		
		long x = 1;
		for (int i = 1; i <= m; i++) {
			x *= n;
		}
		System.out.println(n + "의 " + m + "승");
		System.out.println("값은 : " + x);
	}
}