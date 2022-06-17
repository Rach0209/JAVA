package zoomanage;
import java.util.Comparator;





// 동물 : 이름, 나이, 몸무게
public class Animal {
	protected String species;
	protected int age;
	protected int weight;

	public Animal(String species, int age, int weight) {
		this.species = species;
		this.age = age;
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "동물의 종류 : " + species + ", 나이 : " + age + "살, 무게 : " + weight + "kg";
	}

//	@Override
//	public int compareTo(Animal o) {
//		return 0;
//	}

}

// 동물 이름순  불러오기
class SpeciesComparator implements Comparator<Animal> {
	@Override
	public int compare(Animal o1, Animal o2) {
		return o1.species.compareTo(o2.species);
	}
}

// 동물 나이순 불러오기
class AgeComparator implements Comparator<Animal> {
	@Override
	public int compare(Animal o1, Animal o2) {
		return o1.age - o2.age;
	}
}

// 새롭게 하다가 접음ㅋㅋ // 기존 방식대로 해보기로함 
// 시간나면 육식/초식 클래스가 아닌 동물 이름별로 만들기
//public class Animal {
//	protected String species;
//	
//	public Animal() {}
//}
//// 먹이 종류 인터페이스 
//interface IFeeding {
//	String eat();
//}
//
//
//	// 동물은 육식과 초식으로 나뉜다.
//// 동물 상속받는 육식동물; 동물 안의 육식동물; 동물 > 육식동물
//class Carnivore extends Animal implements IFeeding{
//	protected String name;
//	protected int age;
//	protected int weight;
//	public Carnivore(String species, String name, int age, int weight) {
//		this.species = species;
//		this.name = name;
//		this.age = age;
//		this.weight = weight;
//	}
//	public String getSpecies() {
//		return species;
//	}
//	public void setSpecies(String species) {
//		this.species = species;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getWeight() {
//		return weight;
//	}
//	public void setWeight(int weight) {
//		this.weight = weight;
//	}
//	// 이름(사자, 호랑이 등), 나이, 몸무게 String 리턴값 메소드
//	@Override
//	public String toString() {
//		return "종류 : " + species + "이름 : " + name + ", 나이 : " + age + ", 무게 : " + weight + "kg";
//	}
//	@Override
//	public String eat() {
//		return "Meat";
//	}
//	
//}
//
////동물 상속받는 초식동물; 동물 안의 초식동물; 동물 > 초식동물
//class Herbivore extends Animal implements IFeeding {
//	protected String name;
//	protected int age;
//	protected int weight;
//	public Herbivore(String species, String name, int age, int weight) {
//		this.species = species;
//		this.name = name;
//		this.age = age;
//		this.weight = weight;
//	}
//	public String getSpecies() {
//		return species;
//	}
//	public void setSpecies(String species) {
//		this.species = species;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getWeight() {
//		return weight;
//	}
//	public void setWeight(int weight) {
//		this.weight = weight;
//	}
//	// 이름(기린, 토끼 등), 나이, 몸무게 String 리턴값 메소드
//	@Override
//	public String toString() {
//		return "종류 : " + species + "이름 : " + name + ", 나이 : " + age + ", 무게 : " + weight + "kg";
//	}
//	@Override
//	public String eat() {
//		return "Grass";
//	}
//	
//}