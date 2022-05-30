// 강아지 Dog 클래스
// name : 이름
// breed : 종
// age : 나이

// 강아지 3개의 모든 필드를 전달받아 초기화 할 수 있는
// 생성자

// 강아지 이름, 종을 전달받은 값으로 초기화하고
// 나이는 1살로 초기화 할 수 있는 생성자

// 모든 필드를 private 접근 제한자로 정보은닉(캡슐화)하여
// 각 필드의 public한 getter/setter를 작성해보세요.


public class Dog {
	private String name = "비용이";
	private String breed = "Papillon";
	private int age = 2;
	
	public Dog (String n, String b, int a) {
		name = n;
		breed = b;
		age = a;
		System.out.println("초기화 연습 1, 3개 전달 받기");
	}
	
	public Dog (String n, String b) {
		this(n, b, 1);
		System.out.println("초기화 연습 2, 2개 전달 받기");
	}
	// 필드 이름과 메소드의 파라미터 이름은 같아도 상관없음. but 값이 초기화 되지 않는다. this.name을 쓰면 왼쪽은 필드를 나타낸다는 뜻으로, 초기화가 가능.
	// Name getter/setter 설정
	public String getName() {
		return name;
	}
	
	public String setName(String name) {
		this.name = name;
		return name;
	}
	// Breed getter/setter
	public String getBreed() {
		return breed;
	}
	public String setBreed(String breed) {
		this.breed = breed;
		return breed;
	}
	// Age getter/setter
	public int getAge() {
		return age;
	}
	public int setAge(int age) {
		this.age = age;
		return age;
	}
	
	public void printAll() {
		System.out.printf("강아지 이름: %s\n종: %s\n나이: %d\n", name, breed, age);
	}
}