package day11.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
public static void main(String[] args) {
	
	//Ex08_method로 만들어진 객체만 저장하는 배열 = > 겍체형배열 (참조자료형배열)
		//int [] k1 = new int [] ;
		
		Ex08_method[] arr = new Ex08_method[5];
		
		Scanner scan = new Scanner (System.in);
		for (int i = 0; i < arr.length; i++) {
			Ex08_method person = new Ex08_method(); // for문안에 객체 생성
			System.out.print("이름 : ");
			person.name = scan.next();
			System.out.print("국어: ");
			person.kor =scan.nextInt();
			System.out.print("영어: ");
			person.eng = scan.nextInt();
			System.out.print("수학: ");
			person.math = scan.nextInt();
					
			person.sum = person.kor+person.eng+person.math;
			person.avg = (int)(person.sum /3.0*10)/10.0;
			
			if(person.avg>=90) {
				person.hak = "A학점";
			}else if(person.avg>=80) {
				person.hak = "B학점";
			}else if(person.avg>=70) {
			person.hak = "C학점";
			}else {
				person.hak = "F학점";
			}
		
				person.rank = 1;
				arr[i] = person;
		}	
				
	
			
		//순위
		for (int i = 0; i < arr.length; i++) { // i의 전체와 
			for (int j = 0; j < arr.length; j++) { //j의 전체 비교
				if(i==j)continue; // 나 자신과의 비교는 제외
				if(arr[i].sum<arr[j].sum) {
					arr[i].rank++;
				}
			}
		}
		
		
		//정렬
		Ex08_method tmp = new Ex08_method(); // 순위 비교를 위한 임시저장 공간 생성
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].rank > arr[j].rank) { // 해당 부등호가 오름차순, 반대로 하면 내림차순으로 구해짐
					tmp = arr[i]; // i의 내용을 임시(tmp)에 옮겨줘라
					arr[i] = arr[j];// 비어있는 i의 공간에 j의 내용을 넣어라.
					arr[j] = tmp; // j에 임시(tmp)에 있는 내용을 넣어라.
				}
			}
		}
		
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name + "\t");
			System.out.print(arr[i].sum + "\t");
			System.out.print(arr[i].avg + "\t");
			System.out.print(arr[i].hak + "\t");
			System.out.println(arr[i].rank );
		}
				
}
	}