import java.util.Comparator;

public class Animal implements Comparable<Animal> {
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

	@Override
	public int compareTo(Animal o) {
		return 0;
	}

}

// 동물 종류순  불러오기
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