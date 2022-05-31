public class LolName {

	Student student1 = new Student("요네", 80, 80, 100);
	Student student2 = new Student("자크", 80, 60, 80);
	Student student3 = new Student("뽀삐", 90, 90, 85);
	int avg1 = student1.getAverage();
	int avg2 = student2.getAverage();
	int avg3 = student3.getAverage();
	int totalAvg = (avg1 + avg2 + avg3) / 3;
	String name1 = student1.getName();
	String name2 = student2.getName();
	String name3 = student3.getName();
	
	public void printOrder1() {
		System.out.println("요네 평균 : " + avg1);
		System.out.println("자크 평균 : " + avg2);
		System.out.println("뽀삐 평균 : " + avg3);
		System.out.println("총 평균 : " + totalAvg);
	}
	
	public void printOrder2() {
		System.out.println("평균점수 순위 (동점일경우 학생 순서 내림차순 : 요네 자크 뽀삐)");

		if (avg1 >= avg2 && avg1 >= avg3) {
			if (avg2 >= avg3) {
				System.out.printf("%s %s %s\n", name1, name2, name3);
			} else {
				System.out.printf("%s %s %s\n", name1, name3, name2);
			}
		} else if (avg2 >= avg1 && avg2 >= avg3) {
			if (avg1 >= avg3) {
				System.out.printf("%s %s %s\n", name2, name1, name3);
			} else {
				System.out.printf("%s %s %s\n", name2, name3, name1);
			}
		} else if (avg3 >= avg1 && avg3 >= avg2) {
			if (avg1 >= avg2) {
				System.out.printf("%s %s %s\n", name3, name1, name2);
			} else {
				System.out.printf("%s %s %s\n", name3, name2, name1);
			}
		}
	}
}
