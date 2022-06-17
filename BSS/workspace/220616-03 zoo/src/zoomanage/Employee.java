package zoomanage;
import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	protected String part;
	protected String name;
	public Employee(String part, String name) {
		this.part = part;
		this.name = name;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "담당 분야 : " + part + ", 이름 : " + name;
	}
	@Override
	public int compareTo(Employee employee) {
		return 0;
	}
	

}
// 조련사 클래스
class Trainer extends Employee {
	protected String species; // 육식 초식 나누기

	public Trainer(String part, String name, String species) {
		super(part, name);
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override// 육식동물 / 초식동물 분야 나타내기
	public String toString() {
		return "관리 분야 : " + species + " 동물";
	}
	
	
	
}
// 경영 클래스
class Management extends Employee {

	public Management(String part, String name) {
		super(part, name);
	}

	@Override
	public String toString() {
		return "경영팀";
	}
	
	
}
// 직원 이름순 불러오기
class NameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
// 직원 파트순 불러오기
class PartComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.part.compareTo(o2.part);
	}
	
}