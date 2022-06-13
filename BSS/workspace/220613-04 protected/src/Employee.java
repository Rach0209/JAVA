public class Employee {
	public String name;			// 이름 : 공용 멤버
	String address;				// 주소 : 패키지 멤버
	protected int salary;		// 월급 : 보호 멤버
	private int RRN;			// 주민등록번호 : 전용 멤버 	// 수퍼클래스에서 private로 정의된
								// 멤버는 서브 클래스에서 접근할 수 없다. 
	public Employee() {}
	
	public Employee(String name, String address, int salary, int RRN) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.RRN = RRN;
	}
	
	public String toString() {
		return name + ", " + address + ", " + RRN + ", " + salary;
	}
	
	
}
