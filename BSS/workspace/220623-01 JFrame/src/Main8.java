import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main8 extends JFrame {
	public Main8() {
		JPanel pnlTop = new JPanel();
		JPanel pnlBox = new JPanel();
		JPanel pnlBottom = new JPanel();
		
		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);

		JLabel question = new JLabel("피아노 건반은 몇개 인가? (OO 또는 OO개 라고 입력)");
		JTextField tf = new JTextField(20);
		JButton btn = new JButton("정답 확인");
		JLabel trueAnswer = new JLabel("결과 : 정답");
		JLabel falseAnswer = new JLabel("결과 : 오답");

		trueAnswer.setVisible(false);
		falseAnswer.setVisible(false);

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				if (text.equals("88") || text.equals("88개")) {
					trueAnswer.setVisible(true);
					falseAnswer.setVisible(false);
					JOptionPane.showMessageDialog(Main8.this, "어케 알았노");
				} else {
					trueAnswer.setVisible(false);
					falseAnswer.setVisible(true);
				}
			}
		});

		pnlTop.add(question);
		pnlBottom.add(tf);
		pnlBottom.add(btn);
		pnlBottom.add(trueAnswer);
		pnlBottom.add(falseAnswer);

		add(pnlBox);

		setSize(450, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		JFrame main = new Main8();
		main.setTitle("퀴즈");
		main.setVisible(true);

	}
}
