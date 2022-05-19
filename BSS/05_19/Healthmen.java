// 사용자가 3대 측정
// 벤치, 스쿼트, 데드
// 합이 500이상이면 true
// false

import java.util.Scanner;

public class Healthmen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("벤치 몇? ");
		int bench = scan.nextInt();
		System.out.print("스쿼트 몇? ");
		int squat = scan.nextInt();
		System.out.print("데드 몇? ");
		int dead = scan.nextInt();
		
		
		boolean result = bench + squat + dead >= 500;
		System.out.print(result);
		
	}

}