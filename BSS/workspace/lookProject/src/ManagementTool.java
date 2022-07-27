import java.awt.dnd.MouseDragGestureRecognizer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class ManagementTool {
	public int registBtn(JButton btn) {
		int result = 1;
		ActionListener regist = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ManagementOfRegist m = new ManagementOfRegist();
				m.setVisible(true);
			}
		};
		return result;
	}
	
	
	public static void main(String[] args) {
		Management m = new Management();
		m.setVisible(true);
		
//		registBtn(JButton )
	}
}
