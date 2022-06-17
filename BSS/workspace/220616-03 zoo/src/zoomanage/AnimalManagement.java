package zoomanage;

import java.util.Arrays;
import java.util.Scanner;

public class AnimalManagement {
	private Animal[] animals;
	private Carnivore[] carnivore;
	private Herbivore[] herbivore;

	public AnimalManagement(Animal... animals) {
		this.animals = animals;
	}

	// 배열 합친것 불러오기
	public AnimalManagement(Animal[] animals, Carnivore[] carnivore, Herbivore[] herbivore) {
		this.animals = animals;
		this.carnivore = carnivore;
		this.herbivore = herbivore;
	}

	// 동물 기본 정보 불러오기 이름(사자,기린 등), 나이, 무게, 식성(육/초)
//	public void printEmployeesInfo() {
//		for (int i = 0; i < animals.length; i++) {
//			if (animals[i] != null) {
//				System.out.printf((i + 1) + ". ");
//				System.out.println(animals[i].toString() + " ");
//				System.out.println();
//			}
//		}
//
//	}
	// 이름 순 정렬 메소드
	public void arrName() {
		SpeciesComparator comparator = new SpeciesComparator();
		Arrays.sort(animals, comparator);
		for (Animal e : animals) {
			System.out.printf("이름 : %s, 나이 : %s, 무게 : %dkg\n", e.getSpecies(), e.getAge(), e.getWeight());
		}
	}

	// 나이 순 정렬 메소드
	public void arrAge() {
		AgeComparator comparator = new AgeComparator();
		Arrays.sort(animals, comparator);
		for (Animal e : animals) {
			System.out.printf("나이 : %s, 이름 : %s, 무게 : %dkg\n", e.getAge(), e.getSpecies(), e.getWeight());
		}
	}

	public void arrCarnivore() {
		for (Carnivore c : carnivore) {
			System.out.printf("이름 : %s, 나이 : %d, 무게 : %dkg, 식성 : %s\n", c.getSpecies(), c.getAge(), c.getWeight(),
					c.getCarnivore());
		}
	}

	public void arrHerbivore() {
		for (Herbivore c : herbivore) {
			System.out.printf("이름 : %s, 나이 : %d, 무게 : %dkg, 식성 : %s\n", c.getSpecies(), c.getAge(), c.getWeight(),
					c.getHerbivore());
		}
	}

	public void aniStart() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1. 동물 이름 순");
			System.out.println("2. 동물 나이 순");
			System.out.println("3. 동물 육식/초식 분류");
			System.out.println("0. 나가기");
			int input = scan.nextInt();

			switch (input) {
			case 1: {
				arrName();
				return;
			}
			case 2: {
				arrAge();
				return;
			}
			case 3: {
				arrFeed();
				return;
			}
			case 0: {
				System.out.println();
				return;
			}
			}

		}

	}

	// 종류 분류; 육식/초식 순 정렬
	public void arrFeed() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1. 육식 | 2. 초식 선택 | 0. 나가기");
			int input = scan.nextInt();
			switch (input) {
			case 1: {
				arrCarnivore();
				return;
			}
			case 2: {
				arrHerbivore();
				return;
			}
			case 0: {

				return;
			}
			default: {
				System.out.println("잘못된 값");
				break;
			}
			}
		}
	}
	// 데이터 입력 받기 메소드.
		public String getData(String message) {
			Scanner scan = new Scanner(System.in);
			System.out.println(message);
			return scan.next();
		}
	
	// 동물 등록 메소드
	public Animal inputAnimal() {
		Scanner scan = new Scanner(System.in);
		System.out.println("================");
		System.out.println("\t동물 정보 입력\n");
		System.out.println("1. 육식동물 | 2. 초식동물 | 3. 미정");
		int input = scan.nextInt();
		if (input == 1) {
			String species = getData("동물 이름 입력");
			int age = Integer.parseInt(getData("동물 나이 입력"));
			int weight = Integer.parseInt(getData("동물 무게 입력"));
			return new Carnivore(species, age, weight, "육식");
		} else if (input == 2) {
			String species = getData("동물 이름 입력");
			int age = Integer.parseInt(getData("동물 나이 입력"));
			int weight = Integer.parseInt(getData("동물 무게 입력"));
			return new Herbivore(species, age, weight, "초식");
		} else {
			String species = getData("동물 이름 입력");
			int age = Integer.parseInt(getData("동물 나이 입력"));
			int weight = Integer.parseInt(getData("동물 무게 입력"));
			return new Animal(species, age, weight);
		}
	}
	
	// 동물 등록 리턴값을 배열에 등록하기 / 중복 방지 추가
	// 총 동물 수 20마리 제한걸기
	public void addAnimal() {
		Scanner scan = new Scanner(System.in);
		boolean trueFalse = true;
		while (trueFalse) {
			for (int i = animals.length; i < 20; i++) {
				System.out.println("등록 가능 동물수  : " + (20 - i) + "마리");
				System.out.println();
				animals = Arrays.copyOf(animals, animals.length + 1);
				animals[i] = inputAnimal();
				for (int j = 0; j < i; j++) {
					if (animals[j].equals(animals[i])) {
						animals[i] = null;
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
