package question7;

public class Student {
	private String name;
	private int idnum;
	private String department;
	private int grade;
	private int creditsCompleted;
	
	public Student(String name, int idnum, String department, int grade, int creditsCompleted) {
		this.name = name;
		this.idnum = idnum;
		this.department = department;
		this.grade = grade;
		this.creditsCompleted = creditsCompleted;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdnum() {
		return idnum;
	}

	public void setIdnum(int idnum) {
		this.idnum = idnum;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getCreditsCompleted() {
		return creditsCompleted;
	}

	public void setCreditsCompleted(int creditsCompleted) {
		this.creditsCompleted = creditsCompleted;
	}

	public String toString() {
		return "학생 이름: " + name + ", 학번: " + idnum + ", 학과: " + department + ", 학년: " + grade
				+ "학년, 이수학점: " + creditsCompleted;
	}
	
	
	
	
}
