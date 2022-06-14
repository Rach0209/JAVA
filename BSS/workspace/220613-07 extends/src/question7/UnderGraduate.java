package question7;

public class UnderGraduate extends Student {
	private String clubName;

	public UnderGraduate(String name, int idnum, String department, int grade, int creditsCompleted, String clubName) {
		super(name, idnum, department, grade, creditsCompleted);
		this.clubName = clubName;
	}

	public String getClubName() {
		return clubName;
	}
	
	@Override
	public String toString() {
		return super.toString() + "동아리명: " + clubName;
	}
	
	
}
