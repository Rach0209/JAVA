import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("둘리", 100); // key(이름)는 중복되지 않는다고 생각해서 실행
		map.put("홍길동", 90);
		map.put("도우너", 150);
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1,  "둘리");	
		map2.put(4, "홍길동");
		map2.put(3, "도우너");
		
		System.out.println(map.toString());
		// java.util.map.Entry; import 필요
		// entrySet(); => 짝궁 객체  예) map.put("둘리", 100); => 이 객체 하나를 Entry라 부름
		// 다른 언어에서 주로 pair로 불림 자바에서는 entry = 한 쌍
		// Entry도 결국 Set. key와 value로 이루어져 있다.
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> e : entrySet) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
		
		
		
		
//		// key값들을 불러오기. 값 달라고~
//		// Set은 순환 가능하다.
//		// iterator를 사용해서 keySet의 모든 키값들을 불러온다.
//		Set<String> keySet = map.keySet();
//		Iterator<String> iter = keySet.iterator();
//		while (iter.hasNext()) {
//			String key = iter.next();
//			Integer value = map.get(key);
//			
//			System.out.println(key + "=" + value);
//		}
//		// for-each문 사용하기
//		for (String key : keySet) { // map.get(key) => value
//			System.out.println(key + "=" + map.get(key));
//		}
		
	}
}
