import java.util.Arrays;
import java.util.Comparator;

// 멤버 관리 프로그램
// 키 순(오름차순)으로 멤버를 조회하기
//----------------------------
// 몸무게 순(오름차순)으로 멤버를 조회하기 << 어제거랑 위에거 다 하고 난 후~~
class WeightComparator implements Comparator<Member> {
	@Override
	public int compare(Member o1, Member o2) {
		return o1.weight - o2.weight;
	}
}

public class OrderByWeightMember {
	public static void main(String[] args) {
		Member[] members = { new Member("키큰놈", 190, 60)
				, new Member("키작은놈", 130, 30)
				, new Member("중간쯔음", 176, 65)
		};
		
		WeightComparator comparator = new WeightComparator();
		int result = comparator.compare(members[0], members[1]);
//		System.out.println(result);
		
		Arrays.sort(members, comparator);
		System.out.println(members[0].weight);
		System.out.println(members[1].weight);
		System.out.println(members[2].weight);
		
		// 로컬 클래스;
		// Comparator 인터페이스 이름을 업캐스팅.
		// 상속도 가능.
		// 끝에 세미콜론; 으로 종료해주어야댐
		Comparator<Member> c = new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return o1.name.compareTo(o2.name); 
			}
		};
		
		Comparator<Member> nameCom = new Comparator<Member>() {
			public String myField;
			
			public void hello() {
				System.out.println("Hello");
			}
			
			@Override
			public int compare(Member o1, Member o2) {
				return o1.name.compareTo(o2.name);
			}
		};
		
		// 익명 클래스 (anonymous class) 일회용으로 사용하고 사라짐
		Arrays.sort(members, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println(members[0].name);
		System.out.println(members[1].name);
		System.out.println(members[2].name);
		
		
		
		// 220616-01 local and anony class 프로젝트로 이동 ㄱ
		// 지역 클래스.
		abstract class A {
			public abstract void hello();
		}
		// 지역 클래스를 상속하는 익명 클래스.
		A a = new A() {
			@Override
			public void hello() {
				
			}
		};
		
	}
}






