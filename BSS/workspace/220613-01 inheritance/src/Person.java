public class Person {
	private String name; // 학생과 작가 공통 field
	protected int age;	 // 나이를 알려 주기 위해 protected 로 변경
	// private 	 => 아무도 볼 수 없음.
	// public  	 => 아무나 볼 수 있음.
	// default 	 => 같은 클래스에서는 볼 수 있음.
	// protected => 자식들이 접근 할 수 있도록 만들어진 접근 제한자. 다른 패키지의 자식도 접근 가능.
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// getter는 알려주는 행동이라 보통 public하게 만듬~
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
}
