// p.73 4번 (화씨 온도 -> 섭씨 온도)


import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		
		Scanner fah = new Scanner(System.in);
		
		System.out.print("화씨 온도를 입력 하세요 : ");
		double fahren = fah.nextDouble();
		double cel = 5 * (fahren - 32) / 9;
		
		System.out.print("섭씨 온도는 " + cel + "도 입니다.");
		
		
	}
}