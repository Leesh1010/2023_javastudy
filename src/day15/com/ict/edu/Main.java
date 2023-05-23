package day15.com.ict.edu;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		
		System.out.println(cat.eyes); 
		System.out.println(cat.color); //부모와 자식의 메서드가 같으면 불러온 객체의 값이 실행됨
		
		cat.sound();
		cat.hobby();
		cat.sleep();
		cat.play();
	}
}
