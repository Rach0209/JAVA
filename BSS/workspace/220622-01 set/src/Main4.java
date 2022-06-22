import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
		
		// 두 개의 set의 원소를 모두 포함하는 원소 - 중복 X
		Set<Integer> setUnion = new HashSet<>();
		// addAll => 모든 원소 넣기
		setUnion.addAll(setA);
		setUnion.addAll(setB);
		System.out.println(setUnion);
		
		// 교집합 구하기
		Set<Integer> setDuplicate = new HashSet<>();
		setDuplicate.addAll(setA);
		// *** retainAll(); 교집합  = 중복된 원소만 남기고 지우기
		// 만약 교집합이 없다면 => size가 0인 set이 되어버림.
		setDuplicate.retainAll(setB);
		System.out.println(setDuplicate);
		
		// 두개 집합 중, 중복되는 것을 뺀 집합=> 차집합 구하기
		Set<Integer> setLeftOuter = new HashSet<>();
		setLeftOuter.addAll(setA);
		// removeAll(); (setB)의 원소를 모두 지움.
		setLeftOuter.removeAll(setB);
		// setA를 모두 넣고, setB의 교집합 부분을 뺀 setA의 집합 - 차집합
		System.out.println(setLeftOuter);
		
		// 동등함 비교 equals;
		Set<Integer> setSame = new HashSet<>(Arrays.asList(7, 6, 5, 4, 3, 2, 1));
		// Set은 순서상관없이, 원소가 다 들어있으면 true값. 순서 상관없다!!
		System.out.println(setSame.equals(setUnion));
	}
}
