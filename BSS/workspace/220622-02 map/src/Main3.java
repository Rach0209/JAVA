import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 중국집 주문 가격 계산기

// 짜장면 : 2500
// 짬뽕 : 4000
// 볶음밥 : 4000

// 메뉴를 '추가'
// 탕수육 : 10000 - 추가메뉴

// 계산 결과 출력 기능
// 가격만 계산해서 출력

public class Main3 {
	public static void main(String[] args) {
		Map<String, Integer> chinaRes = new HashMap<>();
		chinaRes.put("짜장면", 2500);
		chinaRes.put("짬뽕", 4000);
		chinaRes.put("볶음밥", 4000);

		int count = 0;
		int price = 0;
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("=====================쭝꾺집=====================");
			System.out.println("1. 주문 2. 메뉴 추가 3. 계산하기 0. 종료");
			int input = scan.nextInt();
			String menu;
			switch (input) {
			case 1:
				System.out.println("주문할 음식 개수 입력");
				count += scan.nextInt();
				scan.nextLine();
				System.out.println();
				System.out.println("===================== 메뉴판 =====================");
				System.out.println(chinaRes);
				System.out.println("================================================");
				for (int i = 0; i < count; i++) {
					System.out.println("메뉴 고르라~");
					menu = scan.nextLine();
					if (chinaRes.containsKey(menu)) {
						price += chinaRes.get(menu);
					}
				}
				break;
			case 2:
				scan.nextLine();
				System.out.println("추가할 메뉴 이름 입력");
				String newMenu = scan.nextLine();
				price += chinaRes.get(newMenu);
				count++;
				break;
			case 3:
				System.out.println("계산한다요~");
				System.out.println("총 " + count + "개");
				System.out.println("총 금액: " + price + "원 가져오라~");
				break;
			case 0:
				System.out.println("들어가고 ~");
				return;
			default:
				System.out.println("제대로 누르라");
				continue;
			}
		}
	}
}
