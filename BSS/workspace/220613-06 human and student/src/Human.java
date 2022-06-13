public class Human {
	private String name;
	private int age;
	// 부모 클래스에서 변경이 생기면, 자식클래스에서 모두 영향을 받는다.
	// 신중하게 사용하여야 한다.
	private String profession; 
	
	
	public Human(String name, int age, String profession) {
		this.name = name;
		this.age = age;
		this.profession = profession;
	}
	
	public String toString() {
		return name + " " + age + "세";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getProfession() {
		return profession;
	}
	

	
//	public static void main(String[] args) {
//		Human h1 = new Human("춘향", 18);
//		Human h2 = new Human("몽룡", 21);
//		Human h3 = new Human("사또", 50);
//		
//		System.out.println(h1.toString());
//		System.out.println(h2.toString());
//		System.out.println(h3.toString());
//	}
}
