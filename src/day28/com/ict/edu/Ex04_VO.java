package day28.com.ict.edu;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
//VO (Value Object) : 순수 데이터만 가지고 있고, get/set으러 구성
//객체의 정보를 담을 수 있는 멤버 변수로 구성되어야 한다.

// 객체 직렬화 하기


public class Ex04_VO implements Externalizable{
	private String name;
	private int age;
	private String addr;
	private boolean gender;
	private double height;
	
	
	public Ex04_VO() {
		
	}
	public Ex04_VO(String name, int age, String addr, boolean gernder, double height) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.gender = gender;
		this.height = height;
	}
	//직렬
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// 제외하고 싶은 멤버는 추가하지 않는다.
		out.writeObject(name);
		out.writeObject(age);
		out.writeObject(addr);
		out.writeObject(gender);
		out.writeObject(height);
	}
	//역직렬
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// 순서와 생갹도 직렬과 같게 하자
		name = (String) in.readObject();
		age = (int) in.readObject();
		addr = (String) in.readObject();
		gender = (boolean) in.readObject();
		height = (double) in.readObject();
		
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
