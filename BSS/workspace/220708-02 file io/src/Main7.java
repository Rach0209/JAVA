import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main7 {
	public static void main(String[] args) {
		Map<Integer, Set<Integer>> lotto = new LinkedHashMap<>();
		
		lotto.put(1000, new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
		lotto.put(1001, new HashSet<Integer>(Arrays.asList(7, 8, 9, 10, 11, 12)));
		lotto.put(1002, new HashSet<Integer>(Arrays.asList(13, 14, 15, 16, 17, 18)));
		
		// lotto.txt 출력
		// 1000 : [1, 2, 3, 4, 5, 6]
		// 1001 : [7, 8, 9, 10, 11, 12]
		// 1002 : [13, 14, 15, 16, 17, 18]
		System.out.println(lotto);

		File file = new File("d:\\filetest\\lotto.txt");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(file));
			Set<Integer> keySet = lotto.keySet();
			for (Integer i : keySet) {
				pw.println(i + " : " + lotto.get(i));
			}
			
			
			// 반복문으로 만들었던것, keySet을 만들지 않았었음.
//			for (int i = 1000; i < 1000 + lotto.size(); i++) {
//				pw.println(i + " : " + lotto.get(i).toString());
//			}
////			pw.println("1000 : " + lotto.get(1000).toString());
////			pw.println("1001 : " + lotto.get(1001).toString());
////			pw.println("1002 : " + lotto.get(1002).toString());
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
		
		// ------ 기록하고 시점이 지났다고 가정 기존 글에 추가만 시키고 싶을 때.
		
		PrintWriter pw2 = null;
		try { // FileWriter()의 생성자에 append드 값이 boolean으로 들어간다.
			// true면 기존정보의 다음에 출력, false는 기본값 (새로 덮어씌움)
			pw2 = new PrintWriter(new FileWriter(file, true));
			pw2.println("새 번호 : 20, 22, 24, 26, 28, 30");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw2.close();
		}
		
	}
}
