package day15.com.ict.edu2;

public class Ex04_Dog extends Ex04_abstract {
	// 대부분 반드시 해야 하는 애들을 추상 메서드로 만듬 

	@Override
	public void sound() {
		System.out.println("멍멍");		
	}
	
	@Override
	public void play() {
		System.out.println("바다에서 놀기");
	}

}
