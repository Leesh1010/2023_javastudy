package day06.com.ict.edu;

public class Ex01_while2 {
	public static void main(String[] args) {
		//구구단=1
		int i = 2; 
		while (i<10) { 
			int j = 1;
			while (j<10) {
				System.out.println(i + "*" + j + "=" + (i*j));
				j++;
			}
			i++; 
		}
		System.out.println("============================");
		
		//구구단 - 2
		i = 2; 
		while (i<10) { 
			int j = 1;
			while (j<10) {
				System.out.print(i + "*" + j + "=" + (i*j)+ " "); // ln 지우고 ("띄어쓰기") 가로 실행
				j++;
			}
			System.out.println(); // 줄띄움
			i++; 
		}
		System.out.println("============================");
		
		// 구구단 -3 i와 j 값 변경 
		i=1;
		while (i<10) { 
			int j = 2;
			while (j<10) {
				System.out.print(j + "*" + i + "=" + (j*i)+ " "); //곱하기 순서 변경
				j++;
			}
			System.out.println(); // 위의 실행이 끝나면 줄바꿔라~
			i++; 
		}
	}
}
