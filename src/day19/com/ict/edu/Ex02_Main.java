package day19.com.ict.edu;

public class Ex02_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		
		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();
		
		// 멀티스레드 :여러개의 스레드를 만들어서 벙렬 처리
		// 스레드 만드는 방법 : Start()를 호출해서 run()으로 가면 스레드 생성 (일꾼 생성)
		dog.start(); // 자식인 dog가 부모인 Thread를 상속 받음으로써 Thread에 포함 되어 읶는 start를 생성 할 수 있음 
		cat.start(); // 생성된 start가 dog에 없으면 자동으로 run을 찾아서 실행함 자식한테 start를 생성하면 안됨 
		
		System.out.println("main : " + Thread.currentThread().getName());
	}
}
