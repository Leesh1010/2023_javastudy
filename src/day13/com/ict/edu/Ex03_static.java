package day13.com.ict.edu;

public class Ex03_static {
	// static 초기화
	//static (
	//	초기화 내용
	//}
	
	int s1 = 100;
	private int p1 = 100;
	static int s2 ;
	
	public static int k1 = 100;
	static int k2 = 100; //접근제한자가 없으면 생략(디폴트) / 같은 패키지에 있는 애들끼리만 허용
	private static int k3 = 100;
	
	
	//생성자 : 인스턴스 초기화가 목적
	public Ex03_static() {
		s1 = 200;
		s2 = 400;
		s3 = 500;
	}
	
	static { // static 초기화 @@ 위에서 선언한 값은 변경 되지만, 아래에서 선언한 값은 안바뀜
		m1 = 1000;
		m2 = 1000;
		s2 = 1000;
		k2 = 1000;
	}
	
	
	
	int s3 ;
	static int m1 ;
	static int m2 = 500;
	
	
	
	

	
}
