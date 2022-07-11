import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		List<Integer> list = new ArrayList<>();
		String line;
		try {
			br = new BufferedReader(new FileReader(new File("d:\\filetest\\test01_01.txt")));

			while ((line = br.readLine()) != null) {
				list.add(Integer.valueOf(line));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		Collections.sort(list);
		System.out.println(list);

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(new File("d:\\filetest\\test01_02.txt")));
			for (int i = 0; i < list.size(); i++) {
				pw.write(String.valueOf(list.get(i)) + "\n");
			}
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
		
		
	}
	
}
