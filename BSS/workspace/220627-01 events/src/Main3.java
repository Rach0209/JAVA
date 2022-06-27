import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 도망치는 버튼~
public class Main3 extends JFrame {
	public Main3() {
		// null값으로 레이아웃 매니저를 없애기.
		// JPanel은 기본값으로 FlowLayout으로 배치해줌. null값으로 초기화가능.
		// 버튼의 크기와 위치를 직접 정해줄 수 있다.
		JPanel pnl = new JPanel(null);
		pnl.setPreferredSize(new Dimension(500, 500));
		
		JButton btn = new JButton("click Me");
		btn.setBounds(150, 150, 100, 100);
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			btn.setLocation((int) (Math.random() * 400), (int) (Math.random() * 400));
			}
		});
		
		pnl.add(btn);
		add(pnl);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
	}

	public static void main(String[] args) {
		new Main3().setVisible(true);
	}

}
