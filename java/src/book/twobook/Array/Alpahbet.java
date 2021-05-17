package book.twobook.Array;

public class Alpahbet {

	public static void main(String[] args) {
		char[][] al = {{'a', 'b'}
				  , {'c', 'd'}
				  , {'e', 'f'}
				  , {'g', 'h'}
				  , {'i', 'j'}
				  , {'k', 'l'}
				  , {'m', 'n'}
				  , {'o', 'p'}
				  , {'q', 'r'}
				  , {'s', 't'}
				  , {'u', 'v'}
				  , {'w', 'x'}
				  , {'y', 'z'}};
		
		for(int i=0;i<al.length;i++) {
			for(int j=0;j<al[i].length;j++) {
				System.out.print(al[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
