package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;





public class Ex01_C extends JFrame{
	public Ex01_C() {
		super("성적계산");
		
		
		
		JPanel jp = new JPanel(); 		
		JLabel jl1 = new JLabel("이름 : ") ;
		JTextField jtf1 = new JTextField(10);
		
		
		JPanel jp1 = new JPanel();
		JLabel jl2 = new JLabel("국어 : ") ;
		JTextField jtf2 = new JTextField(10);
		JLabel jl3 = new JLabel("영어 : ") ;
		JTextField jtf3 = new JTextField(10);
		JLabel jl4 = new JLabel("수학 : ") ;
		JTextField jtf4 = new JTextField(10);
		
		JPanel pa = new JPanel(new BorderLayout());
		pa.add(jp,BorderLayout.NORTH);
		pa.add(jp1,BorderLayout.CENTER);
		 
		jp.add(jl1,jp1);
		jp.add(jtf1,jp1);
		
		jp1.add(jl2);
		jp1.add(jtf2);
		jp1.add(jl3);
		jp1.add(jtf3);
		jp1.add(jl4);
		jp1.add(jtf4);
		
		
		
		
		JTextArea jta = new JTextArea(); // 텍스트 !!!
		jta.setLineWrap(true); // 줄바꿈!!!!!!
//		JScrollPane jsp = new JScrollPane(jta,
//				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
//				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setEditable(false);
		
		
		
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		

		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		
	
		add(pa,BorderLayout.NORTH);
		add(jta,BorderLayout.CENTER);
		add(sp,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250,ds.height/2-250,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex01_C();
	}
}