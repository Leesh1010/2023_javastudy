package day19.com.ict.edu;

import javax.swing.plaf.metal.MetalBorders.TableHeaderBorder;

public class Ex03_Dog implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("멍~~멍~~" + Thread.currentThread().getName());
		}
		
	}

}
