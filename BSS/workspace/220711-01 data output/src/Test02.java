import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test02 {
	public static void main(String[] args) {
		Character[] plain = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		Character[] cryptogram = { 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C' };
		BufferedReader br = null;
		String input = "";
		String line;
		String answer = "";
		Character[] characterInput = null;
		try {
			br = new BufferedReader(new FileReader(new File("d:\\filetest\\test02_01.txt")));

			while ((line = br.readLine()) != null) {
				input += line + "\n";
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
		System.out.println(input);

		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new FileWriter(new File("d:\\filetest\\test02_02.txt")));
			characterInput = new Character[input.length()];

			for (int i = 0; i < input.length(); i++) {
				characterInput[i] = input.charAt(i);
//				System.out.println(characterInput[i]);
			}
			for (int i = 0; i < characterInput.length; i++) {
				if (characterInput[i] == ' ') {
//					System.out.print(" ");
					answer += " ";
				} else if (characterInput[i] == '\n') {
					answer += "\n";
				}
				for (int j = 0; j < plain.length; j++) {
					if (plain[j].equals(characterInput[i])) {
//						System.out.print(cryptogram[j]);
						answer += cryptogram[j];
					}
				}
			}
			System.out.println(answer);
			pw.write(answer);
			pw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}

	}
}
