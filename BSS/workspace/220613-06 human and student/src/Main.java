public class Main {
	public static void main(String[] args) {
		Human h1 = new Human("춘향", 18, "");
		Human h2 = new Human("몽룡", 21, "");
		Human h3 = new Human("사또", 50, "");
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		
		System.out.println();
		Student st1 = new Student("명진", 21, "", "컴퓨터");
		Student st2 = new Student("미현", 22, "", "경영");
		Student st3 = new Student("용준", 24, "", "경제");
		
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(st3.toString());
	}
}
