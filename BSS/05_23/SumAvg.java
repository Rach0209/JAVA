// 사용자가 몇 개의 정수를 입력할지 먼저 정한 후.
// 정수를 입력하면
// 합과 평균을 구해서 출력하는 프로그램.

// 짝수
// 홀수

import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" 몇 개의 정수를 입력 할것인고? ");
		int num = scan.nextInt();
		int sum = 0;
		int sum2 = 0;
		int evencount = 0;
		int oddcount = 0;
		System.out.println("정수를 입력 하라 ");
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " : ");
			int a = scan.nextInt();
			if (a % 2 == 0) {
				sum += a;
				evencount++;
			} else if (a % 2 == 1) {
				sum2 += a;
				oddcount++;
			}
		}
		System.out.println("짝수의 합 : " + sum);
		System.out.println("홀수의 합 : " + sum2);
		System.out.println("짝수의 평균 : " + (sum /(double) evencount));
		System.out.println("홀수의 평균 : " + (sum2 /(double) oddcount));
		
		
		// for (int i = 1; i <= num; i++) {
			// System.out.print(i + " : ");
			// sum += scan.nextInt();
			// // int a = int값 따로 안주고 sum에 바로 주기
		// }
			// avg = sum / num;
		// System.out.print("입력한 정수들의 합은 '" + sum + "'이고,\n");
		// System.out.print("평균은 '" + avg + "'이다."); // avg 대신 (sum / num) 가능;
		
	
	}
}