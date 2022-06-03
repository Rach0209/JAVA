// 인형공장을 예시로 static 설명.
public class TestToy {
	public static void main(String[] args) {
		Toy toy1 = new Toy("새 장난감", 5000);
		
		// 공장이 여러개다 => static 사용 불가.
		ToyFactory fac = new ToyFactory();
		Toy chucky = fac.makeToy();
		// 기능 하나만 사용할 것이다! => 스태틱으로 기능만을 호출해버리기
		
//		Toy chucky = ToyFactory.makeToy(); 
	}
}
