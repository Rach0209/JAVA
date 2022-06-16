package zoomanage;

// 먹이~를 먹습니다~
public interface IFeed {
	String doEat(); // 동물은 먹어요
}
//육식동물 추가
class Carnivore extends Animal implements IFeed {
	String carnivore;
	public Carnivore(String species, int age, int weight, String carnivore) {
		super(species, age, weight);
		this.carnivore = carnivore;
	}
	public String getCarnivore() {
		return carnivore;
	}
	public void setCarnivore(String carnivore) {
		this.carnivore = carnivore;
	}
	// 고기 먹음
	@Override
	public String doEat() {
		return "Meat";
	}
	@Override
	public String toString() {
		return "동물의 종류 : " + species + ", 나이 : " + age + "살, 무게 : " + weight + "kg" + "식성 : " + carnivore + "동물";
	}
	
}

//초식동물 추가
class Herbivore extends Animal implements IFeed {
	String herbivore;
	public Herbivore(String species, int age, int weight, String herbivore) {
		super(species, age, weight);
		this.herbivore = herbivore;
	}
	public String getHerbivore() {
		return herbivore;
	}
	public void setHerbivore(String herbivore) {
		this.herbivore = herbivore;
	}
	// 풀먹어요
	@Override
	public String doEat() {
		return "Grass";
	}
	@Override
	public String toString() {
		return "동물의 종류 : " + species + ", 나이 : " + age + "살, 무게 : " + weight + "kg" + "식성 : " + herbivore + "동물";
	}
}
	
	
	
	
	

