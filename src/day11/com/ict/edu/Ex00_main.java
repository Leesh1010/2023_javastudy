package day11.com.ict.edu;

import java.util.Scanner;

public class Ex00_main {
	public static void main(String[] args) {
//		총점, 평균, 학점을 구하는 메서드가 있는 클래스를 만들고
//		이름, 국어, 영어, 수학를 받아서
//		총점, 평균, 학점, 순위를 구하고
//		순위 기준으로 오름차순으로 정렬하여
//		출력하는 main 메서드를 가지는 클래스를 만들어라
//		단, 처리는 2차원배열을 이용해라
		
		Scanner scan = new Scanner (System.in);
		Ex00_method gg = new Ex00_method(); // 객체생성
		
		System.out.print("몇명인가? ");
		int su = scan.nextInt();
		
		
		String[][] str = new String[su][2]; // 글자형태인 이름과 학점
		  double[][] sc = new double[su][6]; // 국어,영어,수학,총점,평균,랭킹
		for (int i = 0; i < str.length; i++) {
			Ex00_method person = new Ex00_method();
			System.out.print("이름: ");
			person.name = scan.next();
			System.out.print("국어: ");
			person.kor = scan.nextInt();
			System.out.print("영어: ");
			person.eng = scan.nextInt();
			System.out.print("수학: ");
			person.math = scan.nextInt();
	
			person.getSum();
			person.getAvg();
			person.getHak();
			
			str[i][0] = person.name;
		      str[i][1] = person.hak;
		      sc[i][0] = person.kor;
		      sc[i][1] = person.eng;
		      sc[i][2] = person.math;
		      sc[i][3] = person.sum;
		      sc[i][4] = person.avg;
		      sc[i][5] = person.rank;
		      
	} for (int i = 0; i < sc.length; i++) {
	      for (int j = 0; j < sc.length; j++) {
	          if (sc[i][3] == sc[j][3])
	              continue;
	          else if (sc[i][3] < sc[j][3])
	              sc[j][5]++;
	      }
	  }
	  // 순위 순서매기기
	  double[][] arr = new double[su][6];
	    for (int i = 0; i < arr.length; i++) {
	        arr[(int) (sc[i][5] -1) ] =sc[i];
	    }
	    
	    System.out.println("이름\t총점\t평균\t학점\t순위");
	  for (int i = 0; i < arr.length; i++) {
	    System.out.print(str[i][0]+"\t");
	    System.out.print((int)arr[i][3]+"\t");
	    System.out.print(arr[i][4]+"\t");
	    System.out.print(str[i][1]+"\t");
	    System.out.println((int)arr[i][5]);
		
		
	  }
		}
	}
