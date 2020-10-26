package hackerRank.easy;

import java.util.Scanner;

public class Anagram2 {
	static boolean isAnagram(String a, String b) {
		
		if(a.length()!=b.length()) return false;
        
        boolean chk =true;
        char[] aa=a.toLowerCase().toCharArray();
        char[] bb=b.toLowerCase().toCharArray();
        
        java.util.Arrays.sort(aa);
        java.util.Arrays.sort(bb);
        

        for(int i =0;i<aa.length;i++){
            if(aa[i]!=bb[i]){
                chk=false;
                break;
            }
        }
        
        return chk;
    }

	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
//        test(a, b);
    }
}
