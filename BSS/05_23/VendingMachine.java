// 자판기 프로그램
// 돈 입력
// 반복하여 입력을 받아
// 1번 콜라 : 1500
// 2번 사이다 : 1300
// 3번 계산
// 총 몇 개의 캔을 구입하고, 거스름돈은 얼마인지 출력하세요 (외상 안 됨).

// 3번

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("돈 입력해 : ");
		int money = scan.nextInt();
		System.out.println("---------------------------------");
		// coke = 1500;
		// cider = 1300;
		int coke = 0;
		int cider = 0;
		for (int count = 0; count < 3; ) {
			System.out.print("1 : 콜라 2 : 사이다 3 : 결제\n 번호를 입력하세요 : ");
			count = scan.nextInt();
			if (count == 1) {
				System.out.println("콜라 선택했다!");
				System.out.println("---------------------------------");
				coke++;
			} else if (count == 2) {
				System.out.println("사이다 골랐다!");
				System.out.println("---------------------------------");
				cider++;
			} else if (count == 3) {
				System.out.println("---------------------------------");
				System.out.println("결제창");
				System.out.println("---------------------------------");
			}
		}
		int sum = (coke * 1500) + (cider * 1300);
		int submoney = 0;
		int more = money - sum;
		System.out.println("투입한 금액 : " + money);
		System.out.println("콜라 : " + coke +"캔");
		System.out.println("사이다 : " + cider +"캔");
		System.out.println("상품 총 금액 : " + sum );
		System.out.println("---------------------------------");
		
		if (more < 0) {
			System.out.println("돈이 부족 하잖아. 먹고싶다면 더 가져와^^\n필요한 금액 : " + (sum - money));
			System.out.print("어서 나에게 주렴 : ");
			submoney = scan.nextInt();
		}
		int totalmoney = money + submoney;
		System.out.println("---------------------------------");
		System.out.println("총 투입한 금액 : " + totalmoney);
		System.out.println("콜라 : " + coke +"캔");
		System.out.println("사이다 : " + cider +"캔");
		System.out.println("거스름돈은 : " + (totalmoney - sum));
		System.out.println("맛있게 드셔");
		System.out.println("---------------------------------");
	}	
}