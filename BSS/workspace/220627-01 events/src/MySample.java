import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MySample extends JFrame {
	public MySample() {
		super("음....뭐만들지..");
		JPanel pnlMain = new JPanel();
		BoxLayout box = new BoxLayout(pnlMain, BoxLayout.Y_AXIS);

		pnlMain.setLayout(box);
		JLabel lbl = new JLabel();
		
		
		// 춘식이 이미지 불러오기도구
		Toolkit kit = Toolkit.getDefaultToolkit();
		URL url1 = Main4.class.getClassLoader().getResource("images/춘식3.gif");
		ImageIcon image = new ImageIcon(kit.getImage(url1));
		
		JButton btn = new JButton("나와라 춘식");
		
		pnlMain.add(btn);
		pnlMain.add(lbl);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setIcon(image);
			}
		});
		
		add(pnlMain);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new MySample().setVisible(true);
	}
}
