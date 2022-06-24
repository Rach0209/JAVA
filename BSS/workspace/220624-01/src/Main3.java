import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
// ***** JRadiobutton *****
// 동그란 버튼
// 버튼중에서 하나만 선택되게 하기.
// 버튼들을 한 그룹으로 묶어주어야 함.
public class Main3 extends JFrame {
	public Main3() {
		JPanel pnl = new JPanel();
		JRadioButton rdb1 = new JRadioButton("라디오1");
		JRadioButton rdb2 = new JRadioButton("라디오2");
		JRadioButton rdb3 = new JRadioButton("라디오3");
		// 라디오 버튼들을 하나의 그룹으로 묶어주는 객체
		// 그룹이라도 선택된 값을 찾는 isSelected()는 
		// 선택된 버튼만 true값이 반환.
		ButtonGroup group = new ButtonGroup();
		group.add(rdb1);
		group.add(rdb2);
		group.add(rdb3);
		
		rdb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange() == ItemEvent.SELECTED);
			}
		});
		
		pnl.add(rdb1);
		pnl.add(rdb2);
		pnl.add(rdb3);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}
