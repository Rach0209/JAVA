import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("가", "나", "다", "다", "다", "가", "라"));

		Set<String> set = new HashSet<>(list);
		System.out.println(set);
		
		
		
		// Set 안에 list 원소를 넣어주면 알아서 중복을 걸러줌.
//		for (int i = 0; i < list.size(); i++) {
//			set.add(list.get(i));
//		}
//		
//		System.out.println(set);
	}
}
