package day17.com.ict.edu4;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex01_B extends JFrame {
	public Ex01_B() {
		super("계산기");
		
		JPanel aa = new JPanel();
		
		JTextField jtf = new JTextField(25);
		
		
		
		aa.add(jtf);
		
		
		
		JPanel sp = new JPanel(new GridLayout(5, 3,5,5));
		
		
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jb10 = new JButton("0");
		JButton jb11 = new JButton("+");
		JButton jb12 = new JButton("-");
		JButton jb13 = new JButton("*");
		JButton jb14 = new JButton("/");
		JButton jb15 = new JButton("=");
		
	
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		sp.add(jb4);
		sp.add(jb5);
		sp.add(jb6);
		sp.add(jb7);
		sp.add(jb8);
		sp.add(jb9);
		sp.add(jb10);
		sp.add(jb11);
		sp.add(jb12);
		sp.add(jb13);
		sp.add(jb14);
		sp.add(jb15);
		
		
		
		
		add(aa,BorderLayout.NORTH);
		add(sp);
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150,ds.height/2-150,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex01_B();
	}
}
