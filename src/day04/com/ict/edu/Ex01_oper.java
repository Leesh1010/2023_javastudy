package day04.com.ict.edu;

public class Ex01_oper {
	public static void main(String[] args) {
		// 삼항 연산자:조건식 =>조건이 참 일때와 거짓 일때 를 구분해서 실행한다.
		// 형식 ) 자료형 변수이름 = (조건식) ? 조건식이 참 일때 실행할 문장 : 조건식이 거짓일 때 실행할 문장;
		//**주의사항 ) 변수, 참일 때 실행 결과, 거짓일 때 실행 결과 모두 같은 자료형이어야 한다.
		// 조건식에는 boolean(true,false), 비교연산자(>,<,>=,<= 등), 논리연산자
		
		String str = (false)? "강아지" : "고양이" ;
		System.out.println(str);
		
		
		// 평균 점수가 60점 이상일 시 
		double avg = 55.3;
		str = (avg >= 60) ? "합격"  : "불합격"    ;
		System.out.println("결과: "+ str);
		
		
		// && 두가지 조건을 모두 만족해야 함***********
		char c1 ='g';
		str = (c1>='a' && c1<+'z') ? "소문자" :"소문자 아님"  ;
		System.out.println("결과 : "+ str );
		
		
		// 1또는 3이면 남자, 아니면 여자
		int gender = 1;
		str = (gender ==1||gender ==3) ? "남자" : "여자" ;
		System.out.println("결과: " +str);
		
		// 홀수면 남자 짝수면 여자
		gender = 4;
		str = (gender % 2 == 1) ? "남자" : "여자" ;
		System.out.println("결과: " + str); 
		
		//3의 배수인지 아닌지 알아보자
		int su1 = 157;
		str = (su1 % 3 ==0) ? "맞다" : "아니다" ;
		System.out.println("결과: "+str);
		System.out.println("==================");
		
		
		// 근무시간이 8시간까지는 시간당 9620원이고, 8시간을 초과 시 초과한 만큼 1.5배 지급한다. 
		// 현재 근무한 시간이 10시간이다. 
		// 얼마를 받아야 하는가?
		
		int pay = 9620;
		int overpay = (int) (1.5*9620);
		int overwork = 10;
		int reault = 0;
		str = (overwork >8 ) ? "초과" : "초과 아님" ;
		reault = (overwork > 8) ? ((overwork - 8) *overpay) + (8*pay) : (overwork*pay)  ;
		System.out.println("지급액: " + reault  + "원" ); 
		
		// 
		int time = 10;
		int dan = 9620;
		
		int pay1 = (time > 8) ? (8*dan) + (int)((time-8)*dan* 1.5) : time*dan ;
		System.out.println("결과 : " + pay1 ); 
		
		
		int num1 = 47;
		int num2 = 32;
		int res = (num1 > num2) ? num1:num2  ;
		System.out.println("큰값 : " + res);
		
		
		int res2 = Math.max(num1, num2);
		System.out.println("큰값 : " + res2);
		
		int res3 = -38;
		int res4 = (res3 > 0) ? res3: res3*-1  ;
		System.out.println("결과 : " + res4);
		
		int res5 = Math.abs(res3);
		System.out.println("결과 : " + res5);
		
		
	}

}
