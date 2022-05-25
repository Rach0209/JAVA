// 사용자가 입력한 원하는 반복 만큼만
// 0부터 1씩 증가하는 수를 출력하기.

import java.util.Scanner;

public class Loop4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 반복 수 입력 : ");
		int x = scan.nextInt();
		int y = 0;
		while (y < x) {
			System.out.println(y);
			y++;
		}
	}
}