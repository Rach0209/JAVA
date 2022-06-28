import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.text.Position;
import javax.swing.text.StyledEditorKit.AlignmentAction;

public class frame extends JDialog {
   JLabel lblResult = null;
   private LottoLayout lotto;
   private List list;
   private int times = 5;
   

   public frame (LottoLayout owner) {
     
      super(owner);
      lotto = owner;
Toolkit kit = Toolkit.getDefaultToolkit();
      
      int scale = 35;
      Image one = kit.getImage("노란공.png").getScaledInstance(scale, scale, Image.SCALE_DEFAULT);
      Image two = kit.getImage("blue.png").getScaledInstance(scale, scale, Image.SCALE_DEFAULT);
      Image three    = kit.getImage("red.png").getScaledInstance(scale, scale, Image.SCALE_DEFAULT);
      Image four = kit.getImage("green.png").getScaledInstance(scale, scale, Image.SCALE_DEFAULT);
      Image five   = kit.getImage("white1.png").getScaledInstance(scale, scale, Image.SCALE_DEFAULT);
      Image xx   = kit.getImage("제목 없음.png").getScaledInstance(scale, scale, Image.SCALE_DEFAULT);
      
      JPanel pnlLotto = new JPanel(new BorderLayout(0,30));
      JPanel pnlNorth = new JPanel(); // 구매복권 당첨결과
      JLabel north = new JLabel("< 당첨결과 ƪ(•̃͡ε•̃͡)∫ >");
      JPanel pnlCenter = new JPanel(); // 당첨번호
      JLabel center1 = new JLabel();
      JPanel pnlSouth = new JPanel(); // 구매번호
      
      // 당첨번호 배열 생성
      ArrayList<Integer> luckyNumber = new ArrayList<>();
      for (int i = 0; luckyNumber.size() < 6; i++) {
        
         int number = (int) (Math.random() * 45 + 1);
         if (!luckyNumber.contains(number)) {
                
            luckyNumber.add(number);
            Collections.sort(luckyNumber);
         }
      }
      
      // 당첨번호 공에 넣어서 표시
      for (int i = 0; i<6;i++) {
    	  JLabel center = new JLabel("당첨번호");
    	  center.setText(String.valueOf(luckyNumber.get(i)));
          center.setHorizontalTextPosition(JLabel.CENTER);
         
             if(luckyNumber.get(i) > 0 && luckyNumber.get(i) <= 10) {
              center.setIcon(new ImageIcon(one.getScaledInstance(50, 50, 50)));
             center.setForeground(Color.black);
             center.setFont(new Font("Consolas", Font.LAYOUT_NO_LIMIT_CONTEXT, 23));
            } else if(luckyNumber.get(i) > 10 && luckyNumber.get(i) <= 20) {
               center.setIcon(new ImageIcon(two.getScaledInstance(50, 50, 50)));
               center.setFont(new Font("Consolas", Font.LAYOUT_NO_LIMIT_CONTEXT, 23));
               center.setForeground(Color.black);
            } else if(luckyNumber.get(i) > 20 && luckyNumber.get(i) <= 30 ) {
               center.setIcon(new ImageIcon(three.getScaledInstance(50, 50, 50)));
               center.setFont(new Font("Consolas", Font.LAYOUT_NO_LIMIT_CONTEXT, 23));
               center.setForeground(Color.black);
            } else if(luckyNumber.get(i) > 30 && luckyNumber.get(i) <= 40) {
               center.setIcon(new ImageIcon(four.getScaledInstance(50, 50, 50)));
               center.setFont(new Font("Consolas", Font.LAYOUT_NO_LIMIT_CONTEXT, 23));
               center.setForeground(Color.black);
            } else if (luckyNumber.get(i) > 40 && luckyNumber.get(i) <= 45) {
               center.setIcon(new ImageIcon(five.getScaledInstance(50, 50, 50)));
               center.setFont(new Font("Consolas", Font.LAYOUT_NO_LIMIT_CONTEXT, 23));
               center.setForeground(Color.black);
            }
             pnlCenter.add(center);
      }
      
      // 행운번호 생성 및 표시
      int lucky = -1;
      while (lucky == -1) {
         int num = (int) (Math.random() * 45 + 1);
         if (!luckyNumber.contains(num)) {
            JLabel bonus = new JLabel();
            bonus.setText(String.valueOf(num));
            bonus.setHorizontalTextPosition(JLabel.CENTER);
            
            	//행운번호 공에 넣어서 표시
                if(num > 0 && num <= 10) {
                 bonus.setIcon(new ImageIcon(one.getScaledInstance(50, 50, 50)));
                 bonus.setFont(new Font("Consolas", Font.LAYOUT_NO_LIMIT_CONTEXT, 23));
                bonus.setForeground(Color.black);
               } else if(num > 10 && num <= 20) {
                  bonus.setIcon(new ImageIcon(two.getScaledInstance(50, 50, 50)));
                  bonus.setFont(new Font("Consolas", Font.LAYOUT_NO_LIMIT_CONTEXT, 23));
                  bonus.setForeground(Color.black);
               } else if(num > 20 && num <= 30 ) {
                  bonus.setIcon(new ImageIcon(three.getScaledInstance(50, 50, 50)));
                  bonus.setFont(new Font("Consolas", Font.LAYOUT_NO_LIMIT_CONTEXT, 23));
                  bonus.setForeground(Color.black);
               } else if(num > 30 && num <= 40) {
                  bonus.setIcon(new ImageIcon(four.getScaledInstance(50, 50, 50)));
                  bonus.setFont(new Font("Consolas", Font.LAYOUT_NO_LIMIT_CONTEXT, 23));
                  bonus.setForeground(Color.black);
               } else if (num > 40 && num <= 45) {
                  bonus.setIcon(new ImageIcon(five.getScaledInstance(50, 50, 50)));
                  bonus.setFont(new Font("Consolas", Font.LAYOUT_NO_LIMIT_CONTEXT, 23));
                  bonus.setForeground(Color.black);
               }
            lucky = num;
            JLabel plus = new JLabel("+");
            plus.setFont(new Font("Consolas", Font.CENTER_BASELINE, 30));
            
            pnlCenter.add(plus);
            pnlCenter.add(bonus);
         }
      }

      // 로또 구매 전체 횟수
      for (int i = 0; i < times; i++) {
         JPanel pnlResult = new JPanel(new FlowLayout(FlowLayout.CENTER));
         //JLabel lblResult = null;
         ArrayList<ButtonGroup> bList = lotto.getAllButtonGroup();
         ArrayList<AbstractButton> btnlist = Collections.list(bList.get(i).getElements());
         /*
         0 : 자동
         1 : 수동
         2 : 선택안함
         3 : 반자동
         */
         // 각 로또용지별 값 비교
         for(int j=0;j<btnlist.size();j++) {
            JRadioButton rBtn = (JRadioButton) btnlist.get(j);
            if(rBtn.isSelected()) {
               JLabel lblMode = new JLabel(rBtn.getText());
               pnlResult.add(lblMode);
               lblMode.setFont(new Font("PLAIN", Font.CENTER_BASELINE, 15));
              
               break;
            }
         }
         
         // 선택번호 불러오기
         ArrayList<Integer> list = lotto.getList(i);
         if(list.size() == 6) {
            int grade = 0;
            for(int num : list) {
               lblResult = new JLabel();
               lblResult.setText(String.valueOf(num));
               lblResult.setHorizontalTextPosition(JLabel.CENTER);
               lblResult.setFont(new Font("Consolas", Font.LAYOUT_NO_LIMIT_CONTEXT, 20));
//               lblResult.setFont(new Font("PLAIN", Font.CENTER_BASELINE, 20));


               // lucky : 행운번호, luckyNumber : 당첨번호
               if(luckyNumber.contains(num)) {
                  if(num > 0 && num <= 10) {
                     lblResult.setIcon(new ImageIcon(one));
                     lblResult.setForeground(Color.black);
                 } else if(num > 10 && num <= 20) {
                    lblResult.setIcon(new ImageIcon(two));
                    lblResult.setForeground(Color.black);
                 } else if(num > 20 && num <= 30 ) {
                    lblResult.setIcon(new ImageIcon(three));
                    lblResult.setForeground(Color.black);
                 } else if(num > 30 && num <= 40) {
                    lblResult.setIcon(new ImageIcon(four));
                    lblResult.setForeground(Color.black);
                 } else if (num > 40 && num <= 45) {
                    lblResult.setIcon(new ImageIcon(five));
                    lblResult.setForeground(Color.black);
                 }
                  grade++;
               }
               else if (!luckyNumber.contains(num)) {
                  lblResult.setIcon(new ImageIcon(xx));
               }
               pnlResult.add(lblResult);
            }
            
            // 당첨여부
            JLabel lblGrade = new JLabel();
            switch (grade) {
            case 0:
               lblGrade.setText("낙첨");
               lblGrade.setFont(new Font("PLAIN", Font.CENTER_BASELINE, 15));
               break;
            case 1:
               lblGrade.setText("낙첨");
               lblGrade.setFont(new Font("PLAIN", Font.CENTER_BASELINE, 15));
               break;
            case 2:
               lblGrade.setText("낙첨");
               lblGrade.setFont(new Font("PLAIN", Font.CENTER_BASELINE, 15));
               break;
            case 3:
               lblGrade.setText(" 5등");
               lblGrade.setFont(new Font("PLAIN", Font.CENTER_BASELINE, 15));
               break;
            case 4:
               lblGrade.setText(" 4등");
               lblGrade.setFont(new Font("PLAIN", Font.CENTER_BASELINE, 15));
               break;
            case 5:
               if(list.contains(lucky)) {
                  lblGrade.setText(" 2등");
                  lblGrade.setFont(new Font("PLAIN", Font.CENTER_BASELINE, 15));
               } else {
                  lblGrade.setText(" 3등");
                  lblGrade.setFont(new Font("PLAIN", Font.CENTER_BASELINE, 15));
               }
               break;
            case 6:
               lblGrade.setText(" 1등");
               lblGrade.setFont(new Font("PLAIN", Font.CENTER_BASELINE, 15));
               break;
            }
            pnlResult.add(lblGrade);
            pnlResult.add(center1);
         }
         pnlResult.setBorder(new LineBorder(Color.BLACK));
         pnlResult.setOpaque(true);
         pnlResult.setBackground(Color.WHITE);
         pnlResult.setOpaque(true);
         
         pnlSouth.add(pnlResult);
      }
      
      center1.setFont(new Font("PLAIN", Font.CENTER_BASELINE, 20));
      north.setFont(new Font("PLAIN", Font.PLAIN, 35));
      
      pnlSouth.setLayout(new BoxLayout(pnlSouth, BoxLayout.Y_AXIS));
      pnlSouth.setBorder(new LineBorder(Color.BLACK));

      pnlLotto.add(pnlNorth, "North");
      pnlLotto.add(pnlCenter, "Center");
      pnlLotto.add(pnlSouth, "South");
      pnlLotto.setBackground(Color.white);

      pnlNorth.setOpaque(false);
      pnlCenter.setOpaque(false);
      setContentPane(pnlLotto);
      pnlNorth.add(north);

      pack();
      owner.setVisible(true);
      setSize(500, 480);
      setVisible(true);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      addListeners();
      setResizable(false);
   }

   public void addListeners() {
      addWindowListener(new WindowListener() {
         @Override
         public void windowClosed(WindowEvent e) {
            lotto.setVisible(true);
         }
         @Override
         public void windowOpened(WindowEvent e) {
         }
         @Override
         public void windowIconified(WindowEvent e) {
         }
         @Override
         public void windowDeiconified(WindowEvent e) {
         }
         @Override
         public void windowDeactivated(WindowEvent e) {
         }
         @Override
         public void windowClosing(WindowEvent e) {
         }
         @Override
         public void windowActivated(WindowEvent e) {
         }
      });
   }

   private void addComponents() {
   }
}