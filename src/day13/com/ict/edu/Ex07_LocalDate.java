package day13.com.ict.edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex07_LocalDate {
	public static void main(String[] args) {
		// java version 8.0이상만 가능
		// LocalDate :날씨 정보만 필요할때
		// LocalTime :시간 정보만 필요할때
		// LocalDatTime : 날짜, 시간 모두 필요할때
		
		LocalDate cDate = LocalDate.now();
		System.out.println(cDate);
		
		
		
		LocalTime cTime = LocalTime.now();
		System.out.println(cTime);
		
		
		LocalDateTime cdt = LocalDateTime.now();
		System.out.println(cdt);
		
		
		
		
		
		
	}
}
