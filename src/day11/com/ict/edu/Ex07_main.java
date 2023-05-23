package day11.com.ict.edu;

import java.util.Scanner;

public class Ex07_main {
public static void main(String[] args) {
	
	//5명의 이름, 국어, 영어, 수학을 입력 받아서
	// 이름, 총점, 평균, 학점 구하기
	
Scanner scan = new Scanner (System.in);
String [] name = new String[5];
int[] kor = new int[5];
int[] eng = new int[5];
int[] math = new int[5];
int[] sum = new int[5];
double[] avg = new double[5];
String[] hak = new String[5]; 

Ex07_method ex07= new Ex07_method(); // 객체생성

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
	
	ex07.getSum(kor[i], eng[i], math[i]);
	sum[i] = ex07.sum;
	//평균
	
   ex07.getAvg(sum[i]);
	avg[i] = ex07.avg;
	
	//학점
	 ex07.getHak(avg[i]);
	 hak[i] = ex07.hak;
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
