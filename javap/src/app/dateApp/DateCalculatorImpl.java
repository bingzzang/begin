package app.dateApp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateCalculatorImpl implements DateCalculator {

	
	
	@Override
	public void calculateInternationalAge(LocalDate ldt) {
		
		LocalDate today = LocalDate.now();
		
		int monthOfToday = today.getMonthValue();
		int monthOfBday = ldt.getMonthValue();
		
		int dayOfToday = today.getDayOfMonth();
		int dayOfBday = ldt.getDayOfMonth();
		
		int age = today.minusYears(ldt.getYear()).getYear();
		
		if(monthOfToday<= monthOfBday) {
			if(dayOfToday<dayOfBday) {
				System.out.println(age-1);
			}else {
				System.out.println(age);
			}
		}else {
			System.out.println(age);
		}

		
	}

	@Override
	public void calculateKoreanAge(LocalDate ldt) {
		
		LocalDate today = LocalDate.now();
		
		int koreanAge = today.minusYears(ldt.getYear()).getYear()+1;
		
		System.out.println(koreanAge);
	}

	@Override
	public void calculateDDay(LocalDate ldt) {

		LocalDate today = LocalDate.now();
		
		System.out.println("당일 포함할건지?(Y/N)");
		System.out.print("> ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		long dday = ChronoUnit.DAYS.between(ldt, today);
		
		if("Y".equalsIgnoreCase(line)) {
			if(dday<0) {
				System.out.println("D"+dday+1);
			}else {
				System.out.print("D+");
				System.out.println(dday+1);
			}
		}else {
			System.out.println("D"+dday);
		}
		
	}

}
