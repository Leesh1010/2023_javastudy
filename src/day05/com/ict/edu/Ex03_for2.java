package day05.com.ict.edu;

public class Ex03_for2 {
	public static void main(String[] args) {
		// 중첩 for문 : for문 안에 또 다른 for문이 존재한다. 
		
		for (int i = 1; i < 4; i++) {
			System.out.println("실행문 -1");
			for (int j = 1; j < 6; j++) {
				System.out.println("i = " + i + ", j =" +j);
			} //안쪽 for문 끝
			System.out.println("실행문 -1");
		}// 바깥 for문 끝
		
		
		// 구구단
		System.out.println("===================");
		for (int i = 2; i < 10; i++) {
			System.out.println(i+"*");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j +"=" + (i*j));
				
			}
		}
		System.out.println("===================");
		for (int i = 1; i < 10; i++) {
			System.out.println(i+""  );
			System.out.println();
			for (int j = 2; j < 10; j++) {
				System.out.print(i+"*"+j+"="+(i*j)+ "  "  );
			}
		}	
		
		// 구구단 - 단을 가로로
		System.out.println("===================");
		for (int i = 1; i < 10; i++) {
			System.out.println(i+"  ");
			System.out.println();
			for (int j = 2; j < 10; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+ "  "  );
			}
			
		}	
		for (int i = 1; i < 10; i++) {
			System.out.println("\n");
			System.out.println();
			for (int j = 2; j < 10; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+ "     "  );
			}
		}
		
		
	}

}
