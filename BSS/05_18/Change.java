// p.73 2번 (잔돈 계산)

// 받은 돈 : 10000
// 상품의 총액 : 7500
// 부가세 : 750
//잔돈 : 2500

import java.util.Scanner;

public class Change {
	public static void main(String[] args){
		
		Scanner money = new Scanner(System.in);
		
		System.out.print("받은 돈 : ");
		int take = money.nextInt();
		
		int total = 7500;
		int tax = total / 10;
		int chg = take - total;
		
		System.out.println("상품의 총액 : " + total);
		System.out.println("부가세 : " + tax);
		System.out.println("잔돈 : " + chg);

	}
}