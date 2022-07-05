package main;
// 입력조건;

// 가입 연도/월, 월 납부금액, 만기일
// 현재까지 납부 금액, @@회차 개월 수(가입월 부터1회차), 만기까지 남은 개월 수, 총 납부 금액중 남은 금액/ 총 납부 금액

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Main extends JFrame {
	Main() {
		super("보험료 납입계산기");
		// 기본 패널, + 기본패널 양쪽 두개. L : 입력창, R : 결과창
		JPanel pnl = new JPanel();
		JPanel pnlLeft = new JPanel();
		JPanel pnlRight = new JPanel();
		JPanel pnlbtn = new JPanel();
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.X_AXIS));

		pnl.add(pnlLeft);
		pnl.add(pnlbtn);
		pnl.add(pnlRight);
		// 계산 버튼
		pnlbtn.setLayout(new BorderLayout(0, 0));
		JButton btnconvert = new JButton("계산하기");
		pnlbtn.add(btnconvert);
		// ********************** 계산 정보 입력란 ***********************
		// 계약일 (년,월); 시작점
		JLabel lblToday = new JLabel("현재 년도,월 (yyyy-mm-dd형식 ex)2022-06-03)");
		lblToday.setFont(new Font("굴림", Font.BOLD, 20));

		JTextField tfToday = new JTextField(10);
		tfToday.setFont(new Font("굴림", Font.BOLD, 16));
		tfToday.setHorizontalAlignment(SwingConstants.RIGHT);

		JLabel lblDay = new JLabel("계약일 (yyyy-mm-dd형식 ex)2022-mm-dd)");
		lblDay.setFont(new Font("굴림", Font.BOLD, 20));

		JTextField tfDay = new JTextField(10);
		tfDay.setFont(new Font("굴림", Font.BOLD, 16));
		tfDay.setHorizontalAlignment(SwingConstants.RIGHT);
		// 월 납입 보험료
		JLabel lblPayment = new JLabel("월 납입 보험료 (숫자만)");
		lblPayment.setFont(new Font("굴림", Font.BOLD, 20));

		JTextField tfPayment = new JTextField(10);
		tfPayment.setFont(new Font("굴림", Font.BOLD, 16));
		tfPayment.setHorizontalAlignment(SwingConstants.RIGHT);
		// 보험 납입 기간 (총 개월수)
		JLabel lblPeriod = new JLabel("보험료 납입 기간 (개월수)");
		lblPeriod.setFont(new Font("굴림", Font.BOLD, 20));

		JTextField tfPeriod = new JTextField(10);
		tfPeriod.setFont(new Font("굴림", Font.BOLD, 16));
		tfPeriod.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlLeft.setLayout(new BoxLayout(pnlLeft, BoxLayout.Y_AXIS));
		pnlRight.setLayout(new BoxLayout(pnlRight, BoxLayout.Y_AXIS));

		pnlLeft.add(lblToday);
		pnlLeft.add(tfToday);
		pnlLeft.add(lblDay);
		pnlLeft.add(tfDay);
		pnlLeft.add(lblPayment);
		pnlLeft.add(tfPayment);
		pnlLeft.add(lblPeriod);
		pnlLeft.add(tfPeriod);

		// 오른쪽 결과창 화면
		JLabel lblExpDate = new JLabel("계약 만료일");
		lblExpDate.setFont(new Font("굴림", Font.BOLD, 20));

		JTextField tfExpDate = new JTextField(10);
		tfExpDate.setFont(new Font("굴림", Font.BOLD, 16));
		tfExpDate.setHorizontalAlignment(SwingConstants.RIGHT);

		JLabel lblDayResult = new JLabel("현재 납입한 개월 수");
		lblDayResult.setFont(new Font("굴림", Font.BOLD, 20));

		JTextField tfDayResult = new JTextField(10);
		tfDayResult.setHorizontalAlignment(SwingConstants.RIGHT);
		tfDayResult.setFont(new Font("굴림", Font.BOLD, 16));

		JLabel lblPaymentResult = new JLabel("현재 납입한 보험료");
		lblPaymentResult.setFont(new Font("굴림", Font.BOLD, 20));

		JTextField tfPaymentResult = new JTextField(10);
		tfPaymentResult.setHorizontalAlignment(SwingConstants.RIGHT);
		tfPaymentResult.setFont(new Font("굴림", Font.BOLD, 16));

		JLabel lblDayLeft = new JLabel("남은 개월 수");
		lblDayLeft.setFont(new Font("굴림", Font.BOLD, 20));

		JTextField tfDayLeft = new JTextField(10);
		tfDayLeft.setFont(new Font("굴림", Font.BOLD, 16));
		tfDayLeft.setHorizontalAlignment(SwingConstants.RIGHT);

		JLabel lblPayLeftTotal = new JLabel("남은 보험료 총액");
		lblPayLeftTotal.setFont(new Font("굴림", Font.BOLD, 20));

		JTextField tfPayLeftTotal = new JTextField(10);
		tfPayLeftTotal.setFont(new Font("굴림", Font.BOLD, 16));
		tfPayLeftTotal.setHorizontalAlignment(SwingConstants.RIGHT);

		pnlRight.add(lblExpDate);
		pnlRight.add(tfExpDate);
		pnlRight.add(lblDayResult);
		pnlRight.add(tfDayResult);
		pnlRight.add(lblPaymentResult);
		pnlRight.add(tfPaymentResult);
		pnlRight.add(lblDayLeft);
		pnlRight.add(tfDayLeft);
		pnlRight.add(lblPayLeftTotal);
		pnlRight.add(tfPayLeftTotal);

		// -------------------------------- 계산식 ---------------------------------------------

		btnconvert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
				// 현재날짜
				String todayStr = tfToday.getText();
				LocalDate today = LocalDate.parse(todayStr, formatter);
//				System.out.println(today);

				String dateStr = tfDay.getText(); // 가입 년월
				LocalDate startday = LocalDate.parse(dateStr, formatter);
				// startday => 계약일.
//				System.out.println(startday);
				// 총 계약 개월 수
				int period = Integer.valueOf(tfPeriod.getText());
				// 계약 만료일 계약일 + 총 개월수
				LocalDate expDate = startday.plusMonths(period).minusDays(1);
				String expDateStr = expDate.format(formatter2);
//				System.out.println(expDate);
				// 만료일완성
				tfExpDate.setText(expDateStr);
				// 납입 개월수
				int payMonth = (int) startday.until(today, ChronoUnit.MONTHS) + 1;
//				int month = today.getMonthValue() - startday.getMonthValue();
				tfDayResult.setText(String.valueOf(payMonth));
//				System.out.println(payMonth);

				// 현재 납입한 보험료
				int payment = Integer.valueOf(tfPayment.getText());
				int paymentResult = payment * payMonth;
				tfPaymentResult.setText(String.valueOf(paymentResult));
//				System.out.println(paymentResult);

				// 남은 개월 수
				int exp = (int) today.until(expDate, ChronoUnit.MONTHS);
				tfDayLeft.setText(String.valueOf(exp));
//				System.out.println();
//				System.out.println(exp);
				// 남은 보험료 총액
				int leftPayment = payment * exp;
				tfPayLeftTotal.setText(String.valueOf(leftPayment));
//				System.out.println(leftPayment);
			}
		});

		getContentPane().add(pnl);

		pack();
//		setSize(700, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);

	}
}
