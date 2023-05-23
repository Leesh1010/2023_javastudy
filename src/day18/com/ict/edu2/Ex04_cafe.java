package day18.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex04_cafe extends JFrame{
	public Ex04_cafe() {
		super("카페 주문");
		
		JPanel jp1 = new JPanel();
		jp1.add(new JLabel("원하는 음료 선택하세요"));
		
		JPanel jp2 = new JPanel();
		JRadioButton jrb1 = new JRadioButton("아메리카노(3000)");
		JRadioButton jrb2 = new JRadioButton("카페모카(4000)");
		JRadioButton jrb3 = new JRadioButton("카페라떼(3500)");
		JRadioButton jrb4 = new JRadioButton("과일쥬스(3000)");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);

		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);
		jp2.add(jrb4);
		
		
		JPanel jp3 = new JPanel();
		JTextField su = new JTextField(10);
		JTextField input = new JTextField(10);
		
		jp3.add(new JLabel("수량 : "));
		jp3.add(su);
		jp3.add(new JLabel("입금액 : "));
		jp3.add(input);
		
		JTextArea jta = new JTextArea(20,0); // 아래서 pack 사용 시 괄호에 크기 지정해줘야함 
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		
		JPanel jp4 = new JPanel();
		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		
		jp4.add(jb1);
		jp4.add(jb2);
		jp4.add(jb3);
		
		
		
		
		// 방향 나눌 패널 만들기
		JPanel pg1 = new JPanel();
		JPanel pg2 = new JPanel();
		pg1.setLayout(new BorderLayout());
		pg2.setLayout(new BorderLayout());
		
		// 방향 나눌 패널에 각각 넣어주기
		pg1.add(jp1, BorderLayout.NORTH);
		pg1.add(jp2, BorderLayout.CENTER);
		
		pg2.add(jp3, BorderLayout.NORTH);
		pg2.add(jsp, BorderLayout.CENTER);
		pg2.add(jp4, BorderLayout.SOUTH);
		
		
		
		add(pg1, BorderLayout.NORTH);
		add(pg2, BorderLayout.CENTER);
		
		
		
		
		
		pack(); //창 크기를 컴포넌트 크기에 맞춰서 
//		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
//		setBounds(ds.width/2-250,ds.height/2-250,500,500);
		setLocationRelativeTo(null); //화면 중간으로 맞춰줌
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		new Ex04_cafe();
	}
}
