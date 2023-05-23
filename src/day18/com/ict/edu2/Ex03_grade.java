package day18.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex03_grade extends JFrame{
	public Ex03_grade() {
		super("성적계산");
		
		
		JPanel jp1 = new JPanel();
		JTextField name = new JTextField(10);
		jp1.add(new JLabel("이름 : "));
		jp1.add(name);
		
		
		JPanel jp2 = new JPanel();
	    JTextField kor = new JTextField(10);
		JTextField eng = new JTextField(10);
		JTextField math = new JTextField(10);
		jp2.add(new JLabel("국어 : "));
		jp2.add(kor);
		jp2.add(new JLabel("영어 : "));
		jp2.add(eng);
		jp2.add(new JLabel("수학 : "));
		jp2.add(math);
		
		
		JTextArea jta = new JTextArea(); // 아래서 pack 사용 시 괄호에 크기 지정해줘야함 
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		
		JPanel jp3 = new JPanel();
		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		
		jp3.add(jb1);
		jp3.add(jb2);
		jp3.add(jb3);
		
		
		//상.중.하 나눠줄 패널 만들기 ~
		JPanel jp4 = new JPanel();
		jp4.setLayout(new BorderLayout());
		jp4.add(jp2, BorderLayout.NORTH);
		jp4.add(jsp, BorderLayout.CENTER);
		jp4.add(jp3, BorderLayout.SOUTH);
		
		
		
		
		add(jp1, BorderLayout.NORTH);
		add(jp4, BorderLayout.CENTER);
		
		
		
		
		
		//pack(); //창 크기를 컴포넌트 크기에 맞춰서 
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250,ds.height/2-250,500,500);
		setLocationRelativeTo(null); //화면 중간으로 맞춰줌
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex03_grade();
	}
}
