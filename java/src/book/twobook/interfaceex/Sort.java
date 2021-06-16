package book.twobook.interfaceex;

public interface Sort {

	public void ascending(int nums[]);
	
	public void descending(int nums[]);
	
	public default void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	}
}
