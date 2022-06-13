package question7;

public class Graduate extends Student {
	private String type;
	private double scholarship;
	public Graduate(String name, int idnum, String department, int grade, int creditsCompleted, String type,
			double scholarship) {
		super(name, idnum, department, grade, creditsCompleted);
		this.type = type;
		this.scholarship = scholarship;
	}
	public String getType() {
		return type;
	}
	public double getScholarship() {
		return scholarship;
	}

	public String toString() {
		return super.toString() + "조교 유형: " + type + ", 장학금 비율: " + scholarship;
	}
	
	
}
