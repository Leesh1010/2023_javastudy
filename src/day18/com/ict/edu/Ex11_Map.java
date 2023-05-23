package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex11_Map {
	public static void main(String[] args) {
		//대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장 시키고 
		// 원하는 나라가 key값이 되어, 화면에서 나라를 물어보면 수도가
		// 출력되는 프로그램 작성
		
		HashMap<String,String>map1 = new HashMap<>();
		map1.put("대한민국", "서울");
		map1.put("캐나다", "오타와");
		map1.put("영국","런던" );
		map1.put("스위스","베른" );
//		for (String k : map1.keySet()) {
//			System.out.println(k);
//		}
			
		
		Scanner scan = new Scanner(System.in);
		 //Set<String> key = map1.keySet(); = > 키 관리 하는 애 생성 
		esc:
		while(true) {
		System.out.print("나라를 입력하세요 : ");
		String w = scan.next();
		String i = map1.get(w);
		if (map1.containsKey(w)) {
			System.out.println(i);
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		 while (true) {
	
             System.out.println("계속하시겠습니까?\n(Y/N)");
             w = scan.next();
             if (w.equalsIgnoreCase("y")) {
                 continue esc;
             } else if (w.equalsIgnoreCase("n")) {
                 break esc;
             } else {
                 System.out.println("잘못 입력하셨습니다.");
                 continue;
             
        	 }
		 }
		}
	}
}