// 구구단
// 2단부터 9단까지

public class Gugudan2 {
	public static void main(String[] args) {
		System.out.println("구구단 2단부터 9단까지");
		for (int j = 2; j <= 9; j++) {				// outerLoop
			for (int i = 1; i <= 9; i++) {			// innerLoop
				System.out.printf("%d * %d = %d\n", j, i, j * i);
			}
			System.out.println("--------------");
		}
	}
}