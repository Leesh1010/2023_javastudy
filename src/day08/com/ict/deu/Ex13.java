package day08.com.ict.deu;

import java.util.Scanner;

public class Ex13 {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner (System.in);
	
	//학생 수 받기
	System.out.print("학생 수 : ");
	int su = scan.nextInt();
	double[][] arr = new double[su][8];
	
	for (int i = 0; i < arr.length; i++) {
		//for문이 실행 될 때 마다 한사람의 정보를 담을 수 있는 배열을 만들자
		double[] p = new double[8]; // for문 안에 생성해야 여러 정보를 저장할 수 있음 / 밖에 만들면 저장 된 마지막 값을 저장하고 있음
		
		//키보드로 번호, 국어,영어,수학
		System.out.print("번호 : ");
		p[0] = scan.nextInt();
		
		System.out.print("국어 : ");
		p[1] = scan.nextInt();
		
		System.out.print("영어 : ");
		p[2] = scan.nextInt();
		
		System.out.print("수학 : ");
		p[3] = scan.nextInt();
		
		p[4] = p[1] + p[2] + p[3];
		
		p[5] = (int)(p[4]/3.0*10)/10.0;
		
		if(p[5] >= 90) {
			p[6] = 'A';
		}else if(p[5] >= 80) {
			p[6] = 'B';
	}else if(p[5] >= 70) {
		p[6] = 'C';
	}else {
			p[6] = 'F';
	}
	 
		p[7] = 1;
		
		// 다차원 배열에 넣자
		arr[i] = p;
	}
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if(i==j) continue; //나 자신과의 비교 하지 않음 = > 이과정 생략 가능
			if(arr[i][4] < arr[j][4]) {
				arr[i][7]++;
			}
		}
	}
	
	// 자리를 바꾸기 위해서 임시
	double [] tmp = new double[8];
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i][7] > arr[j][7]) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j]= tmp;
			}
		}
	}
	
	System.out.println("번호\t총점\t평균\t학점\t순위");
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			if(j ==1 || j==2 || j==3) continue;
			if(j==5) {
				System.out.print(arr[i][j]+ "\t");
			}else if (j ==6) {
				System.out.print((char)(arr[i][j]) + "\t ");
			}else {
				System.out.print((int)(arr[i][j]) + "\t");
			}
	}
		System.out.println();
	}
	
	
	
	
	
	
	
	// 학생 수 이름,국어, 영어, 수학 점수 받기
	
	//총점, 평균, 학점 구하기 
	
	// 순위 정하고 정렬하기.
	
//	Scanner scan = new Scanner(System.in);
//	
//	System.out.print("몇명 : ");
//	int s = scan.nextInt();
//	
//	String name = "";
//	int kor = 0;
//	int eng = 0;
//	int math = 0;
//	int sum = 0;
//	double avg = 0.0;
//	String hak = "";
//	int rank = 0;
//	
//	
//	
	
	// 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
