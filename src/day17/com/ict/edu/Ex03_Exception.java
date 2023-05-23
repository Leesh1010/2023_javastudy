package day17.com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

// finally : 예외처리와 상관없이 반드시 실행 해야 되는 문장을 처리 할 때 사용 
//           주로 데이터베이스, 입/출력, 네트워크에서 사용
//		형식 : try{
//				예외 발생 가능한 문장들;
//				예외가 발생 되면 아래 문장들을 무시하고, catch문으로 이동한다.
//				예외 발생 가능한 문장들;
//				예외 발생 가능한 문장들;
//				} catch(발생한 예외객체 e){
//				예외 발생 시 처리하는 문장;
//				}
//				} catch(발생한 예외객체 e){
//				예외 발생 시 처리하는 문장;
//				}finally{
//               반드시 실행 해야 되는 문장;
// }
public class Ex03_Exception {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		try {	
			int su1 = 50;
			System.out.println("정수입력: ");
			int su2 = scan.nextInt();
			System.out.println("정답: " +(su1/su2));
			
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요");
		//	return; // main 메서드가 void기 때문에 리턴 사용 가능
		}catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
			//return;// 예외가 발생하여 해당문장이 실행 되면 리턴하여 JVM으로 감
		}finally {
			System.out.println("반드시 수행 되는 문장");
			scan.close();// 스캐너를 닫아줌 close는 finally에 써줌
		}
		System.out.println("수고하셨습니다.");
	} 
}
