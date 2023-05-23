package day08.com.ict.deu;

import java.util.Iterator;
import java.util.Scanner;

public class Ex12_Arrya {
public static void main(String[] args) {
	
	
	// 학생 수 받기
	
	
	// 키보드로 번호, 국어, 영어, 수학 받기
	
	// 총점, 평균, 학점, 순위(초기값지정)
	
	// 순위 
	
	// 오름차순 정렬
	
	// 출력
	
	
	Scanner scan = new Scanner (System.in);
	
	System.out.print("몇 명 인가요? ");
	int su = scan.nextInt();
	
	
	int num = 0;
	int kor = 1;
	int eng = 2;
	int math = 3;
	int[][] arr = new int[su][8]; // 번호, 국어,영어, 수학, 총점, 평균, 학점, 순위 구해야 하는 값이 8개라 [8]!!!!
	
	for (int i = 0; i < su; i++) {
		for (int j = 0; j < 4; j++) {
			if(j==num) {
				System.out.print("번호 : ");
				arr[i][num] = scan.nextInt();
			}else if (j == kor) {
				System.out.print(arr[i][num] + " 번 학생의 국어 점수:");
				arr[i][kor] = scan.nextInt();
			}else if (j == eng) {
				System.out.print(arr[i][num] + " 번 학생의 영어 점수:");
				arr[i][eng] = scan.nextInt();
			}else if (j == math) {
				System.out.print(arr[i][num] + " 번 학생의 수학 점수:");
				arr[i][math] = scan.nextInt();
			}
		}
	}
	int sum = 4;
	int avg = 5;
	int hak = 6;
	int rank = 7;
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < 8; j++) {
			if(j==sum) {
				arr[i][sum] = arr[i][kor]+arr[i][eng]+arr[i][math];
			}else if(j==avg) {
				arr[i][j] =(int)((arr[i][sum]/3.0) *10 / 10.0);
				
			}else if(j==hak) {
				if(arr[i][avg]>=90) {
					arr[i][hak] = 'A';
				}else if(arr[i][avg]>=80) {
					arr[i][hak] = 'B';
				}else if(arr[i][avg]>=70) {
					arr[i][hak] = 'C';
			}else if(arr[i][avg]>=60) {
				arr[i][hak] = 'D';
		}else {
			arr[i][hak] = 'F';
	}
}arr[i][rank] = 1;
}
	}
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if(arr[i][sum]==arr[j][sum]) {
				continue;
			}else if(arr[i][sum] < arr[j][sum]) {
				arr[i][rank]++;
			}
		}
	}
			int[][] tmp = new int[su][8];
			
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i][rank] > arr[j][rank]) {
						tmp[i] = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp[i];
					}
				}
			}
			System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점\t순위\t");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i][num] + "\t");
				System.out.print(arr[i][kor] + "\t");
				System.out.print(arr[i][eng] + "\t");
				System.out.print(arr[i][math] + "\t");
				System.out.print(arr[i][sum] + "\t");
				System.out.print((double) arr[i][avg] + "\t");
				System.out.print((char) arr[i][hak] + "\t");
				System.out.print(arr[i][rank] + "\t");
				System.out.println();
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}