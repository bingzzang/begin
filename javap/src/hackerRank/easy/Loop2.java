package hackerRank.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loop2 {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        int result = 0 ;
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int nums[] = new int[b];
            
            for(int j=0;j<b;j++) {
            	for(int k=0;k<n;k++) {
            		result +=(int) (a+(Math.pow(2, k)*b));
            		
            	}
            	nums[j] = result;
            }
            for(int x=0;x<nums.length;x++) {
            	System.out.println(nums[x]);
            }
        }
     
        in.close();
    }
}
