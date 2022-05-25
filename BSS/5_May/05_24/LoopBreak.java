public class LoopBreak {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;		// 필요시에는 쓰지만, 쓰지 않는 것을 추천``
			}
			System.out.println(i);
		}
		
		for (int i = 10; i < 20; i++) {
			if (i % 10 == 5) {
				continue;		// for의 증감식으로 바로 건너띈다. 밑으로 flow되지 않음.<(System.out.println(i); 대신 i++(증감식)로>
			}
			System.out.println(i);
		}
		
		int i = 20;
		while (i < 30) {
			// if (i == 25) {
				// continue;		// while의 조건식으로 이동. 
			// }
			if ( i != 25) {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println("프로그램 종료");
	}
}