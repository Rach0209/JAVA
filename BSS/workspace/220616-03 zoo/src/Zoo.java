import java.util.Scanner;

public class Zoo {
	private EmployeeManagement emp;
	private AnimalManagement ani;
	// 기존 직원 4명 생성. 조련사3 / 경영1
		public Employee[] oldEmployee() {
			Employee[] employee = new Employee[4];
			employee[0] = new Employee("조련사", "조련신");
			employee[1] = new Employee("조련사", "김못해");
			employee[2] = new Employee("조련사", "나고수");
			employee[3] = new Employee("경영팀", "이경영");
			return employee;
		}

		// 기존 동물 4마리 생성. 육식3 / 초식2 (날수잇음 1 없음 4)
		public Animal[] oldAnimal() {
			Animal[] animal = new Animal[5];
			animal[0] = new Animal("사자", 5, 150);
			animal[1] = new Animal("호랑이", 3, 120);
			animal[2] = new Animal("독수리", 2, 1);
			animal[3] = new Animal("기린", 3, 200);
			animal[4] = new Animal("토끼", 2, 1);
			return animal;
		}
		
		public Carnivore[] oldCarnivore() {
			Carnivore[] carni = new Carnivore[2];
			carni[0] = new Carnivore("사자", 5, 150, "육식");
			carni[1] = new Carnivore("풀만먹음", 15, 80, "초식");
			carni[2] = new Carnivore("고기만먹음", 2, 40, "육식");
			return carni;
		}
		
	// 동물원 모든 정보 호출(직원 정보, 동물 정보 선택) 프로그램 시작 메소드 메인메소드에 적기
	public void atStart() {
		Scanner scan = new Scanner(System.in);
		
		emp = new EmployeeManagement(oldEmployee());
		ani = new AnimalManagement(oldAnimal());
		while (true) {
			System.out.println("1. 직원 정보 보기");
			System.out.println("2. 동물 정보 보기");
			System.out.println("0. 프로그램 종료");
			int input = scan.nextInt();
			switch (input) {
			case 1: { // 직원 정보
				System.out.println("--------직원 정보---------");
				// 직원 정보 메소드
				emp.empStart();
				System.out.println("------------------------");
				break;
			}
			case 2:{ // 동물 정보
				System.out.println("--------동물 정보---------");
				// 동물 정보 메소드 자리
				ani.aniStart();
				System.out.println("------------------------");
				break;
			}
			case 0: { // 프로그램 종료 버튼
				System.out.println();
				System.out.println("-------프로그램 종료-------");
				System.out.println();
				return;
			}
			default: {
				System.out.println("------------------------");
				System.out.println("--------잘못된 입력값------");
				System.out.println("------------------------");
				break;
			}
			}
			
		}
	}
}
