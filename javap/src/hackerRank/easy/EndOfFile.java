package hackerRank.easy;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		
		String lines;
		
		while(sc.hasNext()) {
			lines = sc.nextLine();
			System.out.println(n+" "+lines);
			n++;
		}
	}
}
