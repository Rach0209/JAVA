import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main2 extends JFrame {
	public Main2() {
		JPanel pnl = new JPanel();
		JTextField tf = new JTextField(10);
		// 비밀번호 입력 하는필드. 입력 값을 보이지 않게 가려준다.
		JPasswordField pf = new JPasswordField(10);
		// 사용자가 여러 텍스트를 입력할 수 있는 컴포넌트. // 정수형태로 크기를 전달받
		JTextArea ta = new JTextArea(20, 20);
		// ***** 스크롤바 생성 *****
		JScrollPane scrl = new JScrollPane(ta);
		
		pnl.add(tf);
		pnl.add(pf);
		
		add(pnl);
		add(scrl, "South");
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("엔터 누름");
			}
		});
		
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int id = e.getID();
				if (id == KeyEvent.KEY_TYPED) {
					char ch = e.getKeyChar();
					ta.append(String.valueOf(ch) + "\n");
//					ta.setText(String.valueOf(ch) + "\n");
				}
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}