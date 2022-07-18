
/*
 * restaurants 테이블에 대한 db access를 수행하는 객체를 작성해보세요. 작성 후 테스트!!
 * 
 * 메소드(입력값) : 반환값								throws 예외
 * 
 * C(상호명, 전화번호, 주소) or C(음식점) : 행 개수
 * R() : List<음식점>									throws SQLException
 * R(pk) : 음식점										throws SQLException
 * U(pk, 새 상호명, 새 전화번호, 새 주소) or U(음식점) : 행 개수	throws SQLException
 * D(pk) : 행 개수										throws SQLException
 * 
 * ---------------------------------------------------------------------
 * 
 * 여러 행의 음식점 추가
*/


public class Restaurant {
	private int restaurantId;
	public Restaurant(int restaurantId, String title, String phoneNumber, String address) {
		super();
		this.restaurantId = restaurantId;
		this.title = title;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	private String title;
	private String phoneNumber;
	private String address;
	public Restaurant(String title, String phoneNumber, String address) {
		super();
		this.title = title;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public Restaurant(int restaurantId, String title) {
		super();
		this.restaurantId = restaurantId;
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", title=" + title + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]";
	}
	
}
