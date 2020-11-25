package book.javajs.chap11;

import java.util.Vector;

public class VectorEx1 {

	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size : "+v.size());
		System.out.println("capacity : "+v.capacity());
	}
	
	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		System.out.println();
		
		v.trimToSize(); 	//빈공간 없애기(용량=크기)
		System.out.println("==After trimToSize()==");
		print(v);
		
		System.out.println();
		
		v.ensureCapacity(6);
		System.out.println("==After ensureCapacity(6)==");
		print(v);
		System.out.println();
		
		v.setSize(7);
		System.out.println("==After setSize(7)==");
		print(v);
		System.out.println();
		
		v.clear();
		System.out.println("==After clear()==");
		print(v);
	}
}
