package day12.com.ict.edu;

public class Ex05_Constructor {
	// 생성자 : 클래스를 객체로 만들 때 한 번 호출된다.
	// 생성자 목적 : 멤버필드(변수와 상수)의 초기값 지정
	//      특징 : 생성자 이름은 클래스 이름이다. 
	//            반황형이 없는 메서드와 같다. 
	//            [접근제한자] 셍성자이름([인자]...){ 실행 내용}
	//            하나의 클래스에 여러개의 생성자를 가질 수 있다. (생성자 오버로딩)
	//            생성자가 없으면 객체 생성 할 때 기본 생성자를 호출한다. 
	//            기본 생성자란 인자가 없는 생성자를 말한다.
	
	// 값을 변경 하는 두가지 방법
	// 생성자 이용 : 객체 생성 시에 한 번만 가능 !!!!
	// setter 를 이용하여 변경 가능 !!
	
	private String name = "홍길동";
	private int age = 24;
	private String addr = "충청도";
	
	public Ex05_Constructor() { // <<기본생성자 생성 , 
		name = "일지매";           // 생성자를 이용하여 값을 변경함
		age= 29;
		addr = "전라도" ;
	}
	
	public Ex05_Constructor(String name) { // 애는 기본 생성자 아님, 이렇게 여러개의 생성자를 만드는 것이 
		this.name = name ;					// 생성자 오버로딩 @@@@
	
	}
	
	
	public Ex05_Constructor(String name, int age) {	// 또다른 생성자 !!! 
		this.name = name;
		this.age = age;
	}
	

	public Ex05_Constructor(String name, int age, String addr) { // 또 생성자 !!!!
		
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
