// p.101 2번 (나눈 몫과 나머지)  --- 큰 정수가 먼저 오게 합니다.

import java.util.Scanner;

public class ValAndLeft {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = scan.nextInt();
		
		System.out.print("정수를 입력하세요 : ");
		int b = scan.nextInt();

		int div = a / b;
		int left = a % b;
		// 구분을 위한 공백은 줄바꿈 하여도 인식 가능하다.
		System.out.println("몫은 '" + div + "'이고"
							+ "나머지는 '" + left +"'입니다.");
		// printf => 서식 메소드를 사용하여 나타내기
		System.out.printf("%d을 %d으로 나눈 몫은 %d이고 나머지는 %d입니다.\n", a, b, a / b, a % b);
		
				// System.out.printf("%dHello %dWorld%d\n", 1, 2, 3);
		// System.out.printf("Hello %dWorld", 2);
		// // printf 에서만 사용 가능하다.
		// System.out.println("%dHello");
		
		// p.101 2번 원래 문제 - 입력 순서 상관없이 큰 정수에서 작은 정수를 나눈 몫과 나머지 
		if (a >= b) {
			System.out.println(a + "을 " + b + "으로 나눈 몫은 " + a / b + "이고 " + "나머지는 " + a % b + "입니다.");
		}
		else {
		System.out.println(b + "를 " + a + "으로 나눈 몫은 " + b / a + "이고 " + "나머지는 " + b % a + "입니다.");

		}
	}
}