package day15.com.ict.edu5;

import javax.swing.JFrame;

public class Ex01_Swing {
	public static void main(String[] args) {
		JFrame jframe = new JFrame("Swing으로 만든 창");
		
		/*
		 JFrame jframe = new JFrame();
		 jframe.seTitle("Swing으로 만든 창 ");
		 */
		
		//창크기
		jframe.setSize(600,600);
		//창위치
		jframe.setLocation(0,0);
		//표시여부
		jframe.setVisible(true);
	}
}
