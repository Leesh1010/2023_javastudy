package day12.com.ict.edu;

public class Ex08_Constructor {
	private String name = "물";
	private int price = 500;
	

	public Ex08_Constructor(String name, int price) { // 생성자 만듬 !!
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
