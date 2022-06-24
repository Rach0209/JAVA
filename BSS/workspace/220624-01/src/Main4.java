import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

// cm => inch, inch => cm 단위 변환기
public class Main4 extends JFrame {
	private double input;
	private boolean state;
	private double convertResult;

	public Main4() {
		super("Converter : cm to inch");
		JPanel pnlMain = new JPanel();
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();
		JButton calc = new JButton("변환하기");
		JRadioButton rdb1 = new JRadioButton("cm -> inch");
		JRadioButton rdb2 = new JRadioButton("inch -> cm");
		JRadioButton rdb3 = new JRadioButton("°C -> °F");
		JRadioButton rdb4 = new JRadioButton("°F -> °C");
		ButtonGroup group = new ButtonGroup();
		JTextField tf = new JTextField(10);
		JLabel result = new JLabel();
		group.add(rdb1);
		group.add(rdb2);
		group.add(rdb3);
		group.add(rdb4);

		pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.Y_AXIS));

		pnlMain.add(pnlTop);
		pnlMain.add(pnlBottom);
		pnlTop.add(rdb1);
		pnlTop.add(rdb2);
		pnlTop.add(rdb3);
		pnlTop.add(rdb4);
		pnlTop.add(calc);
		pnlBottom.add(tf);
		pnlBottom.add(result);

		ItemListener iListener = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				state = e.getStateChange() == ItemEvent.SELECTED;
			}
		};
		ItemListener reset = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				state = e.getStateChange() != ItemEvent.SELECTED;
				tf.setText("");
			}
		};
		
		ActionListener aListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (rdb1.isSelected() || rdb2.isSelected()) {
					if (!tf.getText().isEmpty()) {
						input = Double.parseDouble(tf.getText());
						convertResult = state ? (input / 2.54) : (input * 2.54);
						String cvtResult = String.format("%.2f", convertResult);
						result.setText("변환 결과 : " + cvtResult);
					} else {
						JOptionPane.showMessageDialog(pnlMain, "값을 입력해주세요!!");
					}
				} else if (rdb3.isSelected() || rdb4.isSelected()) {
					if (!tf.getText().isEmpty()) {
						input = Double.parseDouble(tf.getText());
						convertResult = state ? (((input * 9) / 5) + 32) : (((input - 32) * 5) / 9);
						String cvtResult = String.format("%.2f", convertResult);
						result.setText("변환 결과 : " + cvtResult);
					} else {
						JOptionPane.showMessageDialog(pnlMain, "값을 입력해주세요!!");
					}
				}
			}
		};

		rdb1.addItemListener(iListener);
		rdb3.addItemListener(iListener);
		rdb1.addItemListener(reset);
		rdb3.addItemListener(reset);
		calc.addActionListener(aListener);
		
		add(pnlMain);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}
