package codingdojang.lev1;

import java.util.ArrayList;

public class MultipleOf3and5 {

	/*
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
	 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 * 
	 */
	
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		int total = 0;
		
		for(int i=1; i<100; i++) {
			if(i%3==0 || i%5==0) {
				nums.add(i);
			}
		}
		
		for(int k=0; k<nums.size();k++) {
			total +=nums.get(k);
		}
		
		System.out.println(total);
	}
}
