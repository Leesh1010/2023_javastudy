package day08.com.ict.deu;

public class Ex11_Arrya {
public static void main(String[] args) {

	
	
	int [][] arr = new int [5][5];
	
	
	         //번호, 총점, 평균, 학점, 순위
	int[] p1 = {1, 270, 90, 'A', 1};
	int[] p2= {2, 210, 70, 'C' , 1};
	int[] p3= {3, 180, 60, 'F' , 1};
	int[] p4= {4, 300, 100, 'A' , 1};
	int[] p5= {5, 285, 95, 'A' , 1};
		
	// 순위를 구하자
	
	//1차원 배열인 p1 ~p5를 다차원배열인 arr에 넣어줌
	arr[0] =p1;
	arr[1] =p2;
	arr[2] =p3;
	arr[3] =p4;
	arr[4] =p5;
	
// 순위 비교 
	for(int i = 0; i<arr.length; i++){
          for(int j = 0; j<arr.length; j++){
             if(arr[i][2]<arr[j][2]){
            	 arr[i][4]++;
             }  
             }
    }
	// 순위 정렬
	
	int[][] tmp = new int[5][5]; // 자리변경을 위한 임시배열 설정
	//int[] tmp = new int[5]; // 이렇게 써도 됨
	
    
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = i + 1; j < arr.length; j++) { //정렬을 하는 기본값
           
            if (arr[i][4] > arr[j][4]) {
            	   tmp[i] = arr[i];
                   arr[i] = arr[j];
                   arr[j] = tmp[i];
            }
        }
    }
    for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			if(j==3) {
				System.out.print((char)arr[i][j]+"\t");
			}else {
				System.out.print(arr[i][j]+ "\t");
			}
		}
		System.out.println();
	}
    //번호, 총점, 평균, 학점, 순위 순서대로 출력
//    for (int i = 0; i < arr.length; i++) {
//        System.out.print(arr[i][0]+"\t");
//        System.out.print(arr[i][1]+"\t");
//        System.out.print(arr[i][2]+"\t");
//        System.out.print((char)arr[i][3]+"\t");
//        System.out.print(arr[i][4]+"\t");
//        System.out.println();
//    }
//	
	
			
	}

}
