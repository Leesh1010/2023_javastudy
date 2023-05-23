package day03.com.ict.edu;

public class Test03 {
	public static void main(String[] args) {
		//3989초는 몇시간, 몇분, 몇초인가?
		
		int time = 3989;
		int h = 0;
		int m = 0;
		int s = 0;
		int res = 0;
		
		h = time/(60*60); // 1
		res = time%(60*60); // 389
		
		m = res/60; // 분
		s = res%60; // 초
		
		System.out.println("시간 : " + h);
		System.out.println("분 : " + m);
		System.out.println("초 : " + s);
		
	}

}
