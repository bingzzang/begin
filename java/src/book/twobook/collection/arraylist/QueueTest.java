package book.twobook.collection.arraylist;

public class QueueTest {

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		
		q.enQueue("A");
		q.enQueue("B");
		q.enQueue("C");
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}
}
