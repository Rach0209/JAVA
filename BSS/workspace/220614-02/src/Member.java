public class Member {
	private String name;
	private double height;
	private double weight;
	
	public Member(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// 기본 정보 출력
	@Override
	public String toString() { 
		return "회원 성함: " + name + ", 키: " + height + ", 몸무게: " + weight;
	}
	
	// BMI계산
	public double CalcBmi() {
		return weight / (((height / 100) * (height / 100)));
	}
	
}
