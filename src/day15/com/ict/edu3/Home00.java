package day15.com.ict.edu3;

import java.util.Scanner;

public class Home00 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Home01 tv = new Home01();
		Home02 com = new Home02();
		Home03 ear = new Home03();
		
		
		int vol = 3;
		esc2:
        while(true) {
            System.out.println("======= 장치를 선택하세요 =======");
            System.out.println("1. TV | 2. 컴퓨터 스피커 | 3. 이어폰");
            int su = scan.nextInt();        // 장치 선택하기
            System.out.println();
            switch(su) {
            case 1 : tv.getVolume(vol);
                    System.out.println("현재 볼륨은" + vol + " 입니다."); break;

            case 2: com.getVolume(vol);
            System.out.println("현재 볼륨은 " + vol + " 입니다."); break;

            case 3: ear.getVolume(vol);
            System.out.println("현재 볼륨은 " + vol + " 입니다."); break;
             default : System.out.println("다시 입력하세요"); break;
            }

        // 볼륨 설정하기
        
            
            while(true) {
             
                System.out.println("======= 볼륨을 설정합니다 ======="); 
                System.out.println("1. 볼륨 up | 2. 볼륨 down | 3. 종료");
            	
                int num = scan.nextInt();
                
              
                switch(num) {
                		
                case 1 : vol++; 
                    System.out.println("현재 볼륨은 "+vol+"입니다.");break;
                case 2 : vol--;
                     System.out.println("현재 볼륨은 "+vol+"입니다."); break;
                case 3 :System.out.println("종료합니다."); 
               
                    if(su == 1) {
                    		tv.setVolume(vol);
                    }else if (su ==2) {
                    	com.setVolume(vol);
                }else if (su==3) {
                	ear.setVolume(vol);
                
                    break esc2;
                } default : System.out.println("다시 입력하세요"); break esc2;
                
                 	
                 }   if(vol<0 || vol>9) {
                     System.out.println("볼륨 설정이 불가합니다.");break  ;
                     
                 }
            }
             
            
        
        
        }
	}
}
                
              
        
            
        
				
        
			
	
