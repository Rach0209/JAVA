import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		// while (false) {
			// // 문장 1
		// }
		Scanner scan = new Scanner(System.in);
		System.out.println("10을 나눌 수 입력하셈ㅋ");
		// 한번만 입력 했을 때 ; 0 과같은 오류 일 때.
		// int num = scan.nextInt();
		// if (num == 0) {
			// System.out.println("0으로 나눌 수 없음");
		// } else {
			// System.out.println(10 / num);
		// }
		
		// do-while로 반복입력
		int num;
		do {
			num = scan.nextInt();
			if (num == 0) {
				System.out.println("0으로 나눌 수 없음");
			}
		} while (num == 0);
		System.out.println(10 / num);
		
		
		// {} 중괄호 안으로 무조건 들어감 
		//그 이후 조건 검사, 참이면 while의 루프로 들어감.
		// 무조건 1번은 수행된다.
		// do {
			// System.out.println("실행 되냐?"); // do { } 안의 내용은 반복의 가능성 존재
		// } while (false);
	}
}