package day28.com.ict.edu;

import java.io.Serializable;

// VO (Value Object) : 순수 데이터만 가지고 있고, get/set으러 구성
//                     객체의 정보를 담을 수 있는 멤버 변수로 구성되어야 한다.
public class Ex03_VO  implements Serializable{
	private String name ; 
	private int age ; 
	private String  addr; 
	private boolean gender ; 
	private double heighr ;

	public Ex03_VO(String name ,int age,String addr,boolean gender,double heighr) {
		super ();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.gender = gender;
		this.heighr = heighr;
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
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public double getHeighr() {
		return heighr;
	}
	public void setHeighr(double heighr) {
		this.heighr = heighr;
	} 

}
