// 4단 말고도... 사용자의 입력을 받아 원하는 단수의 구구단 출력하는 프로그램.

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 4 * 1 = 4
		// 4 * 2 = 8
		// 4 * 3 = 12
		// 4 * 4 = 16
		// 4 * 5 = 20
		// 4 * 6 = 24
		// 4 * 7 = 28
		// 4 * 8 = 32
		// 4 * 9 = 36
		System.out.print("구구단 몇단 ? ");
		int input = scan.nextInt();
		int x = 1;	
		while (x <= 9) {
			if (input <= 9) {
			// System.out.println("4 * " + x + " = " + (x*4));
			System.out.printf("%d * %d = %d\n", input, x, input * x);
			x ++;
			}
		}

	}
}