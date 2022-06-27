import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// runnable jar로 만들시, resourse(자원)파일들을 같은 폴더 위치에 넣어줘야 작동한다.
public class Main4 extends JFrame {
	public Main4() {
		JPanel pnl = new JPanel();
		// 이미지를 넣기 위해 '도구' 들고오기
		Toolkit kit = Toolkit.getDefaultToolkit();
		
		// 자원을 찾는 방법 (How to Find Resource files);
		// 자원관리 효율을 위해 따로 관리.
		// resource 폴더가 있을 경우 resource폴더를 기준으로 찾는다.
		// 자원이 있는 위치. URL로 불러오기.
		// 클래스를 기준으로 class path 에서 자원을 찾아온다.
		// ' / '(슬러시)를 써주면 폴더의 경로를 표기할 수 있다.
		// Main4.class => this.getClass()
		URL url1 = Main4.class.getClassLoader().getResource("images/춘식6.gif");
		ImageIcon image = new ImageIcon(kit.getImage(url1));
		URL url2 = Main4.class.getClassLoader().getResource("images/춘식6.png");
		ImageIcon image2 = new ImageIcon(kit.getImage(url2));
		
		//	Image image = kit.getImage("춘식6.gif"); // 반환 타입이 Image이다.
		//	Image image2 = kit.getImage("춘식6.png"); // ()파라미터안에는 프로젝트파일안에 잇는 이미지파일 이름그대로, 확장자까지
		
		JLabel lbl = new JLabel(image);
		pnl.add(lbl);
		
		lbl.addMouseListener(new MouseAdapter() {
			// 클릭하면 다른 이미지로 바뀌게 함.
			@Override
			public void mousePressed(MouseEvent e) {
				lbl.setIcon(image2);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
		});
		
		add(pnl);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}

}
