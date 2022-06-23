import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
// Frame 은 주로 사용하고 있는 main 창.
// 부가적인 창 => Dialog

public class Main7 extends JFrame {
	public Main7() {
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();
		JPanel pnlBox = new JPanel();
		
		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);
		
		// JTextField 텍스트를 입력할 수 있는 공간 제공
		JTextField tf1 = new JTextField(30); // () 기본생성자 // (int값) = 가로길이
		JTextField tf2 = new JTextField(30);
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		
		// 버튼 누르면 사용자 입력값 출력 액션리스너
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(tf1.getText()); // 사용자가 입력한 텍스트값 참조
				String text = tf1.getText(); // getter / setter
				tf2.setText(text);
				JOptionPane.showMessageDialog(Main7.this, text);
				// () 파라미터 좌측은 컴포넌트의 참조값 근처에 Dialog가 위치함, 우측은 원하는 출력값
				// null 값일 때, Dialog는 중앙에 나타난다. // 메소드 바깥의 참조를 하기 때문에 Main7.this라고 적어줬다.
			}
		});
		
		
		
		// Component 추가
		pnlTop.add(tf1);
		pnlTop.add(btn1);
		pnlBottom.add(tf2);
		pnlBottom.add(btn2);
		
		add(pnlBox);
		
		// ********** pack Method ***********
		// 사이즈를 결정 할 수 있는 메소드.
		// 창을 내부의 크기에 맞춰서 조절해준다.
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main7().setVisible(true);
	}
}
