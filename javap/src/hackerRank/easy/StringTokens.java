package hackerRank.easy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokens {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        String ss []= s.split("[ !,?._'@]+");
        
        System.out.println(ss.length);
        
        for(int i=0;i<ss.length;i++) {
        	System.out.println(ss[i]);
        }
        
//        StringTokenizer st = new StringTokenizer(s, "[ !,?._'@]+");
//        
//        System.out.println(st.countTokens());
//        
//        while(st.hasMoreTokens()) {
//        	System.out.println(st.nextToken());
//        }
        scan.close();
    }
}
