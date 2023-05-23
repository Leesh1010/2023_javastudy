package day12.com.ict.edu;

import java.util.Scanner;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03_get_set coffee = new Ex03_get_set();
		coffee.setName("커피음료"); 
		coffee.setPrice(1000);
		
		Ex03_get_set ion = new Ex03_get_set();
		ion.setName("이온음료");
		ion.setPrice(1500);
		
		Ex03_get_set cola = new Ex03_get_set();
		cola.setName("탄산음료");
		cola.setPrice(1200);
		
		Ex03_get_set juice = new Ex03_get_set();
		juice.setName("과일음료");
		juice.setPrice(1800);

		/*
		Ex01_method[]arr = new Ex01_method[4];
		arr[0]= coffee; 
		arr[1] = ion;
		arr[2]= cola;
		arr[3]= juice;
		*/
		
		Ex03_get_set[] arr = {coffee, ion, cola, juice}; // 미리 만들어져 있을 때에는 위에처럼 말고 이렇게 한 번에 쓸 수 배열로 만들수 있음
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입하세요 >>>");
		int input = scan.nextInt();
		
		//음료들의 최소금액을 구하자 (오름차순에서 맨 처음 최소값, 맨 끝이 최대값)
		
		
		if(input<1000) {
			System.out.print("금액이 부족합니다.");
			System.out.println("잔돈: " + input);
		}else {
			System.out.println("커피\t이온\t탄산\t과일");
			
			//입력 금액과 각 음료수의 가격을 비교 
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].getPrice()<= input) {
					System.out.print("O\t");
					//System.out.print(arr[i].name+"/t"); // 금액과 비교해서 살 수 있는 애들만 표시 가능
				}else {
					System.out.print("X\t");
				}
			}
			System.out.println();
			System.out.println("선택하세요 >>");
			String drink = scan.next();
			int output = 0;
			switch (drink) {
			case "커피":output = input - arr[0].getPrice();break;
			case "이온":output = input - arr[1].getPrice();break;
			case "탄산":output = input - arr[2].getPrice();break;
			case "과일":output = input - arr[3].getPrice();break;
			default:
				System.out.println("잘못 선택하셨네요");
				output = input;
			}
			System.out.println("잔돈: " + output);
		}
}
}
