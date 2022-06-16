interface PrintAll {
	void printAll();
}


public class Main {
	public static void main(String[] args) {

		// 클래스의 이름만 설정하지 않을 수 있음.
		new PrintAll() {
			@Override
			public void printAll() {
				System.out.println("출력할 거시 없는거시예여");
			}
		}.printAll(); // .printAll()앞의 내용을 전부다 인스턴스 화
		// 완전한 일회용 사용
		
		
		PrintAll a = new PrintAll() {
			@Override
			public void printAll() {
				System.out.println("출력할 거시 없는거시예여");
			}
		};
		a.printAll(); // 비교적 여러번 사용할 것을 생성자로 설정
		// a 는 이름이 없는 클래스의 인스턴스를 참조함
		
		// 클래스를 잠시만 쓸 때.
		// 지역 클래스사용
		class Point implements PrintAll {
			int x;
			int y;
			public Point(int x, int y) {
				super();
				this.x = x;
				this.y = y;
			}
			// implements 하기 때문에 재정의 필수 
			@Override
			public void printAll() {
				System.out.println(x);
				System.out.println(y);
			}
			
		}
		
		Point p = new Point(10, 20);
		p.printAll();
	}
}
