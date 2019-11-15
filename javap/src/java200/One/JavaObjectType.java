package java200.One;

import java.util.Calendar;
import java.util.Date;

public class JavaObjectType {
	// 참조 타입
	public static void main(String[] args) {
		//기본 타입의 배열은 참조 타입
		int [] m = {0,3,9};				//배열
		int [] n = new int[] {1,2,3};	//배열
		
		//참조 타입 - 객체 타입
		String com = "financial";	//문자열, 여러 문자(char)를 이용하여 만든 참조 타입
		Date d = new Date();	//날짜, 오늘
		Calendar cal = Calendar.getInstance();	//오늘
		
		//자동으로 toString()이 붙음
		System.out.println(com);	//initial.toString()
		System.out.println(d);			//d.toString()
		System.out.println(cal); 		//cal.toString()
	}

}
