import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;
// JDialog
class SubWindow extends JDialog {
	private JTextField tf;

	public SubWindow(JFrame owner) {
		super(owner, true);
		// 생성자에 바로 타이틀 적어도됨
		setTitle("부가 창");
		
		tf = new JTextField();
		add(tf, "North");
		
		// 창이 활성되었을 때, 다른 창과 상호작용이 불가능 하게끔 해줌.
		// 창의 활성화가 종료되어야 다른 창과 상호작용 가능.
//		setModal(true); // 생성자에 true로 바로 적용
		
		JButton btn = new JButton("다른 버튼");
		add(btn);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		setSize(500, 500);
		// DISPOSE_ON_CLOSE : 기본값.
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public String showDialog() {
		// 활성화 되었을 때, 텍스트필드의 스트링값을 반환해주는 메소드.
		setVisible(true);
		
		return tf.getText();
	}
}

public class Main extends JFrame {
	public Main() {
		super("주요 창");
		
		JButton btn = new JButton("버튼");
		add(btn);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 그냥 this만 적으면 ActionListener의 참조이기 때문에 Main.을 적어줌
				// modal을 true값 => 프로그램이 멈춘것 처럼 보임 => 멈춘 것은 아님
				// 흐름이 잠시 막힌 것처럼 보이는 것. 서브 창이 dispose 되면 다음 문장으로 흐름
				SubWindow dialog = new SubWindow(Main.this);
				String result = dialog.showDialog();
				
				// 다른 창이 꺼졌을 때 호출.
				System.out.println("이 문장은 언제 호출될까?");
				
				btn.setText(result);
			} 
		});
		
		// ************************메모 ***********************
		// swing은 일꾼이 하나다.
		// queue에 작업이 하나씩 오른쪽으로 쌓이고, 왼쪽부터 차례되로 루프되면서 작업을 처리함.
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
