
public class CupRamen {
	private String productedBy;
	private String name;
	private int price;

	public CupRamen(String productedBy, String name, int price) {
		this.productedBy = productedBy;
		this.name = name;
		this.price = price;
	}

	public String getProductedBy() {
		return productedBy;
	}

	public void setProductedBy(String productedBy) {
		this.productedBy = productedBy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "제조사: " + productedBy + ", 제품이름: " + name + ", 가격: " + price;
	}

	// 메소드 없이 그냥 equals로 비교하면, 항상false 각 생성자의 참조값이 다르기때문.
		// 메소드 사용함으로써 실제 비교 가능.
		// 기본 Object의 equals는 참조가 같아야 같다고 return 되어있음. return (this == obj);
		// equals는 boolean 타입 리턴
		@Override 
		public boolean equals(Object obj) {
			if (obj instanceof CupRamen) {
				CupRamen ramen = (CupRamen) obj;
				return (productedBy.equals(ramen.productedBy)
						 && name.equals(ramen.name));
			} else {
				return false;
			}
		}
		
		// 이클립스가 제공하는 equals
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) // 참조가 자신을 참조하는 것이 맞냐
//			return true;
//		if (!(obj instanceof CupRamen))
//			return false;
//		CupRamen other = (CupRamen) obj;
//		if (name == null) { // null값 참조
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name)) // 이름이 다를 때.
//			return false;
//		if (productedBy == null) { // 널값 참조
//			if (other.productedBy != null)
//				return false;
//		} else if (!productedBy.equals(other.productedBy)) // 제조사가 다를 때
//			return false;
//		return true; // 다를 때가 아닌; 이름과 제조사가 같을 때 트루값
//	}
		
		
		// hashCode() 해쉬코드 toString()의 숫자버전
//		@Override
//		public int hashCode() {
//			final int prime = 31;
//			int result = 1;
//			result = prime * result + ((name == null) ? 0 : name.hashCode());
//			result = prime * result + ((productedBy == null) ? 0 : productedBy.hashCode());
//			return result;
//		}	
	
}
