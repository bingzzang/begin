package book.java.chap08;

public interface RemoteControl {

	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;	//상수
	
	//public static final이 생략 되더라도 컴파일 시에 자동적으로 붙음
	
	public void turnOn();
	public void turnOff();
	public  void setVolume(int volume);
	//추상메소드, 자동으로 abstract가 붙음(컴파일시)
	
	//default method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		}else {
			System.out.println("무음 해제합니다");
		}
	}
	
	//static method
	static void changeBattery() {
		System.out.println("건전지를 교환합니다");
	}
}
