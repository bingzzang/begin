package app.dateApp;

import java.time.LocalDate;

public class DateCalculatorApp {

	public static void main(String[] args) {
		DateCalculatorImpl dci = new DateCalculatorImpl();
		
		
		dci.calculateInternationalAge(LocalDate.of(1990, 11, 21));
		
		dci.calculateKoreanAge(LocalDate.of(1993,3,3));
		
		dci.calculateDDay(LocalDate.of(2020,12,25));
	}
}
