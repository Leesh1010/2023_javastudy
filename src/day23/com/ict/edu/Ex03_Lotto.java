package day23.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.ImageCapabilities;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex03_Lotto extends JFrame{
	JPanel jp;
	JButton jb;
	Image[] images = new Image[45];
	CanvasTest canvas = new CanvasTest();
	public Ex03_Lotto() {
		super("로또 자동 생성기");
		
		jp = new JPanel();	
		jb = new JButton("번호 생성");
		jp.add(jb);
		add(jp, BorderLayout.EAST);
		add(canvas, BorderLayout.CENTER);
		
		
		setSize(900,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		jb.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				canvas.repaint(); 
			}
		});
	}
	private class CanvasTest extends Canvas{
		public CanvasTest() {
			// 배열에 이미지 넣기 
			for (int i = 0; i < images.length; i++) {
				images[i] = Toolkit.getDefaultToolkit().getImage("src/lotto_img/"+(i+1) +".gif"); // i의 값이 0이라 i+1해서 1:1매칭해주기
				}
		}
		@Override
		public void paint(Graphics g) {
			int[] su = new int[6];
			TreeSet<Integer> set = new TreeSet<>();
			for (int i = 0; i < su.length; i++) {
				int k = (int)(Math.random()*45)+1;
				if(! set.add(k)) {
					i--;
				}
			}
			//System.out.println(set);
			
			int num = 0;
			for (Integer k : set) {
				g.drawImage(images[k-1], num++*120,25,this);
			}
		}
		
	}
	public static void main(String[] args) {
		new Ex03_Lotto();
	}
}
