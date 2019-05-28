package book.java.chap05;

import java.util.Calendar;

import book.java.chap05.Enumex.week;


public class Cal {
	public enum weeks{
		일요일,
		월요일,
		화요일,
		수요일,
		목요일,
		금요일,
		토요일
	}
	void m1() {
		weeks today=null;
		Calendar now = Calendar.getInstance();
		
		
		int year = now.get(Calendar.YEAR);	//년
		int month = now.get(Calendar.MONTH)+1;	//월(1~12)
		int day = now.get(Calendar.DAY_OF_MONTH);	//일
		int week = now.get(Calendar.DAY_OF_WEEK);	//요일(1-7)
		int hour = now.get(Calendar.HOUR);	//시간
		int minute = now.get(Calendar.MINUTE); 		//분
		int second = now.get(Calendar.SECOND);		//초
		
		switch(week) {
		case 1:
			today = weeks.일요일;break;
		case 2:
			today = weeks.월요일;break;
		case 3:
			today = weeks.화요일;break;
		case 4:
			today = weeks.수요일;break;
		case 5:
			today = weeks.목요일;break;
		case 6:
			today = weeks.금요일;break;
		case 7:
			today = weeks.토요일;break;
		}
		System.out.println(year+"년 "+month+"월 "+day+"일 "+today);
		System.out.println(hour+"시 "+minute+"분 "+second+"초");
	}
	
	void m2() {
		weeks day1 = weeks.일요일;
		weeks day2 = weeks.수요일;
		
		int result1 = day1.compareTo(day2); //day2를 기준으로 day1의 위치
		int result2 = day2.compareTo(day1);	//day1을 기준으로 day2의 위치
		
		System.out.println(result1);	//-3
		System.out.println(result2);	//3
		
	}
	
	void m3() {
		weeks[] days = weeks.values();
		for(weeks day : days) {
			System.out.println(day);
		}
	}
	public static void main(String[] args) {
		Cal ca = new Cal();
//		ca.m1();
//		ca.m2();
		ca.m3();

	}

}
