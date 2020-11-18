package app.dateApp;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateCalculatorImpl2 implements DateCalculator {

	  @Override
	  public void calculateInternationalAge(LocalDate ldt) {

	    LocalDate today = LocalDate.now();
	    Period between = Period.between(ldt, today);
	    System.out.println(between.getYears());

	  }

	  @Override
	  public void calculateKoreanAge(LocalDate ldt) {
	    LocalDate today = LocalDate.now();
	    int koreanAge = today.getYear() - ldt.getYear() + 1;
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

	    if ("Y".equalsIgnoreCase(line))
	      dday++;

	    if (dday < 0) {
	      System.out.println(String.format("D%d", dday));
	    } else {
	      System.out.println(String.format("D+%d", dday));
	    }


	  }

	  public static void main(String[] args) {
		  DateCalculatorImpl2 dci2 = new DateCalculatorImpl2();

		    dci2.calculateInternationalAge(LocalDate.of(1993, 3, 3));

		    dci2.calculateKoreanAge(LocalDate.of(1993, 3, 3));

		    dci2.calculateDDay(LocalDate.of(2022, 11, 30));
	}
	    
}
