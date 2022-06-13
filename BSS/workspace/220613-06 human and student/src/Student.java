public class Student extends Human {
	private String major;
		
	public Student(String name, int age, String profession, String major) {
		super(name, age, profession);
		this.major = major;
	}
	
	@Override
	public String getProfession() {
		return "학생";
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 전공: " + major; // super. 키워드로 부모의 메소드 호출
//		return getName() + " " + getAge() + "세 " + getMajor();
	}
	
//	public static void main(String[] args) {
//		Student st1 = new Student("명진", 21, "컴퓨터");
//		Student st2 = new Student("미현", 22, "경영");
//		Student st3 = new Student("용준", 24, "경제");
//		
//		System.out.println(st1.toString());
//		System.out.println(st2.toString());
//		System.out.println(st3.toString());
//	}
}
