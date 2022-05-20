// 사용자가 정수를 입력받아
// 짝수면 "짝수입니다". 출력하기
// 홀수면 "홀수입니다". 출력하기

import java.util.Scanner;

public class EvenNum {
	public static void main(String[] args) {
		// 참일경우 문장 1, 2, 5 결과 출력;
		// 거짓일 경우 문장 3, 4, 5 결과 출력;
		
		// if (참/거짓) {
			// 문장 1
			// 문장 2
		// } else {
			// 문장 3
			// 문장 4
		// }
		//  문장 5
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {	
			System.out.println("홀수입니다.");
		}
		
		System.out.println("프로그램 종료");
	}
}