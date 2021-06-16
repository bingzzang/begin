package book.twobook.interfaceex;

public interface Queue {

	//먼저 들어온 자료 먼저 꺼내기
	
	void enQueue(String title);
	String deQueue();
	int getSize();
}
