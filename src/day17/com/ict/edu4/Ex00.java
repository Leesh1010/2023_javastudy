package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex00 extends JFrame{
	public Ex00() {
	super("카페주문");
	//버튼
	
	JPanel pa = new JPanel(new BorderLayout()); //1
	
	
	JLabel  od = new JLabel("원하는 음료를 선택하세요");
	
	JPanel jp = new JPanel(); // 1-1		
	JRadioButton jr = new JRadioButton("아메리카노(3000)");
	JRadioButton jr1 = new JRadioButton("카페모카(4000)");
	JRadioButton jr2 = new JRadioButton("카페라떼(3500)");
	JRadioButton jr3 = new JRadioButton("과일쥬스(3000)");

	ButtonGroup gg = new ButtonGroup();
	gg.add(jr);
	gg.add(jr1);
	gg.add(jr2);
	gg.add(jr3);
	
	JPanel jp1 = new JPanel(); //1-2
	JLabel jl = new JLabel("수량 : ") ;
	JTextField jtf1 = new JTextField(5);
	JLabel jl1 = new JLabel("입금액 : ") ;
	JTextField jtf2 = new JTextField(5);
	
	pa.add(od,BorderLayout.NORTH);
	pa.add(jp,BorderLayout.CENTER);
	pa.add(jp1,BorderLayout.SOUTH) ;
	
	jp.add(jr);
	jp.add(jr1);
	jp.add(jr2);
	jp.add(jr3);
	
	
	jp1.add(jl);
	jp1.add(jtf1);
	jp1.add(jl1);
	jp1.add(jtf2);

	
	JTextArea jta = new JTextArea(); // 텍스트 !!!
	jta.setLineWrap(true); // 줄바꿈!!!!!!
//	JScrollPane jsp = new JScrollPane(jta,
//			ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
//			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	jta.setEditable(false);
	
	
	//JTextField jtf5 = new JTextField(30);
	
	JPanel sp = new JPanel();
	JButton jb1 = new JButton("계 산");
	JButton jb2 = new JButton("종 료");
	JButton jb3 = new JButton("취 소");
	

	sp.add(jb1);
	sp.add(jb2);
	sp.add(jb3);
	
	
	//setLayout(new BorderLayout());
	add(pa,BorderLayout.NORTH);
	add(jta,BorderLayout.CENTER);
	add(sp,BorderLayout.SOUTH);
	
	Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
	setBounds(ds.width/2-250,ds.height/2-250,500,500);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
}
public static void main(String[] args) {
	new Ex00();
}
}