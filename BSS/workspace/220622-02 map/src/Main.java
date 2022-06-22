import java.util.HashMap;

// **** HashMap ****
public class Main {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		// put(key, value); key와 value가 하나의 짝으로 들어간다.
		map.put("일", 1);
		map.put("이", 2);
		map.put("삼", 3);
		map.put("사", 4);

		System.out.println(map.size());
		// 객체인 key값을 넣으면, key값에 해당하는 value값을 가져온다.
		System.out.println(map.get("이"));
		System.out.println(map.get("삼"));
		// 없는 키값은 null을 반환
		System.out.println(map.get("오"));

		// "이" 라는 key값이 없을 때만 집어 넣기.
		if (!map.containsKey("이")) {
			map.put("이", 2222);
		}
//		// value 객체의 변경이 이루어짐 => 중복을 막는 것이 아닌 덮어씌움
//		map.put("이", 2222);
		System.out.println(map.get("이"));
	}
}
