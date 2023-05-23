package day18.com.ict.edu2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex11 extends JFrame{
	JPanel jp1,jp2,jp3,jp4;
	JTextField name,kor,eng,math;
	JButton jb1,jb2,jb3;
	public Ex11()  {
		super("성적");
		
		jp1 = new JPanel();
		name = new JTextField(10);
		
		jp1.add(new JLabel("이름 : "));
		jp1.add(name);
		
		jp2 = new JPanel();
		kor = new JTextField(10);
		eng = new JTextField(10);
		math = new JTextField(10);
		
		jp2.add(new JLabel("국어 : "));
		jp2.add(kor);
		jp2.add(new JLabel("영어 : "));
		jp2.add(eng);
		jp2.add(new JLabel("수학 : "));
		jp2.add(math);
		
		JTextArea jta = new JTextArea(30,10); // 아래서 pack 사용 시 괄호에 크기 지정해줘야함 
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		 jp3 = new JPanel();
		 jb1 = new JButton("계 산");
		 jb2 = new JButton("종 료");
		 jb3 = new JButton("취 소");
		
		 jp3.add(jb1);
		 jp3.add(jb2);
		 jp3.add(jb3);
		
		jp4 = new JPanel();
		jp4.setLayout(new BorderLayout());
		jp4.add(jp2, BorderLayout.NORTH);
		jp4.add(jsp, BorderLayout.CENTER);
		jp4.add(jp3, BorderLayout.SOUTH);
		
		add(jp1, BorderLayout.NORTH);
		add(jp4, BorderLayout.CENTER);
			
			
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ex11();
	}
}
