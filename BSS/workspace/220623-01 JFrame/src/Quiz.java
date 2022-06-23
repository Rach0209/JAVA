import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz extends JFrame {
	int x;
	int y;
	int z;
	int answer;

	public Quiz() {
		super("QUIZ TIME!!!");
		JPanel pnlTop = new JPanel();
		JPanel pnlMain = new JPanel();
		JPanel pnlMiddle = new JPanel();
		JPanel pnlBottom = new JPanel();

		BoxLayout box = new BoxLayout(pnlMain, BoxLayout.Y_AXIS);
		pnlMain.setLayout(box);
		pnlMain.add(pnlTop);
		pnlMain.add(pnlMiddle);
		pnlMain.add(pnlBottom);

		// 난수
		Random random = new Random();
		JLabel subTitle = new JLabel("LET'S QUIZ TIME!");
		JLabel quiz = new JLabel();
		JButton makeQ = new JButton("문제 생성");
		JButton check = new JButton("확인");
		JTextField tf = new JTextField(10);
		JLabel correct = new JLabel("정답");
		JLabel wrong = new JLabel("오답");
		JButton reset = new JButton("다시풀기");

		correct.setVisible(false);
		wrong.setVisible(false);
		quiz.setVisible(false);

		makeQ.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				x = random.nextInt(15);
				y = random.nextInt(15);
				z = random.nextInt(4);
				if (z == 0) {
					quiz.setText((x + 1) + "+" + (y + 1) + "= ?");
				} else if (z == 1) {
					quiz.setText((x + 1) + "-" + (y + 1) + "= ?");
				} else if (z == 2) {
					quiz.setText((x + 1) + "*" + (y + 1) + "= ?");
				} else if (z == 3) {
					if (x >= y) {
						quiz.setText((x + 1) + "÷" + (y + 1) + "= ? 몫만입력");
					} else {
						quiz.setText((y + 1) + "÷" + (x + 1) + "= ? 몫만입력");
					}
				}
				quiz.setVisible(true);
			}
		});
		check.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (z == 0) {
					answer = x + y + 2;
				} else if (z == 1) {
					answer = x - y;
				} else if (z == 2) {
					answer = (x + 1) * (y + 1);
				} else if (z == 3) {
					if (x >= y) {
						answer = (x + 1) / (y + 1);
					} else {
						answer = (y + 1) / (x + 1);
					}
				}
				String input = tf.getText();
				if (input.equals(Integer.toString(answer))) {
					correct.setVisible(true);
					wrong.setVisible(false);
					JOptionPane.showMessageDialog(Quiz.this, "정답이요");
				} else {
					correct.setVisible(false);
					wrong.setVisible(true);
					JOptionPane.showMessageDialog(Quiz.this, "오답이요ㅋㅋㅋㅋ");
				}
			}
		});
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("");
				correct.setVisible(false);
				wrong.setVisible(false);
				quiz.setText("");
			}
		});
		pnlTop.add(subTitle);
		pnlMiddle.add(quiz);
		pnlMiddle.add(makeQ);
		pnlBottom.add(tf);
		pnlBottom.add(check);
		pnlBottom.add(correct);
		pnlBottom.add(wrong);
		pnlBottom.add(reset);

		add(pnlMain);

		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Quiz().setVisible(true);
	}
}
