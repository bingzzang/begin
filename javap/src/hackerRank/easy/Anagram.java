package hackerRank.easy;

import java.util.Scanner;

public class Anagram {
	static boolean isAnagram(String a, String b) {
		char[] as = a.toCharArray();
		char[] bs = b.toCharArray();
		
		boolean chk = true;
		
		if(as.length==bs.length) {
			for(int i=0;i<as.length;i++) {
				if((int)as[i]<97) as[i] = (char) ((int)as[i]+32);
				if((int)bs[i]<97) bs[i] = (char) ((int)bs[i]+32);
			}
			
			java.util.Arrays.sort(as);
			java.util.Arrays.sort(bs);
			
			int count = 0;
			
			for(int i=0; i<as.length;i++) {
				if(as[i] == bs[i]) {
					count++;
				}
			}
			if(count == a.length()) {
				chk = true;
			}
		}else {
			chk = false;
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
