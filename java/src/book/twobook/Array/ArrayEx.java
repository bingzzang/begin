package book.twobook.Array;

public class ArrayEx {

	public static void main(String[] args) {
	
		int sum = 0;
		
		int [] nums = new int[10];
		
		for(int i=0; i<nums.length;i++) {
			nums[i] = (int)(Math.random()*50)+1;
		}
		
		System.out.print("nums : [");
		for(int i=0; i<nums.length;i++) {
			System.out.print(nums[i]+", ");
			if(i==nums.length-1) {
				System.out.print(nums[i]);
			}
		}
		System.out.println("]");
		
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
		}
		System.out.println(sum);
	}
}
