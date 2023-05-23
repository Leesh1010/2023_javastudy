package day05.com.ict.edu;

public class Ex04_while2 {
	public static void main(String[] args) {
		//while문 : for문과 같은 반복문
		// 형식1 )
		//       초기식;
		//       while(조건식){
		//            조건식이 참이면 실행할 문장;
		//            조건식이 참이면 실행할 문장;
		//            증감식;
		//     }
		//    while문의 끝을 만나면 조건식으로 간다.
		// 형식2 ) (true면 실행되기 때문에 무한루프?)
				//       초기식;
				//       while(true){
		        //          if(빠져나갈 조건) {
		        //              break;
		        //       } 
				//            조건식이 참이면 실행할 문장;
				//            조건식이 참이면 실행할 문장;
				//            증감식;
				//     }
				//    while문의 끝을 만나면 조건식으로 간다.
		
		//1-10까지 출력하자
//		int i = 1;
//		while (i <11) {
//			System.out.println("i = " +i);
//			i++;
//		}
		System.out.println("==========================");
		
//		i = 1;
//		while (true) {
//			if(i <= 11) {
//				break;
//			}
//			System.out.println("i = " +i);
//			i++; 
//			
//		}
		
		// 0 - 10까지 짝수 출력
		int i = 1;
		while (i <11) {
			if(i%2==0)
			{System.out.println("i = " +i);}
	
			i++;
		}
		
		// 구구단중 7단 출력
		
		i = 1;
		while (i <10) {
			System.out.println("7*" + i + "=" + (7*i));
			i++;
			
		}
		
		
		
		// 1-10 누적합 구하기
		
		int s = 0;
		
		i = 1;
		while (i < 11) {
			s = i+ s;
			
			i++;
			
		}System.out.println(s);
		
		
		// 0 0 0 0 
		// 0 0 0 0 
		// 0 0 0 0 
		// 0 0 0 0 
		
		i = 1;
		while (i<5) {
			System.out.println("0 0 0 0");
			i++;
		}
		
		i= 1;
		while (i<17) {
			System.out.print("0 ");
			if(i%4==0) {
				System.out.println();
			}
			i++;
		}
		
		
		

	}
}
