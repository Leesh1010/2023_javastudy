package day12.com.ict.edu;

import java.util.Scanner;

public class Ex09_main2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Ex09_Constructor[]arr = new Ex09_Constructor [5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름: ");
			String name = scan.next();
			
			System.out.print("국어: ");
			int kor = scan.nextInt();
			
			System.out.print("영어: ");
			int eng = scan.nextInt();
			
			
			System.out.print("수학: ");
			int math = scan.nextInt();
			
			Ex09_Constructor person = new Ex09_Constructor(name, kor, eng, math) ;
			person.setRank(1); 
			arr[i]= person;
			
		}
		
		// 순위
				for (int i = 0; i < arr.length; i++) { // i의 전체와
					for (int j = 0; j < arr.length; j++) { // j의 전체 비교
						if (i == j)
							continue; // 나 자신과의 비교는 제외
						if (arr[i].getSum() < arr[j].getSum()) {
							arr[i].setRank(arr[i].getRank()+1); // 기준값에서 + 1을 하는 식!!!!
						}
					}
				}

				// 정렬
				Ex09_Constructor tmp = new Ex09_Constructor(); // 순위 비교를 위한 임시저장 공간 생성
				for (int i = 0; i < arr.length - 1; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i].getRank() > arr[j].getRank()) { // 해당 부등호가 오름차순, 반대로 하면 내림차순으로 구해짐
							tmp = arr[i]; // i의 내용을 임시(tmp)에 옮겨줘라
							arr[i] = arr[j];// 비어있는 i의 공간에 j의 내용을 넣어라.
							arr[j] = tmp; // j에 임시(tmp)에 있는 내용을 넣어라.
						}
					}
				}
		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + "\t");
			System.out.print(arr[i].getSum() + "\t");
			System.out.print(arr[i].getAvg() + "\t");
			System.out.print(arr[i].getHak() + "\t");
			System.out.println(arr[i].getRank());
		}
	}
}