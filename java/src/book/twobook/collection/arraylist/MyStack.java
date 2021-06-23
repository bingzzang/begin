package book.twobook.collection.arraylist;

import java.util.ArrayList;

public class MyStack {

	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비어있음");
			return null;
		}
		return arrayStack.remove(len-1);
	}
}
