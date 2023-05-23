package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Ex10_Main extends JFrame{
	public Ex10_Main() {
		super("JTab_2");
		
		JTabbedPane jtab = new JTabbedPane() ;
		//JPanel을 상속한 클래스 객체로 만들기
		Ex10_Blue blue = new Ex10_Blue();
		Ex10_Cyan cyan = new Ex10_Cyan();
		Ex10_Green green = new Ex10_Green();
		
		// JPanel들을 탭에 넣기 
		jtab.addTab("블루 탭<",blue);
		jtab.addTab("시안 탭<",cyan);
		jtab.addTab("그린 탭<",green);
	
	
		add(jtab);
	
	Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
	setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ex10_Main();
	
		
		
		
		
		
		
		
		
		
	}
}
