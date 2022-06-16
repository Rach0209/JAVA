import java.util.Arrays;

// 먹이
public interface IFeed {
	String doEat(); // 동물은 먹어요
}

class Carnivore extends Animal implements IFeed {
	String carnivore;
	public Carnivore(String species, int age, int weight, String carnivore) {
		super(species, age, weight);
		this.carnivore = carnivore;
	}
	
	@Override
	public String doEat() {
		return "Meat";
	}
	
	public static void arrCarnivore(Animal[] animal, Carnivore[] carnivore) {
		int totalLength = animal.length + carnivore.length;
		Carnivore[] carni = new Carnivore[totalLength];
		for (int i = 0; i < animal.length; i++) {
			carni[i] =  (Carnivore) animal[i];
		}
		int j = totalLength - carnivore.length;
		for (int i = 0; i < carnivore.length; i++) {
			carni[j] = carnivore[i];
			j++;
		}
		System.out.println(Arrays.toString(carni));
	}
	
	// 배열 합치기
	public Animal[] MakeCarnivore(Animal[] animal, Carnivore[] carnivore) {
		Animal[] newArray = copy(animal, carnivore.length);
		
		for (int i = animal.length; i < newArray.length; i++) {
			newArray[i] = carnivore[i - animal.length];
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
	
}

class Herbivore extends Animal implements IFeed {
	String herbivore;
	public Herbivore(String species, int age, int weight, String herbivore) {
		super(species, age, weight);
		this.herbivore = herbivore;
	}
	
	@Override
	public String doEat() {
		return "Grass";
	}
}