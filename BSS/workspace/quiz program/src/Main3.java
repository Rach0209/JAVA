import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class Main3 extends JFrame {
	public Main3() {
		JPanel red = new JPanel();
		red.setBackground(Color.red);
		
		JPanel blue = new JPanel();
		blue.setBackground(Color.blue);
		
//		// 화면을 잘라서 보여줄 수 있다. 가로 : VERTICAL 세로 : HORIZONTAL
//		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, red, blue);
//		// 자를 기본 위치
//		split.setDividerLocation(150);
//		add(split);
		
		JTabbedPane tab = new JTabbedPane();
		tab.add("빨강", red);
		tab.add("파랑", blue);
		add(tab);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}
