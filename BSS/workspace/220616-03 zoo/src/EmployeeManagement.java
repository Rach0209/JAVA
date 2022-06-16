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
			
	public void printEmployeesInfo() {
		for (int i = 0; i < employee.length; i++) {
			if (employee[i] != null) {
				System.out.printf((i + 1) + ". ");
				System.out.println(employee[i].toString());
				System.out.println();
			}
		}

	}
	
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
}
