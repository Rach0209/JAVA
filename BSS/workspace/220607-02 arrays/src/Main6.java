// 사용자에게 5번의 정수를 입력받아
// 최근 입력한 순(역순)으로 출력하기

// 예) 10 20 30 40 50 => 50 40 30 20 10

// 사용자가 0이하의 정수를 입력할 때가지 반복하여 입력
// 최근 5개를 출력 (순서 상관없음)

// 예) 10 20 30 40 50 60 70 80 90 100 -1 => 90 80 70 60 100
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idx = 0;
		int[] number = new int[5];
		while (true) {
			System.out.println("정수 입력.");
			int count = scan.nextInt();
			if (count <= 0) {
				break;
			}
			number[idx] = count;
			idx++;
			if (idx == 5) {
				idx = 0;
			}
		}
		for (int i = 4; i >= 0; i--) {
			System.out.println(number[i]);
		}
	}
}
