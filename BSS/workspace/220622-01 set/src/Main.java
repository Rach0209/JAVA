import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		// add로 추가된 원소 => *객체*의 형태.
		boolean b1 = set.add("qwer");
		boolean b2 = set.add(Integer.valueOf(10));
		boolean b3 = set.add("qwer");
		// add메소드는 boolean 값으로 확인
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		// 중복된 원소값이 입력되지 않음.
		System.out.println(set.size()); // => 2 출력
		// toString()오버라이드 되어있음.
		System.out.println(set.toString());
		
		// get메소드 자체가 존재하지 않음.
//		set.get(0); // set은 원소의 index번호를 가지고 있지 않다.
//		for (int i = 0; i < set.size(); i++) {
//			set.get(i);
//		}
		// 원소는 객체의 형태를 띄고 있다.
		// for-each문으로 모든 원소를 불러 올 수 있음.
		for (Object o : set) {
			System.out.println(o);
		}
		System.out.println();
		// iterator로 모든 원소 하나씩 호출.
		Iterator<Object> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
