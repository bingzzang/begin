package book.javajs.chap06;

class Tv{
	String color;
	boolean power;
	int channel;
	
	void power(){
		power = !power;
	}
	void ChannelUp() {
		++channel;
	}
	void ChannelDown() {
		--channel;
	}
}