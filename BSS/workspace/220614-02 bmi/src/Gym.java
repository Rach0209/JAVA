import java.util.Arrays;
import java.util.Scanner;

public class Gym {
	private Member[] members;

	public Gym() {
	}

	public Gym(Member... members) {
		this.members = members;
	}

	// 데이터 입력 받기 메소드.
	public String getData(String message) {
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		return scan.next();
	}

	// 회원 등록 메소드.
	public Member inputMember() {
		Scanner scan = new Scanner(System.in);
		System.out.println("-----회원 등록/수정 창입니다-----");

		String name = getData("이름 입력");
		double height = Double.parseDouble(getData("키(단위:cm) 입력"));
		double weight = Double.parseDouble(getData("몸무게(단위:kg) 입력"));

		return new Member(name, height, weight);
	}

	// case 1. 기존 회원 기본 정보 출력 메소드.(이름, 키, 몸무게, 비만기준)
	public void printMembersInfo() {
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				System.out.println((i + 1) + "번 회원님 정보");
				System.out.println(members[i].toString() + " 비만 기준 : " + members[i].bmiStandard());
				System.out.println();
			}
		}

	}

	// case 2. 신규 회원 등록 메소드.
	public void addMember() {
		Scanner scan = new Scanner(System.in);
		boolean trueFalse = true;
		while (trueFalse) {
			for (int i = members.length; i < 10; i++) {
				System.out.println("현재 남은 자리 : " + (10 - i) + "명");
				members = Arrays.copyOf(members, members.length + 1);
				members[i] = inputMember();
				for (int j = 0; j < i; j++) {
					if (members[j].equals(members[i])) {
						members[i] = null;
						System.out.println("이미 등록된 회원입니다.");
						i--;
						break;
					}  
				}
						
			int input = 1;
			System.out.println("1. 계속 등록");
			System.out.println("2. 등록 종료");
			input = scan.nextInt();

			if (input == 2) {
				trueFalse = false;
				break;
			}
			}
		}
	}
	// 신규 회원 등록; 인원수 제한 없음버전
//	public void addMember() {
//		Scanner scan = new Scanner(System.in);
//
//		boolean trueFalse = true;
//		while (trueFalse) {
//			int input = 1;
//			members = Arrays.copyOf(members, members.length + 1);
//			members[members.length - 1] = inputMember();
//
//			System.out.println("1. 계속 등록");
//			System.out.println("2. 등록 종료");
//			input = scan.nextInt();
//
//			if (input == 2) {
//				trueFalse = false;
//			}
//		}
//	}

	// case 3. 회원 정보 수정 메소드.
	public void setMembers() {
		Scanner scan = new Scanner(System.in);
		printMembersInfo();
		System.out.println("수정할 회원 번호 선택 : ");
		int input = scan.nextInt();
		System.out.println("이름, 키, 몸무게 순으로 입력해 주세요.");
		members[input - 1] = inputMember();
	}

	// case 4. 몸무게별 정렬 (내림,오름차순)
	// 내림차순 // else if 몸무게 같을 경우, 키가 큰순
	public Member[] descWeight() {
		Member temporary = new Member();
		for (int i = 0; i < members.length; i++) {
			for (int j = i + 1; j < members.length; j++) {
				if (members[i].getWeight() < members[j].getWeight()) {
					temporary = members[i];
					members[i] = members[j];
					members[j] = temporary;
				} else if (members[i].getWeight() == members[j].getWeight()) {
					if (members[i].getHeight() > members[j].getHeight()) {
						temporary = members[i];
						members[i] = members[j];
						members[j] = temporary;
					}
				}
			}
		}
		return members;
	}

	// 오름차순 부호만 반대로. 몸무게 같을 경우, 키가 작은순.
	public Member[] ascWeight() {
		Member temporary = new Member();
		for (int i = 0; i < members.length; i++) {
			for (int j = i + 1; j < members.length; j++) {
				if (members[i].getWeight() > members[j].getWeight()) {
					temporary = members[i];
					members[i] = members[j];
					members[j] = temporary;
				} else if (members[i].getWeight() == members[j].getWeight()) {
					if (members[i].getHeight() < members[j].getHeight()) {
						temporary = members[i];
						members[i] = members[j];
						members[j] = temporary;
					}
				}
			}
		}
		return members;
	}

	// case 4의 호출
	public void weightArray() {
		Scanner scan = new Scanner(System.in);
		int input;
		while (true) {
			System.out.println("1. 내림차순");
			System.out.println("2. 오름차순");
			input = scan.nextInt();
			if (input == 1 || input == 2) {
				break;
			}
			System.out.println("잘못된 입력값... 다시 입력");
		}

		switch (input) {
		case 1: {
			for (Member m : descWeight()) {
				System.out.printf("성함 : %s, 키 : %.1f, 몸무게 : %.1f, BMI 지수 : %.2f, 비만 기준 : %s\n", m.getName(),
						m.getHeight(), m.getWeight(), m.getBmi(), m.bmiStandard());
			}
			break;
		}
		case 2: {
			for (Member m : ascWeight()) {
				System.out.printf("성함 : %s, 키 : %.1f, 몸무게 : %.1f, BMI 지수 : %.2f, 비만 기준 : %s\n", m.getName(),
						m.getHeight(), m.getWeight(), m.getBmi(), m.bmiStandard());
			}
		}
		}
	}

	// case 5. BMI 순 정렬 (저체중 ~ 고도비만, 오름차순)
	public Member[] ascBmi() {
		Member temporary = new Member();
		for (int i = 0; i < members.length; i++) {
			for (int j = i + 1; j < members.length; j++) {
				if (members[i].getBmi() > members[j].getBmi()) {
					temporary = members[i];
					members[i] = members[j];
					members[j] = temporary;
				} else if (members[i].getBmi() == members[j].getBmi()) {
					if (members[i].getHeight() < members[j].getHeight()) {
						temporary = members[i];
						members[i] = members[j];
						members[j] = temporary;
					}
				}
			}
		}
		return members;
	}

	public void printAscBmi() {
		for (Member m : ascBmi()) {
			System.out.printf("성함 : %s, 키 : %.1f, 몸무게 : %.1f, BMI 지수 : %.2f, 비만 기준 : %s\n", m.getName(), m.getHeight(),
					m.getWeight(), m.getBmi(), m.bmiStandard());
		}
	}
}
