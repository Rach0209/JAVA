import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
// TreeSet
public class Main7 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(50);
		set.add(17);
		set.add(2);
		set.add(17);
		set.add(30);
		set.add(22);
		set.add(50);
		set.add(30);
		
		// TreeSet은 원소를 기본적으로 오름차순 정렬하며, 중복제거한다.
		for (int i : set) {
			System.out.println(i);
		}
	}
}
