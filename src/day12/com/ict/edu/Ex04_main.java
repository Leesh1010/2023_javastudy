package day12.com.ict.edu;

import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {

		Ex04_get_set[] arr = new Ex04_get_set[5];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			Ex04_get_set person = new Ex04_get_set(); // for문안에 객체 생성
			System.out.print("이름 : ");
			person.setName(scan.next());
			
			System.out.print("국어: ");
			person.setKor(scan.nextInt());  // 괄호안에 scan!!!
			System.out.print("영어: ");
			person.setEng(scan.nextInt()); 
			System.out.print("수학: ");
			person.setMath(scan.nextInt()); 

			
			person.setSum(person.getKor() +  person.getEng() + person.getMath()) ;
			person.setAvg((int)(person.getSum() / 3.0 * 10) / 10.0) ;

			if (person.getAvg() >= 90) {
				person.setHak("A힉점");
			} else if (person.getAvg() >= 80) {
				person.setHak("B힉점");
			} else if (person.getAvg() >= 70) {
				person.setHak("C힉점");
			} else {
				person.setHak("F힉점");
			}

			person.setRank(1); 
			arr[i] = person;
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
		Ex04_get_set tmp = new Ex04_get_set(); // 순위 비교를 위한 임시저장 공간 생성
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
