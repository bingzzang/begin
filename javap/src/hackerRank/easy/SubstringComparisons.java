package hackerRank.easy;

import java.util.Arrays;
import java.util.Scanner;

public class SubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		
		String words[] = new String[s.length()-k+1];
		
		for(int i=0;i<s.length()-k+1;i++) {
			words[i] = s.substring(i,i+k);
		}
		
		Arrays.sort(words);
		smallest = words[0];
		largest = words[s.length()-k];
		return smallest + "\n" + largest;
	}
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        
        System.out.println(getSmallestAndLargest(s, k));
    }
}
