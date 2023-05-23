package day07.com.ict.edu;

import java.util.Iterator;

public class Ex01 {
public static void main(String[] args) {
						//ㄴ []배열이라는 뜻 
	
	// String 클래스는 문자열을 처리하는 클래스
	// 기본자료형은 아니지만 기본자료형 처럼 사용
	// Shift + alt +f2 눌러서 API 열기.
	// 괄호가 있으면 메서드
	// String에서 자주 사용되는 메서드들
	// 메서드(인자) : 실행 결과의 자료형
	
	
	
	// 7. getBytes() : byte[]
	// 해당 문자열을 byte[]로 변환 시킨다.
	// 보통 입출력 할 때 사용한다. (대/소문자,숫자,일부특문만 가능(아스키코드), 영어를 제외한 글자 안됨)
	
	String a1 ="java";
	byte[] b1 = a1.getBytes();
	System.out.println(b1[0]); //j의 숫자
	System.out.println(b1[1]); //a의 숫자
	System.out.println(b1[2]); //v의 숫자
	System.out.println(b1[3]);//a의 숫자
	System.out.println("==============");
	
	for (int i = 0; i < b1.length; i++) { //for문을 생성하면 자동으로 값이 생성됨
		System.out.println((char)b1[i]); //(char)로 형변환 하면 문자로 확인 가능!!
	}
	
	// 8.hashCode() : int;
	// 일반적인 hashCode는 객체의 주소값을 변환하여 생성한 객체의 고유한 정수값
	//String hashCode는 각 문자열에서 정수값으로 변경
	
	String a2 = "홍길동"; 
	System.out.println(a2.hashCode());
	
	String a3 = "홍길동";
	System.out.println(a3.hashCode());
	
	//hashCode에 위처럼 같은 값이 저장되면 두개의 지정어에 하나의 값이 저장됨
	
	//문자열일때 == 주소가 같냐? 
	System.out.println(a2==a3);
	// 문자열일 때 equals (내용이 같냐?)
	System.out.println(a2.equals(a3));
	
	
	System.out.println("==============");
	// 9.indexOf(int ch), indexOf(String str) : int => 문자를 넣으면 위치를 해당 문자의 위치를 찾아옴
	// 찾는 문자나 문자열이 없으면 -1로 반환
	// charAt() -> 지정된 위치의 문자열을 찾아옴
	String a4 = "BufferedReader";
	
	//'R'을 찾아라
	System.out.println(a4.indexOf('R'));
	//'r'을 찾아라
	System.out.println(a4.indexOf('r'));
	//'k'를 찾아라
	System.out.println(a4.indexOf('k'));//"BufferdReader"에 'k'가 없으니 '-1'로 반환됨
	//'er'을 찾아라
	System.out.println(a4.indexOf("er")) ; //문자열은 "" 사용해야 함 !!!!!@@@@@
	
	System.out.println("==============");
	//10. lastIndexOf(int ch), lastIndexOf(String str): int
	//입력된 char,String을 해당 문자열에 char나 String의 마지막 위치값을 알려준다.
	
		//'R'을 찾아라
		System.out.println(a4.lastIndexOf('R'));
		//'r'을 찾아라
		System.out.println(a4.lastIndexOf('r'));
		//'k'를 찾아라
		System.out.println(a4.lastIndexOf('k'));//
		//'er'을 찾아라
		System.out.println(a4.indexOf("er")) ; 
		
		System.out.println("==============");
		//11. indexOf(int ch, int fromIndex). indexOf(String str, int fromIndex): int
		//2번째, 3번째 문자나 문자열 찾기 위함
		// fromIndex => 시작 위치값
		System.out.println(a4.indexOf('e', 0));// (a4.indexOf('R')); 와 같은 내용
		
		//첫 번째 'e'의 위치가 4로 나왔다.
		System.out.println(a4.indexOf('e', 5));
		System.out.println(a4.indexOf('e', a4.indexOf('e', 0)+1));
		
		//두 번째 'e'의 위치는 6이 나와서 7부터 시작
		System.out.println(a4.indexOf('e', 7));
		System.out.println(a4.indexOf('e',a4.indexOf('e', a4.indexOf('e', 0)+1)+1));
	
		
		System.out.println("==============");
		//12. length() : int => 문자열의 길이(갯수) => 1부터 시작
		//                		문자열의 위치(index)=> 0부터 시작
		System.out.println(a4.length());
		
		
		System.out.println("==============");
		//13. replace(char oldChar, char nexChar) : String
		//    replace(String oldChar, String nexChar) : String
		// 새로운 문자나 문자열을 받아서 치환(바꾸기) 한다.
		
		String a5 = "대한민국";
		String a6 = a5.replace('한', '韓');
		String a7 = a5.replace("한", "한 ♥ ");// 한글자에서 한글자 바꿀때는 '' 써도 됨 한글자에서 여러글자는 "" 써야함
		System.out.println(a6);				// ㄴ 이게 헷갈리면 그냥 항상 "" 이거 쓰삼
		System.out.println(a7);		
		
		
		
		// 이름의 가운데 * / 번호에 마지막 *
		String k1 = "홍길동";
		String k2 = "010-1234-5678";
		String k3 = k1.replace('길', '*');
		String k4 = k2.replace("5678", "****");
		System.out.println(k3);
		System.out.println(k4);
		
		System.out.println("==========");

		
	
		
		// 이름의 첫번째와 마지막을 제외하고 *찍기
		String n = "홍길동";
		int t1 = n.length(); //이름의 길이 구하는 법
		String res = "";
		for (int i = 0; i < t1; i++) {
			char s = n.charAt(i); // 이름을 구함
			if(i==0 || i== t1-1) { 
				res += s;
			}else {
				res+= "*";
			} 
		} System.out.println("결과 : " +res);

		
		
		System.out.println("==========");
		// 전화 번호 끝에 네자리 ****
		
		n = "010-1234-5678";
		int t2 = n.length();
		int t3 = n.lastIndexOf("-");
		res = "";
		for (int i = 0; i < t2; i++) {
			char s = n.charAt(i); // 문자열을 하나씩 찾아오는 방법 charAt!!!!!
			if(i>=0 && i<=t3) {
				res += s;
			}else {
				res+= "*";
			} 
		} System.out.println("결과 : " +res);
		
		
		
		
		
		System.out.println("==========");
		
		n = "010-1234-5678";
		 t2 = n.length();
		 t3 = n.indexOf("-");
		 int t4 = n.lastIndexOf("-");
		res = "";
		for (int i = 0; i < t2; i++) {
			char s = n.charAt(i); // 문자열을 하나씩 찾아오는 방법 charAt!!!!!
			if(i>=t3+1 && i<=t4-1) {
				res += "*";
			}else {
				res += s;
			} 
		} System.out.println("결과 : " +res);
		
		System.out.println("==========");
		
		//14. isEmpty() : boolean
		// 해당 문자열이 비어있으면 true, 내용이 있으면 false
		String t5 = "HelloWorld";
		System.out.println(t5.isEmpty());
		
		t5 = "";
		System.out.println(t5.isEmpty());
		
		
		System.out.println("==========");
		//15. split(String regex): String[]
		//    split(String regex), int limit): String[]     
		// regex => 구분자 (나눌 기준), / limit => 배열의 크기(방의 갯수)
		
		t5 = " 사과, 딸기, 망고, @ 오렌지, 두리안, 용과";
	
		String[] arr = t5.split(","); 	// regex = ","=>기준으로 나누었으며 방이 생성 => 생성된 방에는 번호가 생김 
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]); // 이런식으로 직접적으로 구하게 되면 오류가 나기 쉬움
		
		for (int i = 0; i < arr.length; i++) { // length 글자의 갯수를 구함 1부터 시작
			System.out.println(arr[i]);
		}
		
		System.out.println("==========");
		String[] arr2 = t5.split(",",3); //limit = 방 갯수를 내가 지정할 수 있으며 차례대로 입력 되다 남은 방 하나에 나머지 입력 값이 다 들어감
		
		for (int i = 0; i < arr2.length; i++) { // length 글자의 갯수를 구함 1부터 시작
			System.out.println(arr2[i]);
		}
		
		//16. substring(int beginIndex) : String
		// 입력된 시작위치부터 끝까지 문자열 추출
		
		String t6 = "010-9732-9110";
		String t7 = t6.substring(4);
		System.out.println(t7);
		
		t7 = t6.substring(9);
		System.out.println(t7);
		
		t7=t6.substring(t6.lastIndexOf(t6));
		//System.out.println();
		
		
		System.out.println("==========");
		//16-2 substring(int beginIndex, int endIndex) : String
		//beginIndex 위치부터  int endIndex 위치까지 ( int endIndex 위치는 포함하지 않는다.)
		//0000년00월00일ㅇㅇ시ㅇㅇ분ㅇㅇ초 = > .substring(0, 10); 사용하여 시,분,초를 날려버림~!
		
		t6 = "010-9732-9110";
		t7 = t6.substring(4, 8); // ()안에 숫자 중 뒤에 숫자중 앞에 숫자를 빼면 출력되는 글자의 수를 알수 있음
		System.out.println(t7);
		
		t7 = t6.substring(0, 1);
		System.out.println(t7);
		
		// 010-9732-9110 => 010-****-9110, 010-9732-****
		String t8 = "010-9732-9110";
		String t9 = "****";
		String t10 = t8.replace(t8.substring(4, 8),t9);
		System.out.println(t10);
		
		t10 = t8.replace(t8.substring(t8.indexOf("-")+1, t8.lastIndexOf("-")),t9);
		System.out.println(t10);
		
		t10 = t8.replace(t8.substring(9,13),t9);
		System.out.println(t10);
		
		t10 = t8.replace(t8.substring(t8.lastIndexOf("-")+1),t9);
		System.out.println(t10);
		
		System.out.println("==========");
		String[] arr3 = t8.split("-"); // 이렇게는 안씀
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[0]+ "-****-" +arr3[2]);
		
		//17 toLowerCase() : String => 해당 문자열을 모두 소문자로 변경
		//   toUpperCase() : String => 해당 문자열을 모두 대문자로 변경
		String str1 = "javaLand03Exam";
		String	str2 = "";
		for (int i = 0; i < str1.length(); i++) {
			char k =str1.charAt(i);
			// 다 대문자 만들기
			// 소문자 => 대문자로 변경
			if(k>='a' && k<='z') {
				str2 = str2 + (char)(k-32); // 대문자와 소문자는 32차이남
			}else {
				//나머지는 그대로 출력
				str2 = str2 +k ;
			}
			
		}
			System.out.println(str2);
		
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
	
		
		// 18. toString : Sting
		// 객체(클래스)에서 toString : 모든 클래스(객체)에서 사용 가능한 메서드
		//                        클래스(객체)가 가지고 있는 정보나 값(데이터)들을 
		//                        문자열로 만들어서 반환하는 메서드
		//String에서의 toString : 문자열 자체 반환
		
		String u1= "java 11 자바 11";
		String u2= u1.toString();
		System.out.println(u1);
		System.out.println(u2);
		
		//19. trim() : String
		// 해당 문자열의 앞, 뒤 공백 제거, 글자사이의 공백은 제거 못함
		String u3 = "      java           자바            JAVA      ";
		System.out.println("길이: " + u3.length());
		
		String u4 = u3.trim();
		System.out.println("길이: " + u4.length());
		System.out.println(u4);
		
		
		
		
		System.out.println("===================");
		//20.startSwitch(String prefix) : boolean
		//    주어진 문자열로 시작하는지 검사
		
		//  startSwitch(String prefix, int toffset) : boolean
		//    주어진 문자로 시작하는지 검사, toffset => 시작위치
		
		//   endWich(String suffix) : boolean
		//     주어진 문자로 끝났는지 검사
		
		String u5 = "java   자바   JAVA";
		System.out.println(u5.startsWith("JAVA"));
		System.out.println(u5.startsWith("java"));
		System.out.println(u5.startsWith("자바"));
		System.out.println();
		
		System.out.println(u5.endsWith("JAVA"));
		System.out.println(u5.endsWith("java"));
		System.out.println(u5.endsWith("자바"));
		
		System.out.println("===================");
		
		//21. valueOf(기본자료형) : 들어온 기본 자료형을 String을 변경 시킴
		boolean bo1 = true;
		char ch1 = 'a';
		int num1 = 34;
		long num2 = 37L;
		double num3 = 345.127;
		
		System.out.println(bo1);
		System.out.println(ch1);
		System.out.println(num1 );
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("===========");
		
	
		System.out.println(ch1+1);
		System.out.println(num1 +1);
		System.out.println(num2+1);
		System.out.println("=============");
		
		System.out.println(String.valueOf(bo1)+1);
		System.out.println(String.valueOf(ch1)+1);
		System.out.println(String.valueOf(num1)+1);
		System.out.println(String.valueOf(num2)+1);
		System.out.println(String.valueOf(num3)+1);
		
		System.out.println("=============");
		
		
		System.out.println(bo1+""+1);
		System.out.println(ch1+""+1);
		System.out.println(num1 +""+1);
		System.out.println(num2+""+1);
		System.out.println(num3+""+1);
		
		//22.Wrapper Class
		//    기본자료형의 형태를 가진 문자열을 해당 자료형으로 변경시키는 클래스들
		
		// 22-1. "true",  "false" = > true, false : Boolean.perseBoolea()
		String msg = "ture";
		boolean msg2= Boolean.parseBoolean(msg);
		System.out.println(msg); // "true"
		System.out.println(msg2);// true
		
		if(msg2) {
			System.out.println("변경1");
		}else {
			System.out.println("변경2");
		}
		
		//22-2. "142"."25" => 142,25 => Integer.parseInt()
		msg = "142";
		int msg3 =Integer.parseInt(msg); // 142 => 기존 문자열이던 "142"를 숫자 142로 변경 
		System.out.println(msg+10); //14210
		System.out.println(msg3 + 10); //152
		
		// 22-3. "123213", " 3423423" => 123213, 3423423 =>Long.paeseLong();
		//         "숫자" =?> OK, "숫자L"=>err
		msg = "12312312312312";
		long msg4 = Long.parseLong(msg);
		System.out.println(msg+9); // +9가 실제로 더해지지 않고 msg+9로 나옴
		System.out.println(msg4+9);
		
			
		// 22-4. "347.457" => 347.457 => Double.parseDouble()
		msg = "347.457";
		double msg5 = Double.parseDouble(msg);
		System.out.println(msg+0.04);
		System.out.println(msg5+0.04);
		
		
		
		// 22-5. Charcter.parseCharter은 없다 !!!
		//         String의 charAt() 이용하면 char을 가져올 수 있다.
		msg ="p";
		char msg6 = msg.charAt(0);
		System.out.println(msg6);
		
		
		////////////////////////////////////
		msg = "java 자바 JAVA 대한민국 2023 %*";
		// String.getBytes() => byte[](영문자 대/소문자, 숫자 및 일부 특문만 사용가능)
		byte[] result = msg.getBytes(); //각 방마다 숫자로 한글자씩 저장되어 있음
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i] +" : " +(char)(result[i])); // '32'는 띄어쓰기 . 한글은 ' - ' 표기 
			
		}
		
		//String.toCharArray() => char[] 모든 문자 처리 가능
		char[] result2 = msg.toCharArray();
		for (int i = 0; i < result2.length; i++) {
		System.out.println(result2[i]);
		}
		
		
		
}
}
