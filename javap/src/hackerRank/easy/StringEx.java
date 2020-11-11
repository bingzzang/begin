package hackerRank.easy;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(A.length()+B.length());
        
//        char as[] = A.toCharArray();
//        char bs[] = B.toCharArray();
//        
//        if(as[0]>bs[0]) {
//        	System.out.println("Y");
//        }else {
//        	System.out.println("N");
//        }
        
        char af = A.charAt(0);
        char bf = B.charAt(0);
        
        if(af>bf) {
        	System.out.println("Yes");
          }else {
          	System.out.println("No");
          }
        
        String result = (A.replace(A.charAt(0), Character.toUpperCase(af)))+" "+(B.replace(B.charAt(0), Character.toUpperCase(bf)));
        System.out.println(result);
	}
}
