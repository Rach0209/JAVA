// while 문 안의 if조건문
public class Loop3 {
	public static void main(String[] args) {
		// 0부터 100사이의 수 중 3의 배수 또는 7의 배수를 출력해보세요
		// 3 6 7 9 12 14 15 ...
		// int x = 0;

		// while (x <= 100) {
			// if (x % 3 == 0 || x % 7 == 0) {
				// System.out.println(x);
			// }
			// x ++;
		// }
		
		// 0부터 100사이의 수 중 일의 자리 수가 3, 6, 9 일때만 출력.
		// 3 6 9 13 16 19 23 26 29 ...
		
		int x = 0;
		while (x <= 100) {
			if (x % 10 == 3 || x % 10 == 6 || x % 10 == 9) {
				System.out.println(x);
			}
			x ++;
		}
	}
}