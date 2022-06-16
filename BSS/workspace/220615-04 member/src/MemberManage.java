import java.util.Scanner;

public class MemberManage {
	private Gym gym;

	// 헬스장 기존 멤버 3명있다고 가정.
	public Member[] oldMembers() {
		Member[] members = new Member[3];
		members[0] = new Member("김장신", 195, 67);
		members[1] = new Member("이단신", 145, 90);
		members[2] = new Member("최평균", 173, 63);
		return members;
	}

	// 프로그램 시작 메소드.
	public void start() {
		Scanner scan = new Scanner(System.in);

		// 기존 회원 등록.
		gym = new Gym(oldMembers());

		System.out.println("-----------------------------");
		System.out.println("---------회원 관리 프로그램---------");
		System.out.println("-----------------------------");

		while (true) {
			System.out.println();
			System.out.println("************ 목 록 ************");
			System.out.println("1. 전체 회원 기본 정보 (성함, 키, 몸무게, 비만기준)");
			System.out.println("2. 신규 회원 등록");
			System.out.println("3. 기존 회원 수정");
			System.out.println("4. 몸무게 정렬 (내림차순, 오름차순 택)");
			System.out.println("5. BMI 정렬 (오름차순)");
			System.out.println("6. 목록 순 멤버 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하는 기능 번호 입력 : ");
			int input = scan.nextInt();

			switch (input) {
			case 1: {
				System.out.println("-------------------------");
				gym.printMembersInfo();
				System.out.println("-------------------------");
				break;
			}
			case 2: {
				System.out.println("-------------------------");
				gym.addMember();
				System.out.println("-------------------------");
				break;
			}
			case 3: {
				System.out.println("-------------------------");
				gym.setMembers();
				System.out.println("-------------------------");
				break;
			}
			case 4: {
				System.out.println("-------------------------");
				gym.weightArray();
				System.out.println("-------------------------");
				break;
			}
			case 5: {
				System.out.println("-------------------------");
				gym.printAscBmi();
				System.out.println("-------------------------");
				break;
			}
			case 6: {
				while (true) {
					System.out.println("-------------------------");
					System.out.println("1. 이름 순(오름차순)으로 멤버 조회");
					System.out.println("2. 몸무게 순(오름차순)으로 멤버 조회");
					System.out.println("3. 키 순(오름차순)으로 멤버 조회");
					System.out.println("-------------------------");
					input = scan.nextInt();
					if (input == 1) {
						gym.arrName();
						break;
					} else if (input == 2) {
						gym.arrWeight();
						break;
					} else if (input == 3) {
						gym.arrHeight();
						break;
					} else {
						System.out.println("-------------------------");
						System.out.println("올바르지 않은 입력.");
						System.out.println("-------------------------");
					}
				}
				break;
			}
			case 0: {
				System.out.println("-------------------------");
				System.out.println("프로그램을 종료합니다~");
				System.out.println("-------------------------");
				return;
			}
			default: {
				System.out.println("-------------------------");
				System.out.println("올바르지 않은 입력.");
				System.out.println("-------------------------");
				break;
			}
			}
		}
	}
}
