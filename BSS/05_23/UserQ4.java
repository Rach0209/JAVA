// 사용자가 입력한 정수의 약수를 나열하고 총 개수를 출력해보세요.

// 4번

import java.util.Scanner;

public class UserQ4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = scan.nextInt();
		int count = 0;
		for (int x = 1; x <= num; x++) {
			if (num % x == 0) {
				System.out.println(x);
				count ++;
			}
			
		}
		System.out.println(count + "개");
	}
}