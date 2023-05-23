package day14.com.ict.edu;

public class Ex01_String {
	public static void main(String[] args) {
		String a1 = "ictedu";
		String a2 = "ictedu";
		String a3 = new String("ictedu");
		String a4 = new String("ictedu");
		char[] ch = {'i','c','t','e','d','u'};
		String a5 = new String(ch);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println();
		
		
		// == 객체의 주소가 같냐?
		if(a1==a2) {
			System.out.println("같다");
		}else {
			System.out.println("같지 않다.");
		}
		
		if(a1==a3) {
			System.out.println("같다");
		}else {
			System.out.println("같지 않다.");
		}
		
		if(a1==a4) {
			System.out.println("같다");
		}else {
			System.out.println("같지 않다.");
		}
		
		if(a1==a5) {
			System.out.println("같다");
		}else {
			System.out.println("같지 않다.");
		}
		
		System.out.println();
		a1 = a1+"대한민국";
		System.out.println(a1);
		System.out.println(a2);
		
		
	}
}
