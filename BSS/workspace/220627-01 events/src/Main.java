import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
	public Main() {
		// MouseListener는 추상메소드를 5개 들고 있다.
		MouseListener listener = new MouseListener() {
			// Released => 마우스를 눌럿다가 '뗄때' 이벤트 발생
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("마우스 버튼을 뗌!");
			}
			
			// Pressed => 마우스를 누르고있을 때 이벤트 발생, 클릭하면 마우스 누르는걸 그만 둔 것으로 인식.
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("마우스 버튼을 누름");
			}
			
			// Exited와 Entered는 html의 hover기능과 유사하다.
			// 마우스를 올리면 Entered, 마우스를 바깥으로 빼면 Exited
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("EXIT!!");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("ENTER!!");
			}
			
			// Clicked => 마우스를 클릭 할 때, 사용자마다 설정에 따라 상이해져서, 일반 클릭은 Released나 Pressed를 주로 이용.
			// 더블클릭을 사용할 때 주로 사용.
			@Override
			public void mouseClicked(MouseEvent e) {
				// getButton() => 마우스 버튼을 인식함. but, OS의 설정마다 버튼의 인식이 다다르다.
				// 강의실 기준 마우스 1번 좌클릭, 2번 휠클릭, 3번 우클릭
				switch (e.getButton()) {
				case MouseEvent.BUTTON1:
					System.out.println("1번");
					break;
				case MouseEvent.BUTTON2:
					System.out.println("2번");
					break;
				case MouseEvent.BUTTON3:
					System.out.println("3번");
				}
				// 마우스 버튼의 입력 위치(왼, 중앙, 오)를 알 수 있는 클래스.
				System.out.println("왼쪽 버튼인가요? " + SwingUtilities.isLeftMouseButton(e));
				
				// getClickCount()로 클릭의 횟수 확인가능
				if (e.getClickCount() >= 2) {
					System.out.println("더블 클릭!!");
				}
			}
		};
		
		MouseMotionListener motion = new MouseMotionListener() {
			// 마우스의 움직임을 인식함.
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("마우스가 움직입니다~" + e.getX() + "," + e.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
			}
		};
		
		JPanel pnl = new JPanel();
//		pnl.addMouseListener(listener);
		pnl.addMouseMotionListener(motion);
		
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
