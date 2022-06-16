import java.util.Arrays;
import java.util.Scanner;

public class AnimalManagement {
	private Animal[] animals;
	private Carnivore[] carnivore;
	public AnimalManagement(Animal... animals) {
		this.animals = animals;
	}

	public void printEmployeesInfo() {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				System.out.printf((i + 1) + ". ");
				System.out.println(animals[i].toString());
				System.out.println();
			}
		}

	}

	public void arrSpecies() {
		SpeciesComparator comparator = new SpeciesComparator();
		Arrays.sort(animals, comparator);
		for (Animal e : animals) {
			System.out.printf("종류 : %s, 나이 : %s\n", e.getSpecies(), e.getAge());
		}
	}

	public void arrAge() {
		AgeComparator comparator = new AgeComparator();
		Arrays.sort(animals, comparator);
		for (Animal e : animals) {
			System.out.printf("나이 : %s, 종류 : %s\n", e.getAge(), e.getSpecies());
		}
	}


	public void arrFeed() {
		Scanner scan = new Scanner(System.in);
		while (true) {
		System.out.println("1. 육식\t2. 초식 선택");
		int input = scan.nextInt();
		switch (input) {
			case 1: {
				Carnivore.arrCarnivore(animals, carnivore);
				return;
			}
			case 2: {
				
				return;
			}
			case 0: {
				
				return;
			}
			default : {
				System.out.println("잘못된 값");
				break;
			}
		} 
		
		
		

	}
	}

	public void aniStart() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1. 동물 종류 순");
			System.out.println("2. 동물 나이 순");
			System.out.println("3. 동물 육식/초식 분류");
			System.out.println("0. 나가기");
			int input = scan.nextInt();

			switch (input) {
			case 1: {
				arrSpecies();
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
}
