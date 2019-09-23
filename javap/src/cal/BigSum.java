package cal;

import java.util.Scanner;

public class BigSum {
	    double a;
	    double b;
	    double sum;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    void sum() {
	    	a = sc.nextDouble();
	    	b = sc.nextDouble();

	    	sum = (double) a+b;
	    	System.out.println(sum);
	    }
	    public static void main(String[] args){
		     BigSum bs = new BigSum();
		     bs.sum();
	        
	    }
}
