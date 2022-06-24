import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
// JCheckBox 체크박스 ;
// 추상적인 Button을 상속받는 클래스
public class Main extends JFrame {
	public Main() {
		JPanel pnl = new JPanel();
		JCheckBox check1 = new JCheckBox("첫번째");
		JCheckBox check2 = new JCheckBox("두번째");
		JCheckBox check3 = new JCheckBox("세번째");
		
//		check1.setSelected(true);
//		System.out.println(check2.isSelected()); // boolean 값으로 선택이 되었는지 안되었는지 반환값을 줌
		
		// checkbox도 버튼 => ActionListener 사용가능.
//		check1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("사용자가 체크박스를 눌렀음!");
//				System.out.println(check1.isSelected());
//			}
//		});
		// ******************** ItmeListener ************************
		// 체크박스의 체크유무 => 버튼 처럼 상태이다
		// ItemListener로 상태변경 되었을 때 이벤트 생성
		check1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int result = e.getStateChange(); // boolean값이 아닌 int값으로 반환해줌 // 선택되면 1 아니면 2 반환
				System.out.println(result == ItemEvent.SELECTED); // 상수로 정의되어 있다.
			}
		});
		
		pnl.add(check1);
		pnl.add(check2);
		pnl.add(check3);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
