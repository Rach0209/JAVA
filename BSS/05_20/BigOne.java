// 3개의 정수를 입력받아
// 가장 큰 수를 출력하세요.

import java.util.Scanner;

public class BigOne {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("3개중 1번째 정수 입력좀 ~ : ");
		int x = scan.nextInt();
		System.out.print("3개중 2번째 정수 입력좀 ~ : ");
		int y = scan.nextInt();
		System.out.print("3개중 3번째 정수 입력좀 ~ : ");
		int z = scan.nextInt();
		
		int big;
		if (x > y && x > z ) {
			big = x;
		} else if (y > x && y > z) {
			big = y;
		} else {
			big = z;
		}
		System.out.println(big);
		
		int max;
		if (x > y) {
			if (x > z) {
				max = x;
			} else {
				max = z;
			}
		} else {
			if (y > z) {
				max = y;
			} else {
				max = z;
			}
		}	
		
		
		System.out.println("가장 큰 수는 : " + max);
	}
}