import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
// LinkedHashSet => 추가된 순서를 유지하면서 중복을 제거한다.
public class Main6 {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("apple");
		
		// 입력 순서를 유지하지만, 여전히 index는 존재하지 않음.
		for (String s : set) {
			System.out.println(s);
		}
		
		Set<String> set2 = new HashSet<>(Arrays.asList("apple", "donut", "egg", "fanta"));
		
//		set.addAll(set2);
//		System.out.println(set);
		
		// HashSet인 set2에 set을 집어넣으면 순서가 섞인다.
		set2.addAll(set);
		System.out.println(set2);
	}
}
