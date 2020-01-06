package begin.book.array;

public class MultiArray02 {
	public static void main(String[] args) {
		int [][] table;
		table = new int [5][5];
		int temp;
		
		
		for(int i=0;i<table.length;i++) {
			for(int j=0;j<table.length;j++) {
				table[i][j] = (int)(Math.random()*50);
			}
		}
		System.out.println("###before###");
		for(int i=0;i<table.length;i++) {
			for(int j=0;j<table.length;j++) {
				if(i+j>5) {
					System.out.print(table[i][j]+"\t");
				}
				
			}
			System.out.println("");
			
		}
		
		
		
	}
}
