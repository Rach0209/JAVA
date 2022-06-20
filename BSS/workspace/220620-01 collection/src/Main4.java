import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// List는 인터페이스다. => 추상적 개념을 다루기 위해 사용. List는 ArrayList특징을 모두 가지고 있음.
// List 특징 (interface의) iterable (반복 가능한, 열거 가능한)
public class Main4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("donut");

		// 새 인스턴스 banana있냐? => true => equals로 원소 동등함을 비교중
//		System.out.println(list.contains(new String("banana")));
		// remove >> 객체의 동등함을 비교하고, 같을 때 지워준다.
//		list.remove("banana");
//		System.out.println(list);

		// 위의 리스트에서 5글자 문자열만 찾아서 지우기
		// for-each문에서 삭제는 안됨.
//		for (String s : list) {
//			if (s.length() == 5) {
//				list.remove(s);
//			}
//		}
		
		// 마찬가지로 import 필요.
		// iterator는 객체이다. => list의 원소를 하나씩 꺼내오는 객체. => instance화
		Iterator<String> iterator = list.iterator();
		// 있는지 없는지 물어볼 수 있다. hasNext()
		while (iterator.hasNext()) { // StringTokenizer()의 hasMoreTokens()와 비슷함.
			// 반복하다보면 없는 원소가 있어도 가져오려해서 에러남
//			System.out.println(iterator.next()); // 원소를 하나씩 가져온다.
			String str = iterator.next();
			if (str.length() == 5) { // hasNext에서 원소 있냐없냐 >> 원소 가져옴 >> 글자 5글자냐? >> 그러면 지워라
				iterator.remove(); // 현재 가져온 객체를 컬렉션 객체에서 삭제를 할 수 있다.
				// iterator의 값을 지운 것이 아니라, iterator에 지워달라고 한 것임. 
				// iterator는 list를 참조하고있어서, list의 참조값을 지움 -> 결국 list의 값이 지워짐.
			}
		}
		System.out.println(list);
	}
}
