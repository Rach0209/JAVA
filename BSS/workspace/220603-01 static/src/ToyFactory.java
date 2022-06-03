public class ToyFactory {
	private String location;
	
	// 공장이 여러개 일 때, static을 붙이면 표현 불가함
//	public ToyFactory(String location) {
//		this.location = location;
//	}
	public ToyFactory() {}
	
	// Toy 앞에 static 붙여주면 기능만 불러갈 수 있음.
	public Toy makeToy() { 
		return new Toy("처키인형, 생산지:" + location, 10000);
	}
}
