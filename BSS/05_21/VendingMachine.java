// 자판기 프로그램
// 돈 입력
// 반복하여 입력을 받아
// 1번 콜라 : 1500
// 2번 사이다 : 1300
// 3번 계산
// 총 몇 개의 캔을 구입하고, 거스름돈은 얼마인지 출력하세요 (외상 안 됨).

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("돈 입력해 : ");
		int money = scan.nextInt();
		
		// coke = 1500;
		// cider = 1300;
		int coke = 0;
		int cider = 0;
		for (int count = 0; count < 3; ) {
			System.out.print("1 : 콜라 2 : 사이다 3 : 결제\n 번호를 입력하세요 : ");
			count = scan.nextInt();
			if (count == 1) {
				System.out.println("콜라 선택했다!");
				coke++;
			} else if (count == 2) {
				System.out.println("사이다 골랐다!");
				cider++;
			} else if (count == 3) {
				System.out.println("음료 가져와");
			}
		}
		System.out.println("투입한 금액 : " + money);
		System.out.println("콜라 : " + coke +"캔");
		System.out.println("사이다 : " + cider +"캔");
		
		int sum = (coke * 1500) + (cider * 1300);
		int submoney = 0;
		int more = money - sum;
		if (more < 0) {
			System.out.println("돈이 부족 하잖아. 더 내놔");
			submoney = scan.nextInt();
		}
		int totalmoney = money + submoney;
		System.out.println("투입한 금액 : " + money);
		System.out.println("콜라 : " + coke +"캔");
		System.out.println("사이다 : " + cider +"캔");
		System.out.println("거스름돈은 : " + (totalmoney - sum));
		System.out.println("맛있게 드셔");
	}
}