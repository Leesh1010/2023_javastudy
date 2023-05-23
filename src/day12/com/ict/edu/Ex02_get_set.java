package day12.com.ict.edu;

public class Ex02_get_set {
	
	
	// 직접 접근을 막기 위해서 접근제한자(private)를 사용한다.
	// 전역변수와 지역변수의 이름이 같으면 전역변수에 this를 붙일것
	// 우선순위 = 지역변수>전역변수
	// get() / set()를 이용
	
	
	private String name = "홍길동";
	private int age = 24;
	private double weight = 72.6;
	private boolean gender = true;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; // this를 바꾸면 지역변수로 바뀜, 전역변수가 아닐 시 지역변수에 값을 줘도 초기값인 전역변수가 안바뀜 !!!
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isGender() { // boolean형만 get이 is로 나옴 !!!!!!!!!!
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
	
	
	
}
