package day06.com.ict.edu2;

//import java.util.Scanner;

public class Ex00_oo {
	public static void main(String[] args) {
//	
//		Scanner scan = new Scanner(System.in);
//		
//		// 근무시간이 8시간까지는 시간당 9620원이고, 8시간을 초과 시 초과한 만큼 1.5배 지급한다. 
//    	// 현재 근무한 시간이 10시간이다. 
//       // 얼마를 받아야 하는가?
//		System.out.print("근무시간 : ");
//		int t = scan.nextInt(); // 근무한 시간
//		
//		int w = 8;
//		int d = 9620;
//		int p = 0;
//		
//			if(t <=w) { //초과 근무시간보다 작을때
//				p = t*d;
//			}else { //초과 근무를 했을 때 
//				p = (t*d) + ((t - w)*(int)(d*1.5));  
//			} System.out.println(t + "시간 근무시 "+ p +" 원 입니다.");
//		 
//		
//		
//		
//		 // menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
//        // 3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
//        // 친구와 함께 2잔을 10000 내고 먹었다.
//        // 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
//        // (친구와 같은 음료을 먹어야 한다.)
//         System.out.print("메뉴선택 : ");
//         
//         int o = scan.nextInt(); // 고를 메뉴
//         String str = "";
//         
//         int m = 3500;
//         int l = 4000;
//         int a = 3000;
//         int f = 3500;
//         int r = 10000;
//         int g =2;
//         int h = 0;
//         
//         if (o==1 ) {
//			str = "카페모카";
//			h = r-(int)((m*g)*1.1);
//					
//		} else if (o == 2){
//			str = "카페라뗴";
//			h = r-(int)((l*g)*1.1);
//		}else if (o == 3){
//			str = "아메리카노";
//			h = r-(int)((a*g)*1.1);
//		}else if (o == 3){
//			str = "과일쥬스";
//			h = r-(int)((f*g)*1.1);
//		} System.out.println(o +  str + " 잔돈은 " +h +"원 입니다.");
//         
//         
//      // 나라를 입력하면 수도가 출력되게 하자
// 		// 한국 => 서울, 중국 => 베이징, 일본 =>도쿄, 미국 => 워싱턴, 이 외에는 데이터 없음
// 		// (swtich ~ case)
//         System.out.print("나라 : ");
//         String u = scan.next() ;
//         str ="";
//         
//         switch (u) {
//		case "한국": str = "서울";break;
//		case "중국": str = "베이징";break;	
//		case "일본": str = "도쿄";break;	
//		case "미국": str = "워싱턴";break;
//		default: str = "없는나라";		
//		} System.out.println(str);
//         
         
		
		
		
		
		
//		 String name = "홍길동";
//		 int kor = 95;
//		 int eng = 85;
//		 int math = 85;
//		 int sum = 0;
//		 double total = 0;
//		 double total2 = 0;
//		 
//		sum = kor+eng+math;
//		total = (sum/3);
//		System.out.println(total);
		
		
		
//		int h = 2*60*60;
//		int m = 40*60;
//		System.out.println(h);
//		System.out.println(m);
//		int s = 30;
//		int s1 = 0;
//		
//		s1 = h+m+s;
//		System.out.println("결과:" + s1 + "초 입니다.");
//		
		
		
		int m = 8500;
		int s = 20000;
		int s1 = 2;
		int s2 = 0;
		int s3 = 0;
		int s4 = 0;
		
		
		s2 = m*s1; // 8500*2
		s3 = s2/10;
		s4 = (s-(s2+s3));
		System.out.println("잔돈은 : " + s4 +"원 입니다.");
		
		//자료형 변수이름 = (조건식) ? 조건식이 참일 때 실행할 문장 : 조건식이 거짓일 때 실행할 문장;

		String res = "";
		char c1 = 't';
		res= (c1 >= 'A' && c1 <= 'Z') ? "대문자다" : "소문자다";
		System.out.println("결과 : " + res);
		
		
		
		char c2 = 'f';
		switch (c2) {
		   case 'A': res = "아프리카"; break;
		   case 'a': res = "아프리카"; break;
		   case 'B': res = "브라질"; break;
		   case 'b': res = "브라질"; break;
		   case 'C': res = "캐나다"; break;
		   case 'c': res = "캐나다"; break;
           default: res = "한국"; break;
		}
		System.out.println("결과 : " + res);
		
		
		
}      

}
