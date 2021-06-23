package book.twobook.collection.arraylist;

import java.util.ArrayList;

public class MyQueue {

	ArrayList<String> queue = new ArrayList<String>();
	
	public void enQueue(String data) {
		queue.add(data);
	}
	
	public String deQueue() {
		int len = queue.size();
		if(len == 0) {
			System.out.println("큐가 비어있음");
			return null;
		}
		return queue.remove(0);
	}
}
