import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main7 {
	public static void main(String[] args) {
		// 1,2,3,4번 리스트들은 각각의 리스트로 만들기. 총 4개의 리스트
		// 1번. 2의 배수를 5개 가지는 정수형 리스트 생성 및 초기화 해보기
//		List<Integer> twoMultiple = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
		List<Integer> twoMultiple = new ArrayList<>();
		int[] two = new int[5];
		for (int i = 1; i < 6; i++) {
			two[i - 1] = 2 * i;
			twoMultiple.add(two[i - 1]);
		}
		
		System.out.println("2의 배수 5개 리스트: " + twoMultiple);
//		twoMultiple.clear(); // 초기화

		// 2번. 7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화 해보기
//		List<Integer> sevenMultiple = new ArrayList<>(Arrays.asList(7, 14, 21, 28, 35));
		List<Integer> sevenMultiple = new ArrayList<>();
		int[] seven = new int[5];
		for (int i = 1; i < 6; i++) {
			seven[i - 1] = 7 * i;
			sevenMultiple.add(seven[i - 1]);
		}
		System.out.println("7의 배수 5개 리스트: " + sevenMultiple);
//		sevenMultiple.clear(); // 초기화

		// 3번. 위의 리스트의 원소들을 모두 다 가지는 리스트
		List<Integer> list = new ArrayList<>();
		list.addAll(twoMultiple);
		list.addAll(sevenMultiple);
		System.out.println("-----------리스트 합치기-------------");
		System.out.println("하나의 리스트로 원소 합치기: " + list);

		// 4번. 3번의 리스트를 오름차순으로 정렬된 원소를 가지는 리스트
		List<Integer> ascList = new ArrayList<>(list);
		Collections.sort(ascList);
		System.out.println("-----------오름차순 정렬--------------");
		System.out.println("정렬 전: " + list); // 정렬 전
		System.out.println("정렬 후: " + ascList); // 정렬 후

		// 5번. (Random 객체를 사용하여) 0 ~ 10 사이의 난수(정수형)를 6개 가지는 리스트 (각 숫자값은 중복되지 않아야 함)
		Random random = new Random();
		List<Integer> randomList = new ArrayList<>();
		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) {
			arr[i] = random.nextInt(11);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		for (int e : arr) {
			randomList.add(e);
		}
		System.out.println("-------------중복 제거--------------");
		System.out.println("난수(정수형) 0 ~ 10까지 중복 없이 6개 리스트 만들기: " + randomList);
		
		// contains 사용하기
		List<Integer> listRandom = new ArrayList<>();
		while (listRandom.size() < 6) {
			int result = random.nextInt(11);
			if (!listRandom.contains(result)) { // 포함되지 않을때만(중복이 없을 때) 리스트에 더하기.
				listRandom.add(result);
			}
		}
		System.out.println("contains를 사용해서 난수 6개 중복없이 리스트 만들기: " + listRandom);
	}
}
