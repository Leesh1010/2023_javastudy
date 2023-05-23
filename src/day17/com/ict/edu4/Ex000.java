package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex000 extends JFrame{
	public Ex000() {
		super("회원가입");
		//버튼
		
		JPanel main = new JPanel(new BorderLayout()) ;
		
		JPanel pa = new JPanel(new GridLayout(10,7)); //1
		JLabel name = new JLabel("이름 : ") ;
		JTextField name1 = new JTextField(5);
		JLabel p = new JLabel("생년월일 : ") ;
		JTextField p1 = new JTextField(5);
		JLabel a = new JLabel("주소 : ") ;
		JTextField a1 = new JTextField(20);
		JLabel a0 = new JLabel("부서명 : ") ;
		String[] tim = {"부서"};
		JComboBox<String> aa = new JComboBox<String>(tim);
		JLabel c = new JLabel("취미 : ") ;
		JCheckBox ch = new JCheckBox("운동");
		JCheckBox ch1 = new JCheckBox("영화");
		JCheckBox ch2 = new JCheckBox("독서");
		JCheckBox ch3 = new JCheckBox("컴퓨터");
		
		pa.add(name);
		pa.add(name1);
		pa.add(p);
		pa.add(p1);
		pa.add(a);
		pa.add(a1);
		pa.add(a0);
		pa.add(aa);
		pa.add(c);
		pa.add(ch);
		pa.add(ch1);
		pa.add(ch2);
		pa.add(ch3);
		
		main.add(pa,BorderLayout.NORTH);
		
		
		JPanel jp = new JPanel(); // 1-1		
		
		JLabel jl1 = new JLabel("성별 : ") ;
		JRadioButton m = new JRadioButton("남");
		JRadioButton g = new JRadioButton("여");
		
		jp.add(jl1);
		jp.add(m);
		jp.add(g);
		
		main.add(jp,BorderLayout.CENTER);
		
		
		
		
//		
//		JPanel cc = new JPanel(new GridLayout(2,0));
//		
//		
//		cc.add(aa);
//		cc.add(c);
//		cc.add(ch);
//		cc.add(ch1);
//		cc.add(ch2);
//		cc.add(ch3);
//		
//		main.add(cc,BorderLayout.SOUTH);
		
		
//		pa.add(od,BorderLayout.NORTH);
//		pa.add(jp,BorderLayout.CENTER);
//		pa.add(jp1,BorderLayout.SOUTH) ;
//		
//		jp.add(jr);
//		jp.add(jr1);
//		jp.add(jr2);
//		jp.add(jr3);
//		
//		
//		jp1.add(jl);
//		jp1.add(jtf1);
//		jp1.add(jl1);
//		jp1.add(jtf2);

		JLabel d = new JLabel("자기소개") ;
		JTextArea jta = new JTextArea(); // 텍스트 !!!
		jta.setLineWrap(true); // 줄바꿈!!!!!!
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setEditable(false);
		
		
		//JTextField jtf5 = new JTextField(30);
		
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("저 장");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		

		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		
		//setLayout(new BorderLayout());
		add(main,BorderLayout.WEST);
		add(jp,BorderLayout.CENTER);
		add(jsp ,BorderLayout.SOUTH);
//		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250,ds.height/2-250,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex000();
	}
}

