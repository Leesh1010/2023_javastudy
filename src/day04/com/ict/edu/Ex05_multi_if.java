package day04.com.ict.edu;

public class Ex05_multi_if {
	public static void main(String[] args) {
		// 다중 if문
		//형식) if(조건식1){
		//         조건식1이 참일때 실행할 문장;
		//         조건식1이 참일때 실행할 문장;
		//     }else if(조건식2){
		//         조건식1이 거짓이면서 조건식2가 참일때 실행할 문장;
		//         조건식1이 거짓이면서 조건식2가 참일때 실행할 문장;
		//    }else if(조건식3){
		//      조건식1,2가 거짓이면서 조건식3가 참일때 실행할 문장;
		//      조건식1,2가 거짓이면서 조건식3가 참일때 실행할 문장;
		//	    }else {	
		//      조건식1,2,3 모두 거짓인 경우 실행할 문장;
		//    }
		
		//int k1의 점수가 90이상이면 A학점, 80이상이면 B학점, 70이상이면 C학점, 나머지는 F학점
		int k1 = 10 ;
		String str = "";
		if (k1>=90) {
			str = "A";
		} else if(k1>=80) {
			  str = "B";
		}else if(k1>=70) {
			  str = "C";
		}else  {
			  str = "F";
		}
		System.out.println("결과: " + str);
		
		//char k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별하자
		char k2 = 10;
		if (k2>='A'&& k2<='Z') {
			str = "대문자";
		} else if(k2>='a'&& k2<='z') {
			  str = "소문자";
		}else if(k2>= '0' && k2<='9') {
			  str = "숫자";
		}else  {
			  str = "기타문자";
		}
		System.out.println("결과: " + str);
		
		
		// char k3가 A,a이면 아프리카, B,b이면 브라질, C,c이면 캐나다, 나머지는 한국
		
		char k3 = 'a';
				if (k3=='a' || k3=='A' ) {
					str = "아프리카";
				} else if(k3=='b'||k3=='B') {
					  str = "브라질";
				}else if(k3=='c'||k3=='C') {
					  str = "캐나다";
				}else  {
					  str = "한국";
				}
				System.out.println("결과: " + str);
		
		// menu가 1이면 카페모카 3500,2면 카페라떼 4000, 3이면 아메리카노 3000,
		//4면 과일쥬스 3500이다. 친구와 2잔을 10000을 내고 먹었다.
		// 잔돈은 얼마인가?(부가세 포함)
		
				   int menu_1 = 3500;
			        int menu_2 = 4000;
			        int menu_3 = 3000;
			        int menu_4 = 3500;
			        int pay = 10000;
			        int change = 0;
			        int total = 2;
			        int order = 1;

			        if (order == 1) {
			            change = pay - (int)((menu_1 * total) * 1.1);
			        }else if (order == 2) {
			            change = pay - (int)((menu_2 * total) * 1.1);
			        }else if (order == 3) {
			            change = pay - (int)((menu_3 * total) * 1.1);
			        }else if (order == 4) {
			            change = pay - (int)((menu_4 * total) * 1.1);
			        }
			        System.out.println("거스름돈은 " + change + " 원 입니다.");

		
		
			        int menu1 = 2;
			        int pay2 = 10000;
			        int sa = 2;
			        int zen = 0;
			        if (menu1 ==1) {
			            zen = pay2-(int) ((3500*sa)*1.1);
			        } else {if (menu1 ==2) {
			            zen = pay2-(int) ((4000*sa)*1.1);  }
			          else {if (menu1 ==3) {
			              zen = pay2-(int)((3000*sa)*1.1);  }
			          else {if (menu1 ==4) {
			            zen = pay2-(int)((3500*sa)*1.1);  }
			          else {
			              zen = pay2;
			          }
			        }
			          }
			        }
			        System.out.println("잔돈은 : " + zen);
			        
			        
			        int menu_11 = 3;
			        int in = 10000;
			        int su = 2;
			        int dan = 0;
			        String drink ="";
			      
			        
			        
			        if (menu_11 == 1) {
			             drink ="카페모카";
			             dan = 3500;
				} else if (menu_11 == 2) {
						 drink ="카페라떼";
			             dan = 4000;
					} else if (menu_11 == 3) {
						 drink ="아메리카노";
			             dan = 3000;
					}else if (menu_11 == 4) {
						 drink ="과일쥬스";
			             dan = 3500;
					}
			        
			        
			        int total_1 = dan*su;
			        int vat = (int)(total_1 * 0.1);
			        int out = in-(total_1 + vat);
			        
			        System.out.println("선택메뉴: " + drink);
			        System.out.println("잔돈: " + out);
			    
			        
			        
		
				
	}

}
