// 사용자의 점수(정수)를 입력받아
// 60점 이상이면 "합격" 출력
// 60점 미만이면 "불합격" 문자열과 부족한 점수도 같이 출력

import java.util.Scanner;

public class PassFail {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수(정수)를 입력 하세요 : ");
		int score = scan.nextInt();
		
		// 관계연산자 >= 
		if (score >= 60) {
			System.out.println("합격!");
		} else {
			int fail = 60 - score;
			System.out.println("불합격ㅋㅋ ");
			System.out.println("부족한 점수 : " + fail);
			// System.out.println("부족한 점수 : " + (60 - score));
			System.out.printf("부족한 점수 : %d\n", 60 - score);
			System.out.printf("%s %d", "부족한 점수 :", 60 - score);
		}
	}
}