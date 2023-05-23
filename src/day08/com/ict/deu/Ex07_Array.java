package day08.com.ict.deu;

import java.util.Arrays;

public class Ex07_Array {
public static void main(String[] args) {
	
	
	// 가장 큰 값과 가장 작은 값 구하기
	int[] su = {90,87,-20,120,67,23,40,53};
	
	// 오름차순
	Arrays.sort(su);
	
	System.out.println("가장 작은 값 : " + su[0]);
	System.out.println("가장 큰 값: " + su[su.length-1]);
	
	
	// 다차원 배열 - 1차원 배열이 여러개 모인것
	// new int [2][] => 뒤에 괄호르 비워두면 가변길이
	
	
}
}
