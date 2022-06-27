import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main4 extends JFrame {
	public Main4() {
		CardLayout layout = new CardLayout();
		JPanel center = new JPanel(layout);

		
		JPanel pnl1 = makePanel("첫번째");
		JPanel pnl2 = makePanel("두번째");
		JPanel pnl3 = makePanel("세번째");

		center.add(pnl1, "A");
		center.add(pnl2, "B");
		center.add(pnl3, "C");
		
//		layout.show(center, "B"); // 시작할 때 "B"화면을 보여준다.
		
		add(center);
		
		JButton btnNext = new JButton("다음");
		JButton btnPrev= new JButton("이전");
		
		JPanel pnlSouth = new JPanel();
		pnlSouth.add(btnPrev);
		pnlSouth.add(btnNext);
		
		add(pnlSouth, "South");
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("다음")) {
					layout.next(center);
				} else {
					layout.previous(center);
				}
			}
		};
		btnNext.addActionListener(listener);
		btnPrev.addActionListener(listener);
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	private JPanel makePanel(String text) {
		JPanel pnl = new JPanel();
		pnl.add(new JLabel(text));
		return pnl;

	}

	public static void main(String[] args) {
		new Main4().setVisible(true);
	}

}
