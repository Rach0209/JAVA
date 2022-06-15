public class Member {
	private String name;
	private double height;
	private double weight;

	public Member() {
	}

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

	// BMI 구하는 메소드. 키는 cm로 받고, 계산식은 m로 치환해야해서, (height / 100)
	public double getBmi() {
		return weight / ((height / 100) * (height / 100));
	}

	public void printBmi() {
		System.out.printf("%.02d", getBmi());
	}

	// 회원 기본정보 출력 메소드. 이름, 키, 몸무게
	@Override
	public String toString() {
		return "회원 성함: " + name + ", 키: " + height + ", 몸무게: " + weight;
	}

	// 비만 기준
	public String bmiStandard() {
		if (getBmi() < 18.5) {
			return "저체중";
		} else if (getBmi() >= 18.5 && getBmi() < 23) {
			return "정상";
		} else if (getBmi() >= 23 && getBmi() < 25) {
			return "과체중";
		} else if (getBmi() >= 25 && getBmi() < 30) {
			return "경도 비만 (1단계 비만)";
		} else if (getBmi() >= 30 && getBmi() < 35) {
			return "중도 비만 (2단계 비만)";
		} else {
			return "고도 비만";
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member otherMember = (Member) obj;
			return getName().equals(otherMember.getName()) && getHeight() == (otherMember.getHeight())
					&& getWeight() == (otherMember.getWeight());
		} else {
			return false;
		}
	}

}
