import java.util.Scanner;

public class SumForUser {
	public static void main(String[] args) {
		// 사용자가 정수 범위를 지정 (시작-끝 입력받기)
		// 해당범위의 정수의 합.
		Scanner scan = new Scanner(System.in);
		System.out.print("시작 범위 입력 : ");
		int start = scan.nextInt();
		System.out.print("끝 범위 입력 : ");
		int end = scan.nextInt();
		
		int sum = 0;
		for (int a = start; a <= end; a++) {
			sum += a;
		}
		System.out.println("정수 범위의 합은 '" + sum + "' 입니다.");
	}
}