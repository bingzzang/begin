package book.twobook.interfaceex;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException{
		
		System.out.println("정렬 방식을 선택하세요.");
		System.out.println("Q : Quick Sort");
		System.out.println("B : Bubble Sort");
		System.out.println("H : Heap Sort");
		
		int ch = System.in.read();
		
		Sort sort = null;
		
		if(ch=='Q' || ch=='q') {
			sort = new QuickSort();
		}else if(ch=='B' || ch=='b') {
			sort = new BubbleSort();
		}else if(ch=='H' || ch=='h') {
			sort = new HeapSort();
		}else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
		int[] nums = new int[10];
		
		sort.ascending(nums);
		sort.descending(nums);
		sort.description();
	}
}
