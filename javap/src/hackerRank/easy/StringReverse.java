package hackerRank.easy;

import java.io.*;
import java.util.*;

public class StringReverse {
	public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char ss[] = A.toCharArray();
        
        
        String tmp = "";
        
        for(int k=ss.length-1;k>=0;k--) {
        	tmp+=ss[k];
        }
        
        if(tmp.equals(A)) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
        
    }
}
