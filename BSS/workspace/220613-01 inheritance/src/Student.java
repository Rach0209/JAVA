// Person 클래스; 사람(부모 클래스)에게서 상속 받기
public class Student extends Person {
//	private String name;
//	private int age;
	private int score; // 상속 제외하고 자신만이 들고있는 것. +alpha
	
	public Student(String name, int age, int score) { // 상속 받기전 기본 생성자.
		// ****부모의 생성자를 호출하는 super키워드****
		// 언제나 생성자의 첫문장 이여야 함.
		super(name, age);
//		this.name = name; 	// this. 는 자기 자신을 참조
//		this.age = age;		// name, age는 Person클래스에서 참조중
		this.score = score;
	}
	public void setAge() { // 한가지만 접근하는 것도 가능.
		age = 10; // super.age, this.age 다 가능. private 하지만 않다면 자식이 접근 가능.
	}
	
//	public String getName() {
//		return name;
//	}
	// 부모에게 상속 받고, 나머지 추가적인 field.
//	public int getAge() { // age라는 필드를 볼 수 없기 때문에 만들 수 없다. 
//		// person 에서 protected int age;로 변경하면 getter 생성 가능.
//		return age;
//	}
//	
	public int getScore() {
		return score;
	}
	
}
