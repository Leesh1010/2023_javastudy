package day15.com.ict.edu2;

import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		

		while(true) {
			System.out.println("선택하세요 >> 1.고양이, 2.강아지");
		int su = scan.nextInt();
		
		// 다형성의 정적바인딩
		/*
		switch (su) {
		case 1:
			Ex04_Cat cat = new Ex04_Cat();
			cat.sound();
			cat.play();
			break;
		case 2:
			Ex04_Dog dog = new Ex04_Dog();
			dog.sound();
			dog.play();
			break;
		}
		*/
		
		// 다형성의 동적바인딩 = 선택 되는 순간 그때 그때 실시간으로 변하는 것
		//부모 클래스를 선언했으므로 자식 클래스만 가진 메서드는 사용못함
		
		Ex04_abstract animal = null;
		switch (su) {
		case 1: animal = new Ex04_Cat();break;
		case 2: animal = new Ex04_Dog();break;	
			
		}
		animal.sound();
		animal.play();
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
