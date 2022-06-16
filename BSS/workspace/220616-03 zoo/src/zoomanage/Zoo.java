package zoomanage;
import java.util.Arrays;
import java.util.Scanner;

public class Zoo {
	private EmployeeManagement emp;
	private AnimalManagement ani;
	
	// 기존 직원 4명 생성. 조련사3 / 경영1
		public Employee[] basicEmployee() {
			Employee[] employee = new Employee[4];
			employee[0] = new Employee("조련사", "조련신");
			employee[1] = new Employee("조련사", "김못해");
			employee[2] = new Employee("조련사", "나고수");
			employee[3] = new Employee("경영팀", "이경영");
			return employee;
		}
		
		// Carnivore[] Herbivore[] 합친걸 넣기
		public Animal[] allAnimal() {
			Animal[] animals = carniPlusHerbi(basicCaAnimal(), basicHeAnimal());
			return animals;
		}
		
		// 업캐스팅한 배열
		public Animal[] basicAnimal() {
			Animal[] animal = new Animal[5];
			animal[0] = new Carnivore("사자", 8, 150, "육식");
			animal[1] = new Carnivore("호랑이", 12, 120, "육식");
			animal[2] = new Carnivore("독수리", 7, 5, "육식");
			animal[3] = new Herbivore("기린", 9, 200, "초식");
			animal[4] = new Herbivore("토끼", 2, 1, "초식");
			return animal;
		}
		
		// 기존 육식동물 3마리 생성.
		public Carnivore[] basicCaAnimal() {
			Carnivore[] carnivore = new Carnivore[3];
			carnivore[0] = new Carnivore("사자", 8, 150, "육식");
			carnivore[1] = new Carnivore("호랑이", 12, 120, "육식");
			carnivore[2] = new Carnivore("독수리", 7, 5, "육식");
	
			return carnivore;
		}
		// 기존 초식동물 2마리 생성.
		public Herbivore[] basicHeAnimal() {
			Herbivore[] herbivore = new Herbivore[2];
			herbivore[0] = new Herbivore("기린", 9, 200, "초식");
			herbivore[1] = new Herbivore("토끼", 2, 1, "초식");
			
			return herbivore;
		}
		

	
		// 배열 합치기
		public Animal[] carniPlusHerbi(Carnivore[] carnivore, Herbivore[] herbivore) {
			Animal[] newArray = copy(carnivore, herbivore.length);
			
			for (int i = carnivore.length; i < newArray.length; i++) {
				newArray[i] = herbivore[i - carnivore.length];
			}
			return newArray;
			
		}
		// 배열합치기전 길이가 더 긴 배열 길이로 바꿈
		public static Animal[] copy(Animal[] arr, int newLength) {
			Animal[] larger = new Animal[arr.length + newLength];
			for (int i = 0; i < arr.length; i++) {
				larger[i] = arr[i];
			}
			return larger;
		}
		
	// 동물원 모든 정보 호출(직원 정보, 동물 정보 선택) 프로그램 시작 메소드 메인메소드에 적기
	public void atStart() {
		Scanner scan = new Scanner(System.in);
		emp = new EmployeeManagement(basicEmployee());
//		ani = new AnimalManagement(basicAnimal(), basicCaAnimal(), basicHeAnimal());
		ani = new AnimalManagement(allAnimal(), basicCaAnimal(), basicHeAnimal());
		while (true) {
			System.out.println("=========상단 메뉴========");
			System.out.println("1. 직원 정보 보기");
			System.out.println("2. 동물 정보 보기");
			System.out.println("3. 정보 등록 하기");
			System.out.println("0. 프로그램 종료");
			System.out.println("=======================");
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
			case 3:{ // 직원 정보 등록
				System.out.println("--------직원 등록---------");
				// 동물 정보 메소드 자리
				emp.addEmployee();
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
