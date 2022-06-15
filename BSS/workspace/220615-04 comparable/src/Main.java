import java.util.Arrays;

//키를 기준으로 대소 비교.
//public int compare(Member member) {
//	// 내 키가 크면 양수, 같으면 0, 작으면 음수로 리턴값
//	// 키 차이만 구하면 된다.
//	return this.height - member.height;
//}
//이 메소드를 간단하게 인터페이스에서 추상메소드로 제공함

//***** Comparable ***** 인터페이스
//<> 제네릭 표현, 필수는 아니지만 안전해짐 <비교하고자 하는 대상 타입입력>
//Comparable의 기본 타입은 Object이기 때문에 제네릭에 비교대상 타입 입력하면,
//비교대상을 제한시켜서 원하는 타입으로 비교 가능 <Member> => (Member o) 로 비교가능
//Comparable 은 Arrays.sort가 기본 포함

class Member implements Comparable<Member> {
	String name; // 이름
	int height; // 키
	int weight; // 몸무게

	public Member(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	// 키 비교
	@Override
	public int compareTo(Member o) {
		return this.height - o.height;
	}
}

public class Main {
	public static void main(String[] args) {
		Member[] members = { new Member("키큰놈", 190, 60), new Member("키작은놈", 130, 20), new Member("중간쯔음", 176, 65) };
//		System.out.println(members[0].compareTo(members[1]));
		Arrays.sort(members);
		System.out.println(members[0].height);
		System.out.println(members[1].height);
		System.out.println(members[2].height);

	}
}
