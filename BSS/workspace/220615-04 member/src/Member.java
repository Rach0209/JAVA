import java.util.Comparator;

public class Member implements Comparable<Member> {

	protected String name;
	protected double height;
	protected double weight;

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

	// 중복 등록 방지를 위한 메소드
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

	// case 6 기능추가 Comparable의 compareTo 생성
	@Override
	public int compareTo(Member member) {
		return (int) (this.height - member.height);
	}
}
// 몸무게 (오름차순) comparator 로 비교하기
class WeightComparator implements Comparator<Member> {
	@Override
	public int compare(Member o1, Member o2) {
		return (int) (o1.weight - o2.weight);
	}
}
// 키 (오름차순) comparator 로 비교하기
class HeightComparator implements Comparator<Member> {
	@Override
	public int compare(Member o1, Member o2) {
		return (int) (o1.height - o2.height);
	}
}

// 이름 비교하기 comparator
// comparable의 compareTo가 문자열을 비교해준다.
class NameComparator implements Comparator<Member> {
	@Override
	public int compare(Member o1, Member o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

