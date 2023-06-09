package day22.com.ict.edu;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Ex05_Canvas extends Canvas{
	int x = 50;
	int y = 50;
	int wh = 30;
	
	@Override
	public void paint (Graphics g) {
		int r1 = (int)(Math.random()*256);
		int g1 = (int)(Math.random()*256);
		int b1 = (int)(Math.random()*256);
		
		
		g.setColor(new Color(r1,g1,b1));
		g.fillOval(x-wh/2, y-wh/2, wh, wh); // 마우스 포인트가 원의 중앙에 찍히게 하기 위해 x,y축에 넓이와 높이를 -/2 만큼 헤준다.
		
		
		
	}
	
	// 기존 내용을 그대로 남겨두고 추가하자
	@Override
	public void update(Graphics g) {
		paint(g);
	}
}
