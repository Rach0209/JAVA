import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("hello", 1);
		map.put("world", 2);
		map.put("abc", 123);
		
		Map<String, Integer> treeMap = new TreeMap<>(); // 'key' 기준
		treeMap.put("hello", 1);
		treeMap.put("world", 2);
		treeMap.put("abc", 123);
		
		System.out.println(map);
		// TreeMap은 'key'의 크기에 따라서 정렬되어 준다.
		// 이 때; 'key'는 comparable 해야하며, 다른 기준은 Comparator 설정해서 정렬가능.
		System.out.println(treeMap);		
	}
}
