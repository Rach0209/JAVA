import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		int x, y, r; // 같은 지역에 변수를 선언 할 때, 쉼표로 구분지어 나열 가능; 편한 방법으로 사용;
		// int x = 1, y = 2, r = 3; 초기화 방법
		System.out.print("두 개의 정수를 입력하시오(큰 수, 작은 수): ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();

		while (y != 0) {
		r = x % y;		
		x = y;
		y = r;
		}
		System.out.printf("최대 공약수는 %d입니다.\n", x);
	}
}