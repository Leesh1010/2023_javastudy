package day04.com.ict.edu;

public class Ex03_if {
	public static void main(String[] args) {
		// 단순 if문 : 조건식이 참일 때만 실행, 거짓이면 if문 무시
		//형식) if(조건식){
		//               조건식이 참일때 실행할 문장;
		//               조건식이 참일때 실행할 문장;
		//    }
		// 단, 실행문장이 한줄이면 {} 블록을 생략할 수 있다.
		
		//형식) if(조건식) 
		//           조건식이 참일때 실행할 문장; <== 윗 줄과 합쳐서도 사용 가능
		//(ex: if(su1>=50)
		//             str="50이상";)
		
		//int k1이 60 이상이면 합격
		int k1 = 45;
		String res = "초기값";
		if (k1>=50) {
			res = "합격";
		}
		
		if (k1<50) res = "불합격";
		System.out.println("결과: "+res);
		
		//int k2가 홀수인지 짝수인지 판별하자
		int k2 = 43;
		
		res = "짝수";
		if (k2 % 2 == 1) {
			res = "홀수";
		}
		System.out.println("결과: "+res);
		
		//char k3가 대문자인지 아닌지 판별하자
		char k3 = 's';
		res ="대문자 아님";
		if (k3>='A'&& k3<='Z') {
			res = "대문자";
		}
		System.out.println("결과: "+res);
		
		
		int time = 10;
		int limt = 8;
		int dan = 9620;
		int pay = time*dan;
		if(time > limt) {
			pay= (limt*dan) + (int)((time-limt) *dan*1.5);
		}
		System.out.println("결과 : " + pay);
}
		
     
	}


