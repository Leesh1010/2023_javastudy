package day17.com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

// 다중catch : 예외가 하나가 아닌 여러가지로 발생할 경우 사용
//   주의사항 : Exception을 사용할 경우 반드시 가장 아래 catch문에 사용
//	    형식 : try{
//				예외 발생 가능한 문장들;
//				예외가 발생 되면 아래 문장들을 무시하고, catch문으로 이동한다.
//				예외 발생 가능한 문장들;
//				예외 발생 가능한 문장들;
//				} catch(발생한 예외객체 e){
//				예외 발생 시 처리하는 문장;
//				}
//				} catch(발생한 예외객체 e){
//				예외 발생 시 처리하는 문장;
//				}
public class Ex02_Exception {
	public static void main(String[] args) {
		while(true) {
		try {
			Scanner scan = new Scanner(System.in); // 스캐너가 while문 밖에 있으면 문자 입력시 무한루프 돔. 밖으로 뺄거면 nextLine쓸것!!
			int su1 = 50;
			System.out.println("정수입력: ");
			int su2 = scan.nextInt();
			System.out.println("정답: " +(su1/su2));
			
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요");
		}catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
	}
		//System.out.println("수고하셨습니다.");
	}
}
