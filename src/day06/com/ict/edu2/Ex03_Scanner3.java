package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex03_Scanner3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		// 근무시간이 8시간까지는 시간당 9620원이고, 8시간을 초과 시 초과한 만큼 1.5배 지급한다. 
    	// 현재 근무한 시간이 10시간이다. 
       // 얼마를 받아야 하는가?
		System.out.print("근무시간 : ");
		int s = scan.nextInt() ;
		int time = 10;
		int limt = 8;
		int dan = 9620;
		int pay = time*dan;
		if (time<limt) {
			pay= (s*dan) + (int)((time-limt) *dan*1.5);
		} else {
			pay= s*dan ;
		}
		System.out.println(s + " 시간 일하면 " + pay + " 원 입니다.");
	
		
		
		 // menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
        // 3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
        // 친구와 함께 2잔을 10000 내고 먹었다.
        // 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
        // (친구와 같은 음료을 먹어야 한다.)
         System.out.print("메뉴선택 : ");
         int m = scan.nextInt() ;
         int menu_1 = 3500;
	        int menu_2 = 4000;
	        int menu_3 = 3000;
	        int menu_4 = 3500;
	        int cash = 10000;
	        int change = 0;
	        int total = 2;
	       

	        if (m == 1) {
	            change = cash - (int)((menu_1 * total) * 1.1);
	        }else if (m == 2) {
	            change = cash - (int)((menu_2 * total) * 1.1);
	        }else if (m == 3) {
	            change = cash - (int)((menu_3 * total) * 1.1);
	        }else if (m == 4) {
	            change = cash - (int)((menu_4 * total) * 1.1);
	        }
	        System.out.println("메뉴 "+  m + "의 거스름돈은 " + change + " 원 입니다.");
		
		
		
		// 나라를 입력하면 수도가 출력되게 하자
		// 한국 => 서울, 중국 => 베이징, 일본 =>도쿄, 미국 => 워싱턴, 이 외에는 데이터 없음
		// (swtich ~ case)
		System.out.print("나라 : ");
		String t = scan.next() ;
		String str = "";
		
		switch (t) {
			case "한국": str = "서울" ; break;
			case "중국": str = "베이징"; break; 
			case "일본": str = "도쿄" ; break;
			case "미국": str = "워싱턴" ; break;
		default: str = "데이터 없음";
			break;
		}
		System.out.println(t + "의 수도는 " + str +" 입니다.");
		
		
		
		
	}
}
