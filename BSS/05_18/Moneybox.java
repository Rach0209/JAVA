// p.102 6번 (저금통)

import java.util.Scanner;

public class Moneybox {
	public static void main(String[] args){
		
		Scanner coin500 = new Scanner(System.in);
		Scanner coin100 = new Scanner(System.in);
		Scanner coin50 = new Scanner(System.in);
		Scanner coin10 = new Scanner(System.in);
		
		System.out.print("500원 동전의 개수 : ");
		int c500 = coin500.nextInt();
		
		System.out.print("100원 동전의 개수 : ");
		int c100 = coin100.nextInt();
		
		System.out.print("50원 동전의 개수 : ");
		int c50 = coin50.nextInt();
		
		System.out.print("10원 동전의 개수 : ");
		int c10 = coin10.nextInt();
		
		int total = (c500 * 500) + (c100 * 100) + (c50 * 50) +(c10 * 10);
		
		
		System.out.print("저금통 안의 총 금액은 '" + total + "'입니다");
		
	}
}