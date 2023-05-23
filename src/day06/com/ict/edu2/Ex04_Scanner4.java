package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex04_Scanner4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		//System.out.print("원하는 반복 횟수 : ");
		//int su = scan.nextInt();
		
		//System.out.print("원하는 단어 :");
		//String str = scan.next();
		
		// for문은 원하는 반복 횟수를 충족하기 위해서 0부터 시작 !!! 
		//for (int i = 0; i < su; i++) {
		//	System.out.println(str);
		//}
		
		
		//int i = 0;
		//while (i<su) {
			//System.out.println(str);
			//i++;
		//}
		
		//원하는 횟수를 입력 받고 숫자를 입력 받아서 입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩
		
		
		
		
		
		
		
		System.out.print("원하는 반복 횟수 : ");
		int su1 = scan.nextInt();
		System.out.print("입력 받은 숫자 : ");
		int su2 = scan.nextInt();
		for (int i = 0; i < su1; i++) {
			for (int j = 0; j < su2; j++) {
				System.out.println(su2);
			
			
			System.out.print(" 짝수인가  ");
			String str = scan.next();
			boolean eo = scan.nextBoolean();
			if (su2%2==0) {
				str = "맞다";
			}else if (su2%2 ==1){
				str = "아니다";
				System.out.println(str);
			}
		}
			}
			
		
		
		//이름, 국어, 영어, 수학를 입력 받아서 총점, 평균, 학점을 구하고 이름, 총점, 평균, 학점을 출력하는 코딩 
		//(평균은 소숫점 첫째자리까지 구하자)
		
		
		//첫번째 숫자 받기 두번째 숫자 받기 연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ") 
		//결과는 소수점
	}
}
