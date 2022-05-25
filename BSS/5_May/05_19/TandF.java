// 사용자가 입력한 정수가
// 짝수면 true
// 홀수면 false를 출력해보세요.

import java.util.Scanner;

public class TandF {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 하쇼 : ");
		int x = scan.nextInt();
		
		boolean result = x % 2 == 0;
		System.out.println("짝수면 true, 홀수면 false 임!!: " + result);
	}
}