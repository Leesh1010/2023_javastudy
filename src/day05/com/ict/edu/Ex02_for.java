package day05.com.ict.edu;

public class Ex02_for {
	public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라서 실행문을 반복 처리한다. 
		// 형식 ) for(초기식; 조건식; 증감식){
		// 			조건식이 참일때 실행할 문장;
		// 			조건식이 참일때 실행할 문장;
		// 			조건식이 참일때 실행할 문장;
		// 			}
		// ** for문를 만나면 무조건 초기식으로 이동
		// 	  초기식은 조건식으로 이동
		//    조건식이 참이면 for문 실행, 거짓이면 for문을 실행하지 않는다.
		//    for문의 끝을 만나면 무조건 증감식으로 간다. 
		
		// {}에서 만들어진 변수는 {}밖을 벗어나면 사라진다.(사용불가)
		
		// 안녕하세요를 10번 출력하기
	   for (int i = 1; i < 11; i++) {
		   System.out.println(i+"= 안녕하세요");
	}
			
	   // 0부터 10까지 출력
	   for (int i = 0; i < 11; i++) {
		   System.out.println(i+" ");
		
	}
	   System.out.println("============== ");
	  
	   // 0부터 10까지 짝수만 출력
	   for (int i = 0; i < 11; i=i+2) {
		   System.out.println(i+" ");
	}
	   // 1부터 10까지 홀수만 출력
	   for (int i = 1; i < 11; i=i+2) {
		   System.out.println(i+" ");
	   }
	   System.out.println("============== ");
	   
	   // 0부터 10까지 짝수만 출력
	   
	   for (int i = 0; i < 11; i++) {
		   if (i%2==0) { // 0을2로 나눈 나머지가 0이면 짝수 / 0을 2로 나눈 나머지가 1이면 홀수
			   System.out.println(i+" ");
		}
		  
		
	}
	// 구구단 중 7단 출력
	   for (int i = 1; i < 10; i++) {
		   System.out.println("7*" + i + "=" + (7*i));
	   }
	   
	   // 1-10 누적합 (함께 구하기)
	   // 이전저장 = 이전저장+현재 (누적합 공식) sum = sum+i = i의 누적합 (초기값 0) 
	   //                                sum = sum*i = i의 누적곱 (초기값 1)
	   // 누적합 : 이전저장변수 = 이전저장변수 + 현재값 ; (이전저장변수 0)
	   // 누적곱 : 이전저장변수 = 이전저장변수 * 현재값 ; (이전저장변수 1)
	   
	   int sum = 0; // for문의 밖에서 구하는 값이라 {} 밖에서 씀!!
	   for (int i = 1; i < 11; i++) {
		   sum = sum + i;
		  
	   }
		  System.out.println("누적합: " + sum);// for문의 밖에서 구하는 값이라 {} 밖에서 씀!!
	
	  // 0부터 10까지 짝수의 누적합 
		int even = 0;
		for (int i = 0; i < 11; i++) {
			if(i%2 ==0) {
				 even = even + i;
			}
		}
		System.out.println("짝수의 누적합 : " + even);
		
		// 7! = 7*6*5*4*3*2*1 ;(누적곱 구하기)
		int mul = 1;
		for (int i = 7; i > 0; i--) {
			mul = mul * i ;
		}
	 System.out.println("7! = " + mul);
	 
	 
	 // 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 +(-10) (for문을 이용한 누적합)
		  int nu = 1;
		  for (int i = 1; i < 11; i++) {
			if(nu%2 == 0) {
				nu = nu-i;
				
				
			}
		}
		 System.out.println(" ");
	}

}
