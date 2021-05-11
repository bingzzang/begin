package book.twobook.condition;

public class Lotto {

	public static void main(String[] args) {
		
		int [] lottoNums = new int[7];
		
		for(int i=0; i<lottoNums.length;i++) {
			lottoNums[i] = (int)(Math.random()*45)+1;
		}
		
		System.out.print("로또 번호 : ");
		for(int i=0; i<lottoNums.length;i++) {
			
			if(i==lottoNums.length-1) {
				System.out.println();
				System.out.println("보너스 번호 : "+lottoNums[i]);
			}else {
				System.out.print(lottoNums[i]+" ");
			}
		}
	}
}
