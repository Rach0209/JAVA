public class Loop2 {
	public static void main(String[] args) {
		//1 ~ 10000 까지 출력하세요.
		// int i = 1;
		// while (i <= 10000) {
			// System.out.println(i);
			// i++;
		// }
		
		// 20 ~ 29까지 출력하기
		
		// int j = 20;
		// while (j <= 29) {
			// System.out.println(j);
			// i++;
		// }
		
		// 10 9 8 ~~~ 0 까지 
		// int k = 10;
		// while (k >= 0) {
			// System.out.println(k);
			// k--;
		// }
		
		// 100보다 작은 3의 배수를 출력해보세요 ~~
		// int l = 0;
		// while (l <= 33) {
			// System.out.println(l*3);
			// l++;
		// }
		// int l1 = 0;
		// while (l1 < 100) {
			// System.out.println(l1);
			// l1 += 3;
		// }
		
		// ☆
		// ★
		// ☆
		// ★
		// ☆
		// ★
		// ☆
		// ★
		int star = 0;
		while (star <= 7) {
			System.out.println((star % 2 == 0) ? "☆" : "★");
			star ++;
		}
		
		// int star0 = 0;
		// while (star0 <= 7) {
			// if (star0 % 2 == 0) {
				// System.out.println("☆");
			// } else {
				// System.out.println("★");
			// }
			// star0 ++;
		// }

	}
}