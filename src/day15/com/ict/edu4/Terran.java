package day15.com.ict.edu4;

public class Terran implements Unit{

	private String name;
	private int energy ;
	private boolean fiy ;
	
	public Terran() {
		
	}

	public Terran(String name, int energy, boolean fiy) {
		super();
		this.name = name;
		this.energy = energy;
		this.fiy = fiy;
	}
	
	// 공격 받으면 에너지가 떨어짐 (12씩 떨어짐)
	@Override
	public void decEnergy() {
		energy = energy -12;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public boolean isFiy() {
		return fiy;
	}

	public void setFiy(boolean fiy) {
		this.fiy = fiy;
	}
}
