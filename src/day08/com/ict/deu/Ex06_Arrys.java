package day08.com.ict.deu;

import java.util.Iterator;
import java.util.Scanner;

public class Ex06_Arrys {
public static void main(String[] args) {
	//이름, 국어 , 영어, 수학을 입력 받으시오
	//인원수 ? 
	Scanner scan = new Scanner (System.in);
	
// 정보를 배열에 넣기 위해 배열을 미리 만들기 위해 인원수를 물어본다.
	
	System.out.print("몇명인가요? ");
	int s1 = scan.nextInt() ;
	
	// 미리 배열을 만든다.
	String[] name = new String[s1];
	int[] kor = new int[s1];
	int[] eng = new int[s1];
	int[] math = new int[s1];
	
	int[] sum = new int [s1];
	double[] avg = new double[s1];
	String[] hak = new String[s1];
	int[] rank = new int[s1];
	
	
	for (int i = 0; i < s1; i++) {
		System.out.print("이름 : ");
		name[i] = scan.next();
		System.out.print("국어 : ");
		kor[i] = scan.nextInt();
		System.out.print("영어 : ");
		eng[i] = scan.nextInt();
		System.out.print("수학 : ");
		math[i] = scan.nextInt();
		}

	for (int i = 0; i < name.length; i++) { // 굳이 만들 필요가 없다..?
		sum[i] = kor[i] + eng[i] + math[i];
		avg[i] = (int)(sum[i]/3.0*10)/10.0;
		if(avg[i]>=90) {
			hak[i] = "A 힉점";
		}else if(avg[i]>=80) {
			hak[i] = "B 힉점";
		}else if(avg[i]>=70) {
			hak[i] = "C 힉점";
		}else {
			hak[i] = "F 힉점";
		}
		// 순위 정렬 못함
	}
		
	// 순위를 구하자(sum으로 비교하자)
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if(sum[i] == sum[j]) continue;
				if(sum[i]<sum[j]) {
					rank[i]++;
				}
				
			}
			
		}
		
		
		//순위정렬
		int tmp =0;
		for (int i = 0; i < rank.length-1; i++) {
			for (int j = i+1; j < rank.length; j++) {
				if (rank[i]>rank[j]) {
					tmp = rank[i];
					rank[i] = rank[j];
					rank[j] = tmp ; 
				}
			}
		}
		
		
		
		
		
		
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.println(rank[i] +1); 
		}
	
}
}
