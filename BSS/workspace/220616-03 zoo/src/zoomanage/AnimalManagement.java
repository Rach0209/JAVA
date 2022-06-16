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
			System.out.println("1. 육식\t2. 초식 선택\t0. 나가기");
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
}
