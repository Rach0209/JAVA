public class Manager extends Employee {
	private int bounus;
	
	public Manager() {
// 		적지 않아도 부모의 기본 생성자를 호출 하기 때문에 부모클래스에도 기본생성자를 만들어준다.
//		super(); // 생략 가능 ; 
	}

	public Manager(String name, String address
			, int salary, int RRN, int bounus) {
		super(name, address, salary, RRN);
		this.bounus = bounus;
	}

	public void printSalary() {
		// 수퍼클래스의 private 멤버를 제외한 모든 멤버 접근 가능
		System.out.println(name + "(" + address + "):" + (salary + bounus));
	}

	public void printRRN() {
//		System.out.println(RRN);		// 오류, private는 서브 클래스에서 접근 못함!
	}
}
