public class ClassRoom {
//	private Student stu1;
//	private Student stu2;
//	private Student stu3;
	private Student[] students; // 학생의 입력 배열로 받기.
	
	public ClassRoom() {}

	public ClassRoom(Student... students) {
		this.students = students;
	}
	
//	public ClassRoom(Student stu1, Student stu2, Student stu3) {
//		this.stu1 = stu1;
//		this.stu2 = stu2;
//		this.stu3 = stu3;
//	}
	
	public void printNames() { // 학생 이름 출력 메소드, 불러올 이름 배열값으로 변경
		for (int i = 0; i < students.length; i++) {
			System.out.println((i + 1) + "번 학생 : " + students[i].getName());
		}
	}
	
//	public void printNames() {
//		System.out.println("1번 학생 : " + stu1.getName());
//		System.out.println("2번 학생 : " + stu2.getName());
//		System.out.println("3번 학생 : " + stu3.getName());
//	}
	
	public int getTotalAvg() {  // 총평균 구하는 메소드, 배열값으로 변경
		int sum = 0;
		for (int i = 0; i < students.length; i++) {
			sum += students[i].getAverage();
		}
		return sum / students.length;
	}
	
//	public int getTotalAvg() {
//		return (stu1.getAverage()
//				+ stu2.getAverage()
//				+ stu3.getAverage()) / 3;
//	}
	
	public Student getTop() { 	// 1등 구하는 비교값 메소드.
		Student top = students[0];
		for (int i = 1; i < students.length; i++) {
			top = max(top, students[i]);
		}
		return top;
		
//		return max(max(stu[0], stu[1]), stu[2]);
	
//	public Student getTop() {
//		return max(max(stu1, stu2), stu3);

//		if (stu1.compare(stu2) && stu1.compare(stu3)) {
//			return stu1;
//		} else if (stu2.compare(stu1) && stu2.compare(stu3)) {
//			return stu2;
//		}
	}
	
	public Student max(Student left, Student right) {
		if (left.getAverage() >= right.getAverage()) {
			return left;
		} else {
			return right;
		}
	}
	
	public Student getStudent(int index) {
		return students[index];
	}
	
//	public Student getStu1() {
//		return stu1;
//	}
//
//	public void setStu1(Student stu1) {
//		this.stu1 = stu1;
//	}
//
//	public Student getStu2() {
//		return stu2;
//	}
//
//	public void setStu2(Student stu2) {
//		this.stu2 = stu2;
//	}
//
//	public Student getStu3() {
//		return stu3;
//	}
//
//	public void setStu3(Student stu3) {
//		this.stu3 = stu3;
//	}
	
	
}
