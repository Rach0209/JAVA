// 사용자가 입력한 5개의 정수 중 가장 큰 수를 출력하세요.

// 5번

import java.util.Scanner;

public class UserQ5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max;
		int first = scan.nextInt();
		max = first;
		
		for (int i = 0; i < 4; i++) {
			int next = scan.nextInt();
			
			if (max < next) {
				max = next;
			}
		}
		System.out.println("최대값 : " + max);
		
		// 내가 짠 코드.
		int num;
		int bigone = 0;
		for (int x = 1; x <= 5; x++) {
			System.out.print("정수 5개 입력 (" + x + ") : ");
			num = scan.nextInt();
			if (num >= bigone) {
			bigone = num;
			} else {
				num = 0;
			}
		}
		System.out.print("가장 큰 수 : " + bigone);
		
		
	}
}