import java.io.File;

public class Main {
	public static void main(String[] args) {
//		File file = new File("d:\\Java\\test.txt");
//		
//		System.out.println(file.getName());
//		System.out.println(file.getPath());
//		System.out.println(file.exists());
//		
//		File f2 = new File("d:\\Java\\asdf.txt");
//		
//		System.out.println(f2.getName());
//		System.out.println(f2.getPath());
//		System.out.println(f2.exists());
		
		File dir = new File("d:\\Java");
		System.out.println(dir.getName());
		System.out.println(dir.getPath());
		System.out.println(dir.exists());
		
		System.out.println("파일인가요? " + dir.isFile());
		System.out.println("디렉토리인가요? " + dir.isDirectory());
	}
}
