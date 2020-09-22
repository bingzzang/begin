package app.test;

import java.util.Arrays;

public class lengthtest {
	public static void main(String[] args) {
		String s = "welcometojava";
		int k = 3;
		int len = s.length();
		System.out.println(len);
		String[] ss = new String[s.length()-k+1];
		for(int i=0;i<s.length()-k+1;i++) {
			ss[i] = s.substring(i,i+k);
		}
		
		Arrays.sort(ss);
		for(int j=0;j<ss.length;j++) {
			System.out.println(ss[j]);
		}
	}
}
