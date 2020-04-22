package book.javajs.chap03;

public class TestEx02 {
	//사과를 담는데 필요한 바구니 수 구하기
	
	//사과의 수 123개, 하나의 바구니에는 10개의 사과를 담을 수 있다.
	
	public static void main(String[] args) {
		int apple = 123;
		int bucketSize = 10;
		int bucket;
		
		/*
		if(apple%bucketSize>0) {
			bucket = apple/bucketSize +1;
		}else {
			bucket = apple/bucketSize;
		}*/
		
		bucket = apple/bucketSize + (apple%bucketSize>0 ? 1 :0);
		
		System.out.println(bucket);
	}
}
