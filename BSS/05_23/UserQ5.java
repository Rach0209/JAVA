// 사용자가 입력한 5개의 정수 중 가장 큰 수를 출력하세요.

// 5번

import java.util.Scanner;

public class UserQ5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		int num;
		int sum = 0;
		for (x = 1; x <= 5; x++) {
			System.out.print("정수 5개 입력 (" + x + ") : ");
			num = scan.nextInt();
			if (num >= sum) {
			sum = num;
			} else {
				num = 0;
			}
		}
		System.out.print(sum);
		
		
	}
}