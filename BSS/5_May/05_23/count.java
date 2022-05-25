// 개발자는 통계, 집계 찾는 일을 많이 하게 될 것임
// count 잊지 말기

public class count {
	public static void main(String[] args) {
		// 300 ~ 400 사이의 정수 중
		// 13의 배수를 찾아
		// 몇 개가 있는지 출력하기.
		int count = 0; // 변수 하나를 주고, for 문안에서 count++ 을 줘서, count의 개수를 반복문 만큼 올린다.
		for (int i = 300; i <=400; i++) {
			if (i % 13 == 0) {
				System.out.println("확인 : " + i);
				count++;
			}
		}
		System.out.println(count + "개 입니다."); // count++ 로 올라간 개수만큼 count가 출력
	}
}