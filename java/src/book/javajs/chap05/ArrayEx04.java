package book.javajs.chap05;

public class ArrayEx04 {

	public static void main(String[] args) {
		int[] num = new int[10];
		
		for(int i=0; i<num.length;i++) {
			num[i] = (int) (Math.random()*10);
		}
		
		for(int i=0;i<num.length-1;i++) {
			boolean changed = false; //자리바꿈이 있었는지 체크
			
			for(int k=0;k<num.length-1-i;k++) {
				if(num[k]>num[k+1]) {
					int temp = num[k];
					num[k] = num[k+1];
					num[k+1] = temp;
					changed = true;	//자리바꿈이 생기면 true
				}
			}
			if(!changed) break;
			
			for(int m=0; m<num.length;m++) {
				System.out.print(num[m]);
			}System.out.println();
		}
	}
}
