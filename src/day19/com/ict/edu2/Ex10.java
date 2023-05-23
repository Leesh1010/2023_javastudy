package day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

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

public class Ex10 extends JFrame implements ActionListener,ItemListener{
	//계산식 넣기 
	JPanel jp,jp2 ;
	JTextField jtf1,jtf2 ; 
	JRadioButton jrb1 ,jrb2,jrb3,jrb4;
	JTextArea jta;
	JButton jb1,jb2,jb3;
	ButtonGroup jb ;

	
	
	public Ex10() {
		super("계산기");
		jp = new JPanel();
		jrb1 = new JRadioButton(" + ");
		jrb2 = new JRadioButton(" - ");
		jrb3 = new JRadioButton(" * ");
		jrb4 = new JRadioButton(" / ");
		
		jb = new ButtonGroup();
		jb.add(jrb1);
		jb.add(jrb2);
		jb.add(jrb3);
		jb.add(jrb4);
		
		jtf1 = new JTextField(10) ;
		jtf2 = new JTextField(10) ;
		
		jp.add(new JLabel("수1 : "));
		jp.add(jtf1);
		jp.add(new JLabel("수2 : "));
		jp.add(jtf2);
		jp.add(new JLabel("연산자 : "));
		jp.add(jrb1);
		jp.add(jrb2);
		jp.add(jrb3);
		jp.add(jrb4);
		
		jta = new JTextArea(10,10);
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
		
		jp2 = new JPanel();
		jb1 = new JButton("계산");
		jb2 = new JButton("종료");
		jb3 = new JButton("초기화");
		
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		
		add(jp,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		add(jp2,BorderLayout.SOUTH);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		jrb1.addItemListener(this);
		jrb2.addItemListener(this);
		jrb3.addItemListener(this);
		jrb4.addItemListener(this);
		
		jb2.addActionListener(this);
		jb3.addActionListener(this);
	}
		
		@Override
		public void itemStateChanged(ItemEvent e) {
		JRadioButton obj = (JRadioButton)e.getSource();
		if(e.getStateChange() == e.SELECTED) { //선택 된 것만 글자로 출력되게 
			jta.append(obj.getText() + "선택\n");
		}
			
		}
		
		//버튼처리 
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton obj = (JButton)e.getSource();
			if(obj == jb2) {
				System.exit(0);
			}else if (obj == jb3) {
				jb.clearSelection(); // 버튼 그룹에서 선택 된 것 다 지워라
				jta.setText("");
			}
	}
	public static void main(String[] args) {
		new Ex10();
	}
}
