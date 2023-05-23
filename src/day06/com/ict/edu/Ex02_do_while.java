package day06.com.ict.edu;

public class Ex02_do_while {
	public static void main(String[] args) {
	
		/*
		  do ~ while문 : while문과 같은 반복문
		  				단, 먼저 실행 후 조건식이 붙는다.
		  				
		  형식 )
		   		초기식;
		   		do{
		   			실행문;
		   			증감식;
		   			} while (조건식);
		 */
		
		//0부터 10까지 출력
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i<11);
		
		System.out.println("=============");
		
		// 0-10까지 홀수 출력
			
		i = 1;
		do {
			System.out.println( i + "" );
			
			i=i+2;
		} while (i<11);
		
		
		
		// 풀이
		i = 0;
		do {
			if (i%2 ==1) {
				System.out.println("i = " +i );
			}
			i++;
		} while (i<11);
		        
		
		System.out.println("=============");
		//7단출력
		
		i=1;
		do {
			
			System.out.println("7*" + i + "=" +(7*i));
			i++;
		} while (i<10);
		
		System.out.println("=============");
		
		// 0-10까지 홀수 누적합
		int odd = 0;
	
		i= 1;
		do {
			if (i%2 ==1) {
				odd = odd + i;
				
			}
			
			i++;
		} while (i <11);
		System.out.println("i = " +odd);
		
		// 풀이 
		i=0;
		int sum = 0; // 이전정보 기억
		do {
			if (i%2==1) {
				sum = sum + i;
				
			}
			i++;
		} while (i<11);
		  System.out.println("결과 : "  + sum);
	

	}
}
