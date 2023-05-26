package day23.com.ict.edu;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Ex01_canvas extends Canvas{
	Image image;
	int x = 200;
	
	@Override
	public void paint(Graphics g) {
		image = Toolkit.getDefaultToolkit().getImage("src/images/java1.png");
		g.drawImage(image, x, getHeight()-100, 100,100,this);
	}
}
