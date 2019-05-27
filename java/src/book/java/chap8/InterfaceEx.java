package book.java.chap8;

public interface InterfaceEx {

	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;	//상수
	
	//public static final이 생략 되더라도 컴파일 시에 자동적으로 붙음
	
	public void turnOn();
	public void turnOff();
	
	//추상메소드, 자동으로 abstract가 붙음(컴파일시)
}
