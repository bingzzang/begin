package hackerRank.easy;

import java.util.Scanner;

public class DataTypes {
	public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            try{
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                //byte
                if(x>=-128 && x<=127)System.out.println("* byte");
                //short
                if(x>=-32768 && x<=32767) System.out.println("* short");
                //int
                if(x>=(int)(Math.pow(-2, 31)) && x<=(int)(Math.pow(2, 31)-1)) System.out.println("* int");
                //long
                if(x>=(long)(Math.pow(-2, 63)) && x<=(long)(Math.pow(2, 63)-1)) System.out.println("* long");
                
            }catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
