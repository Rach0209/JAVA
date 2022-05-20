// 정수 2개를 입력받아서 큰 수에서~ 작은 수로 나눈 몫(정수)과 나머지를 출력하세요.

import java.util.Scanner;

public class DivLeft{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 : ");
		int x = scan.nextInt();
		
		System.out.print("한번 더 입력해 주세요 : ");
		int y = scan.nextInt();
		
		// 내가 짠 코드 -- 출력 값에 한글 대신 영어로 하면 모두 고쳐야 하는 번거로움이 있다. 쌤이 짠 코드처럼 마지막에 출력하는게 유리
		// if (x >= y) {
			// System.out.printf("%s %d, %s %d\n", "몫 :", (x / y), "나머지 :", (x % y));
		// } else {
			// System.out.printf("%s %d, %s %d\n", "몫 :", (y / x), "나머지 :", (y % x));
		// }
		
		int div;
		int mod;
		
		if (x != 0 && y != 0) {
			if (x > y) {
				// x / y, x % y 계산하기
				div = x / y;
				mod = x % y;
			} else {
				// y / x, y % x 계산하기
				div = y / x;
				mod = y % x;
			}
			// 결과 출력하기
			System.out.println("몫: " + div);
			System.out.println("나머지: " + mod);
		} else {
			System.out.println("0은 입력 하는거 아닙니다^^");
		}
	}
}