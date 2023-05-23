package day08.com.ict.deu;

public class Ex05_Arrys {
public static void main(String[] args) {
	String[] name = {"홍","김","이","박","고"};
	int[] kor = {80,90,80,70,100};
	int[] eng = {85,95,75,85,95};
	int[] math = {100,95,90,100,100};
	
	int[] sum = new int [name.length];
	double[] avg = new double[name.length];
	String[] hak = new String[name.length];
	int[] rank = {1,1,1,1,1};
	
	// for문을 이용해서 반복처리한다.
	for (int i = 0; i < name.length; i++) {
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
	// 순위정렬
	int tmp = 0;
	for (int i = 0; i < rank.length-1; i++) {
		for (int j = i+1; j < rank.length; j++) {
			if(rank[i]> rank[j]) {
			tmp = rank[i];
			rank[i] = rank[j];
			rank[j] = tmp;
			}
		}
	}
		//출력
	System.out.println("이름\t총점\t평균\t학점\t순위");
	for (int i = 0; i < name.length; i++) {
		System.out.print(name[i]+" ");
		System.out.print(sum[i]+" ");
		System.out.print(avg[i]+" ");
		System.out.print(hak[i]+" ");
		System.out.println(rank[i]);
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
		
}
}
