import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Main2 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("banana"); // 중복된 원소
		
		System.out.println(set.size());
		System.out.println(set.toString());
		
		// ***** set의 특징 : 삽입된 순서를 신경쓰지 않는다. index도 존재하지 않음.*****
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		} // 순서가 변경되었다.
		
		// 중복에 집중.
		// indexOf없음.
		set.contains("banana");
		set.contains("donut");
	}
}
