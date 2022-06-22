import java.util.HashMap;
import java.util.Map;

public class WordFreq {
	public static void main(String[] args) {
		String line = "Hello. I'm a java developer";
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i); 
//			System.out.println(c); // 모든 문자들을 가져오기.
			if (!map.containsKey(c)) {
				map.put(c, 1); // 문자값 키 하나에 1의 값 넣어주기
			} else {
//				int value = map.get(c);
//				value += 1;
//				map.put(c, value);
				map.put(c, map.get(c) + 1); // 한 줄표현
			}
		}
		System.out.println(map);

//		Map<String, Integer> m = new HashMap<String, Integer>();
//		
//		String[] sample = { "to", "be", "or", "not", "to", "be","is","a","problem" };
//		// 문자열에 포함된 단어의 빈도를 계산한다.
//		for (String a : sample) {
//			// 해당하는 키 값이 없으면 null을 반환
//			Integer freq = m.get(a);
//			m.put(a,  (freq == null) ? 1 : freq + 1);
//		}
//		
//		System.out.println(m.size() + " 단어가 있습니다.");
//		System.out.println(m.containsKey("to"));
//		System.out.println(m.isEmpty());
//		System.out.println(m);
	}
}
