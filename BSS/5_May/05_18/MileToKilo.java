// p.73 1번 (마일 -> 킬로미터)

import java.util.Scanner;

public class MileToKilo {
	public static void main(String[] args){
		
		Scanner trans = new Scanner(System.in);
		
		System.out.print("마일을 입력하시오: ");
		double mile = trans.nextDouble();
		double kilo = mile*1.609;
		
		
		System.out.print(mile + "마일은 " + kilo + "킬로미터 입니다.");
	}
}