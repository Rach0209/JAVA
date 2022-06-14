import java.util.Scanner;

public class MemberManage { // 회원 관리 클래스.
	private Member[] member;

	public void InputMember() { // 회원 정보 입력 메소드
		Scanner scan = new Scanner(System.in);
		System.out.println("----------회원 등록 창----------");
		System.out.println(" 등록할 회원의 수를 입력 하세요. 최대 10명.");
		int registCount = scan.nextInt();
		for (int i = 0; i < registCount; i++) {
			String name = getData("등록할 회원의 이름을 입력하세요.");
			double height = Double.parseDouble(getData("등록할 회원의 키를 입력하세요."));
			double weight = Double.parseDouble(getData("등록할 회원의 몸무게를 입력하세요."));
			for (int j = 0; j < member.length; j++) {
				if (member[j] == null) {
					member[j] = new Member(name, height, weight);
				}
			}
			System.out.printf("-------------%d명 등록 하였습니다.\n", i + 1);
		}
	}

	// 데이터 입력받기 메소드
	public String getData(String message) {
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		return scan.next();
	}

	// 기본 정보 출력. 이름, 키 , 몸무게, bmi지수
	public void printBasicInfo() {
		for (int i = 0; i < member.length; i++) {
		System.out.println(member[i].toString());
		}
	}

	// 프로그램 시작
	public void Start() {
		System.out.println("**********부모님 어깨위의 Gym 회원 관리 프로그램**********");
		InputMember();
		printBasicInfo();

	}
}
