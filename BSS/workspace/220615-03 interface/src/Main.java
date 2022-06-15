// 객체의 다형성
// 다양한 것들 표현
public class Main {
	public static void main(String[] args) {
//		Flyable f = new Flyable(); // 인터페이스도 인스턴스화 불가능
		
		Eagle e = new Eagle();
		Bird b = e; // 독수리는 새다. 업캐스팅
		Animal a = e; // 독수리는 동물이다. 업캐스팅
		Flyable f = e; // 독수리는 날 수 있다. 인터페이스 참조
		
		f.fly(); // f 는 독수리를 참조중. 독수리가 날아간다.
		
//		Flyable p = new Plane();
//		Flyable fish = new Flyingfish();
//		p.fly();
//		fish.fly();
		
//		Penguin p = new Penguin(); // 다운 캐스팅 ;
//		Flyable test = penguin; // 불가능 Flyable과 Animal은 아무런 관계없음
		
		Eagle downCasting = (Eagle) f;
		downCasting.fly();
		// 다운 캐스팅을 할 땐, instanceof 로 확인해주기!
		Flyable p = new Plane(); // 다운 캐스팅; 비행기와 독수리는 서로 아무 관련이없음.
		Eagle test = (Eagle) p; // 실행은 되지만 실행 중 에러발생
		
		
	}
}
