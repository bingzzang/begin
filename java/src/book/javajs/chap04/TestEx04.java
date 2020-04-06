package book.javajs.chap04;

public class TestEx04 {

	public static void main(String[] args) {
		//1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
		//100이상이 되는지 구하시오.
		
		int i=0;
		int sum=0;
		
		while(sum<100) {
			
			if(i%2!=0) {
				sum +=i;
			}else { sum -=i;}
			
			i++;
		}
		System.out.println(i-1);
		System.out.println(sum);
		System.out.println("---------");
		
		int total = 0;
		int x = 0;
		int s = 1; //for 부호
		
		for(int j = 1;true;j++,s=-s) {
			x = s* j;
			total +=x;
			
			if(total>=100) break;
		}
		
		System.out.println(total+"(total)");
		System.out.println(x+"(x)");
	}
}
