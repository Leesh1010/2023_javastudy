package day11.com.ict.edu;

public class Ex00_method {
	String name = "";
	int kor = 0;
	int eng = 0;
	int math = 0;
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	int rank = 1;
	
	
	
	//총점 구하는 메서드 //답을 구해서 반환값을 줘야함으로 void 사용 x
	public int getSum() {
		sum =  kor + eng + math;
		return sum;
	}
	//평균 구하는 메서드
	public double getAvg() {
		avg = (int)((sum/3.0*10)/10.0);
		return avg;
	}
	//학점 구하는 메서드
	public String getHak() {
		if(avg>=90) {
			hak = "A학점";	
		}else if(avg>=80) {
			hak = "B학점";
		}else if(avg>=70) {
			hak = "C학점";
	}else {
		hak = "F학점";
	}
		return hak;
	
}

}
