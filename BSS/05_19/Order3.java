// 1. 사용자가 입력한 정수가 0이상이며 7의 배수일 때만 true를 출력하세요. 나머지 경우는 false

// 2. 사용자에게 3개의 정수를 입력받아 순서대로 입력된 수일 경우 true를 출력하세요. 나머지 경우는 false
// 예) 1 2 3 -> true, 	4 5 6 -> ture,		7 9 10 -> false
// Order3
// 3. 사용자가 입력한 4자리의 정수가 좌우가 같을 때 true를 출력하세요. 나머지 경우는 false
// 예) 1221 -> true, 	1557 -> false,		9009 -> true

// 2번.

import java.util.Scanner;

public class Order3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("3개의 정수를 순서대로 입력좀 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		++a;
		--c;
		
		boolean result = (a == b) && (b == c);
		System.out.print(result);
	}
}