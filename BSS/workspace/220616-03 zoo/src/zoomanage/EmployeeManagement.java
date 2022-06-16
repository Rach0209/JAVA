package zoomanage;
import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManagement {
	private Employee[] employee;
	
	public EmployeeManagement(Employee...employee) {
		this.employee = employee;
	}
	
	// 데이터 입력 받기 메소드.
	public String getData(String message) {
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		return scan.next();
	}
			
//	public void printEmployeesInfo() {
//		for (int i = 0; i < employee.length; i++) {
//			if (employee[i] != null) {
//				System.out.printf((i + 1) + ". ");
//				System.out.println(employee[i].toString());
//				System.out.println();
//			}
//		}
//
//	}
	
	public void arrName() {
		NameComparator comparator = new NameComparator();
		Arrays.sort(employee, comparator);
		for (Employee e : employee) {
			System.out.printf("성함 : %s, 파트 : %s\n", e.getName(), e.getPart());
		}
	}
	public void arrPart() {
		PartComparator comparator = new PartComparator();
		Arrays.sort(employee, comparator);
		for (Employee e : employee) {
			System.out.printf("성함 : %s, 파트 : %s\n", e.getName(), e.getPart());
		}
	}
	
	public void empStart() {
		Scanner scan = new Scanner(System.in);
		while (true) {
		System.out.println("1. 직원 이름 순 불러오기");
		System.out.println("2. 직원 파트 별 불러오기");
		System.out.println("0. 나가기");
		int input = scan.nextInt();
		
		switch (input) {
		case 1: {
			arrName();
			return;
		}
		case 2: {
			arrPart();
			return;
		}
		case 0: {
			System.out.println();
			return;
		}
		}
		
		}
	}
	// 직원 등록 리턴 메소드
	public Employee inputEmployee() {
		Scanner scan = new Scanner(System.in);
		System.out.println("=================");
		System.out.println("직원 정보 입력\n");
		String part = getData("파트(조련사, 경영팀)를 입력하세요");
		String name = getData("이름을 입력하세요");
		
		return new Employee(part, name);
	}
	// 등록 리턴값 배열에 등록하는 메소드 / 중복 방지
	// 총 인원 15명 제한걸기
	public void addEmployee() {
		Scanner scan = new Scanner(System.in);
		boolean trueFalse = true;
		while (trueFalse) {
			for (int i = employee.length; i < 15; i++) {
				System.out.println("현재 남은 자리 : " + (15 - i) + "명");
				System.out.println();
				employee = Arrays.copyOf(employee, employee.length + 1);
				employee[i] = inputEmployee();
				for (int j = 0; j < i; j++) {
					if (employee[j].equals(employee[i])) {
						employee[i] = null;
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
}
