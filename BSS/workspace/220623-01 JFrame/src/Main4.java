import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main4 extends JFrame implements ActionListener {
	private JButton btnEnable;
	private JButton btnDisable;
	private JButton btnNotShown;
	private List<JButton> list;
	
	public Main4() {
		super("버튼 활성화 테스트~");
		list = new ArrayList<>();
		
		JPanel pnl = new JPanel();
		btnEnable = new JButton("활성화");
		btnDisable = new JButton("비활성화");
		btnNotShown = new JButton("보이나?");
		
		btnEnable.addActionListener(this);
		btnDisable.addActionListener(this);
		
		// 버튼 비활성화 시키기 setEnabled(false) 사용자가 누를 수 없는 버튼.
//		btnDisable.setEnabled(false);
		btnNotShown.setVisible(false); // 창에서 완전히 보이지 않게 설정 setVisible(false);
		
		
		pnl.add(btnEnable);
		pnl.add(btnDisable);
		pnl.add(btnNotShown);
		for (int i = 1; i < 6; i++) {
			JButton btn = new JButton(String.valueOf(i));
			pnl.add(btn);
			// 만든 버튼을 리스트에도 넣어서 참조
			list.add(btn);
		}
		
		add(pnl);

		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnable) {
			// 버튼 5개를 참조해서 전부 다 활성화 / 리스트에 넣은 버튼 참조
			for (JButton btn : list) {
				btn.setEnabled(true);
			}
		} else {
			for (JButton btn : list) {
				btn.setEnabled(false);
			}
		}
	}

	public static void main(String[] args) {
		new Main4().setVisible(true);
	}

}
