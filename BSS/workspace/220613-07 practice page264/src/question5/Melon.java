package question5;

public class Melon extends Food {
	private String info;

	public Melon(int kcal, int price, int weight, String info) {
		super(kcal, price, weight);
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	
	public String toString() {
		return super.toString() + " 농원 정보 = " + info;
	}
	
	
}
