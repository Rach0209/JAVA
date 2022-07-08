import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;

// 파일을 선택하는 선택창 만들기
public class Main extends JFrame {

	Main() {
		JPanel pnl = new JPanel();
		JPanel pnl2 = new JPanel();
		JPanel pnl3 = new JPanel();
		JButton btnOpen = new JButton("열기");
		JButton btnSave = new JButton("저장");
		JTextArea ta = new JTextArea(20, 40);
		JScrollPane scroll = new JScrollPane(ta);
		
		
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
		pnl.add(pnl2);
		pnl.add(pnl3);

		pnl2.add(btnOpen);
		pnl2.add(btnSave);
		pnl3.add(scroll);
		ta.setCaretPosition(ta.getDocument().getLength());

		JFileChooser chooser = new JFileChooser();

		btnOpen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = chooser.showOpenDialog(null);
				BufferedReader br = null;
				
				try {
					if (result == JFileChooser.APPROVE_OPTION) {
						File file = chooser.getSelectedFile();
						br = new BufferedReader(new FileReader(file));
						
						String line;
						ta.setText("");
						while ( (line = br.readLine()) != null) {
							ta.append(line + "\n");
						}
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					if (br != null) {
						try {
							br.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});

		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = chooser.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					File file = chooser.getSelectedFile();

					PrintWriter pw = null;
					try {
						pw = new PrintWriter(new FileWriter(file, true));
						String memo = ta.getText();
						pw.println(memo);
						pw.flush();
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						pw.close();
					}

				}

			}
		});

		FileFilter filter = new FileFilter() {
			@Override
			public String getDescription() {
				return "텍스트 파일";
			}
			
			@Override
			public boolean accept(File f) {
				if (f.isDirectory()) {
					return true;
				}
				return f.getName().endsWith(".txt");
			}
		};
		
		chooser.setFileFilter(filter);
		getContentPane().add(pnl);
		pack();
//		setResizable(false);
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		new Main().setVisible(true);

//		JFileChooser chooser = new JFileChooser();
//
//		FileFilter filter = new FileFilter() {
//			@Override
//			public String getDescription() {
//				return "텍스트 파일";
//			}
//			
//			@Override
//			public boolean accept(File f) {
//				if (f.isDirectory()) {
//					return true;
//				}
//				return f.getName().endsWith(".txt");
//			}
//		};
////		chooser.setFileFilter(filter);
//		chooser.showOpenDialog(null);
//		int result = chooser.showSaveDialog(null); // 저장 버튼 눌렀을 때값 : 0, 나머지는 : 1
//		System.out.println(result);
//		if (result == JFileChooser.APPROVE_OPTION) {
//			System.out.println("저장 버튼 눌렀을 때");
//
//			File file = chooser.getSelectedFile();
//			System.out.println(file);
//			System.out.println("사용자가 선택한 파일 : " + file.getAbsolutePath());
//		}

	}
}
