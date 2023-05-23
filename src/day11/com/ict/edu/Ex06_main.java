package day11.com.ict.edu;

import java.util.Scanner;

public class Ex06_main {
public static void main(String[] args) {
	//5명의 이름, 국어, 영어, 수학을 입력 받아서 
	// 이름, 총점, 평균, 학점, 순위를 구하고 
	// 순위를 기준으로 오름 차순 정렬 출력
	Ex06_method pp = new Ex06_method();
	
	
	
	//입력받기
	
	
	
Scanner scan = new Scanner (System.in);
String [] name = new String[5];
int[] kor = new int[5];
int[] eng = new int[5];
int[] math = new int[5];
int[] sum = new int[5];
double[] avg = new double[5];
String[] hak = new String[5]; 

Ex06_method ex06 = new Ex06_method(); // 객체생성

for (int i = 0; i < hak.length; i++) {
	System.out.print("이름: ");
	name[i] = scan.next();
	
	System.out.print("국어 : ");
	kor[i] = scan.nextInt();
	
	System.out.print("영어 : ");
	eng[i] = scan.nextInt();
	
	System.out.print("수학 : ");
	math[i] = scan.nextInt();
	
	//총점
	
	sum[i] = ex06.getSum(kor[i], eng[i], math[i]);
	
	//평균
	
	avg[i] = ex06.getAvg(sum[i]);
	
	//학점
	hak[i] = ex06.getHak(avg[i]);
}
//출력
for (int i = 0; i < hak.length; i++) {
	System.out.print(name[i]+"\t");
	System.out.print(sum[i]+"\t");
	System.out.print(avg[i]+"\t");
	System.out.println(hak[i]);
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
