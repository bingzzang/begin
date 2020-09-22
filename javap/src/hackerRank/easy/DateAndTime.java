package hackerRank.easy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {
	/*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
	public static String findDay(int month, int day, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DATE, day);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String w = null;
		
		switch(dayOfWeek) {
		case 1:
			w="SUNDAY";
			break;
		case 2:
			w="MONDAY";
			break;
		case 3:
			w="TUESDAY";
			break;
		case 4:
			w="WEDNESDAY";
			break;
		case 5:
			w="THURSDAY";
			break;
		case 6:
			w="FRIDAY";
			break;
		case 7:
			w="SATURDAY";
			break;	
		}
		
		return w;
	}
}
