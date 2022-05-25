// 0 ~ 9까지의 무작위 수를 정하여
// 사용자가 해당하는 수의 배수를 순서대로 입력하게 하여
// 틀릴 경우 종료

// 예) 랜덤 수가 6일 경우

// 사용자 입력
// 6 O
// 12 O
// 21 X 종료

import java.util.Scanner;
import java.util.Random;

public class RandomMultiple {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int x = random.nextInt(8) + 2;
		// while (true) {			// 같은 방법 -- 루프로 문제에 0과 1이 나오지 않게 하기
			// x = random.nextInt(10);
			// if (x > 2) {
				// break;
			// }
		// }
		
		int count = 1;
		System.out.println(x + "의 배수를 순서대로 입력");
		for (int i = 0; i < count; i++) {
			int num = scan.nextInt();
			if (num == (count * x)) {
				System.out.println("OK 다음");
				count++;
				continue;
			}
			
		}
		System.out.println("땡!!! 틀림 ㅅㄱ");
		System.out.println("-------------------------------");
		//-------------------------------------------------------------------------------------------
		// 강사쌤 간단 버전
		System.out.println(x + "의 배수를 순서대로 입력");
		int answer = 0;
		while (true) {
			answer += x;
			int userInput = scan.nextInt();
			
			if (answer != userInput) {
				break;
			}
			System.out.println("다음");
		}
		System.out.println("땡!!! 틀림 ㅅㄱ");
	}
}