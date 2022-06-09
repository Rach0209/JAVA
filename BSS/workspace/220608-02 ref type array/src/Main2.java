import java.util.Scanner;

// p237 1번

// p237 2번

// 기존에 작성하였던 학생관리 프로그램을 배열을 활용할 수 있는 방법으로 수정해보세용;;;;

public class Main2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number = new int[10];
		System.out.println("좌석을 예약하시겠습니까?(1 또는 0)");
		int input = scan.nextInt();
		if (input == 1) {
			while (true) {
				System.out.println("현재의 예약 상태는 다음과 같습니다.");
				System.out.println("-------------------------------------------");
				System.out.println("1 2 3 4 5 6 7 8 9 10");
				System.out.println("-------------------------------------------");
				for (int n : number) {
					System.out.print(n + " ");
				}
				System.out.println();
				System.out.println("몇번째 좌석을 예약하시겠습니까?");
				int seat = scan.nextInt();
				if (seat > 0 && seat < 11) {
					int idx = seat - 1;
					if (number[idx] == 1) {
						System.out.println("이미 예약된 자리입니다.");
						continue;
					} else {
						number[idx] = 1;
						System.out.println("예약되었습니다.");
						System.out.println("좌석을 예약하시겠습니까? (1:계속, 다른아무숫자나입력:종료)");
						input = scan.nextInt();
						if (input == 1) {
							continue;
						} else {
							System.out.println("종료합니다.");
							break;
						}
					}
				} else {
					System.out.println("잘못된 입력입니다.");
					continue;
				}
			}
		} else {
			System.out.println("종료합니다.");
		}

//		System.out.println("몇번째 좌석을 예약하시겠습니까?");
//		int seat = scan.nextInt(); // 원하는 좌석번호;
//		System.out.println("예약되었습니다.");
//		System.out.println("좌석을 예약하시겠습니까?(1 또는 0)");
//		input = scan.nextInt();// 반복
	}
}
