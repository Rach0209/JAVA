import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {
	private int x;
	private int y;
	
	public Main() {
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("입력");
		x = 100;
		y = 100;
		lbl.setBounds(x, y, 50, 50);
		pnl.add(lbl);

		add(pnl);

		// 상호작용이 되게끔 설정
		pnl.setFocusable(true);
		pnl.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				if (code == KeyEvent.VK_LEFT) {
					x -= 15;
				} else if (code == KeyEvent.VK_RIGHT) {
					x += 15;
				} else if (code == KeyEvent.VK_UP) {
					y -= 15;
				} else if (code == KeyEvent.VK_DOWN) {
					y += 15;
				}
				lbl.setLocation(x, y);

//				char c = e.getKeyChar();
//				lbl.setText(String.valueOf(c));
			}

		});

		// key이벤트 발생했을 때 리스너 생성
//		pnl.addKeyListener(new KeyListener() {
//			// 하나의 키가 온전하게 입력이 되었을 때
//			@Override
//			public void keyTyped(KeyEvent e) {
//				
//			}
//			// 키 버튼을 뗏을 때
//			@Override
//			public void keyReleased(KeyEvent e) {
//				
//			}
//			// 키 버튼을 눌렀을 때
//			@Override
//			public void keyPressed(KeyEvent e) {
//				
//			}
//		});

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
