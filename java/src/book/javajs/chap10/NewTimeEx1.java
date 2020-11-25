package book.javajs.chap10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class NewTimeEx1 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();	// 오늘의 날짜
		LocalTime now = LocalTime.now();	// 현재 시간
		
		LocalDate birthDate = LocalDate.of(1993, 3, 3);
		LocalTime birthTime = LocalTime.of(21, 1, 59);
		
		System.out.println("today : "+today);
		System.out.println("now : "+now);
		System.out.println("birthDate : "+birthDate);
		System.out.println("birthTime : "+birthTime);
		
		System.out.println(birthDate.withYear(1992));
		System.out.println(birthDate.plusMonths(1));
		System.out.println(birthDate.plus(1, ChronoUnit.DAYS));
		
		// 21:01:59 -> 21:00 
		System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));
		
		// 특정 chronofield의 범위를 알아내는 방법
		System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range());
		System.out.println(ChronoField.HOUR_OF_DAY.range());
	}
	
}
