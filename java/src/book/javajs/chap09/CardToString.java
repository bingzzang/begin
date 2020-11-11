package book.javajs.chap09;

public class CardToString {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());		//Object의 tostring은 해시코드를 반환하게 되어 있음
		System.out.println(c2.toString());
	}
}


 class Card{
	 String kind;
	 int number;
	 
	 Card(){
		 this("SPADE", 1);
	 }
	 
	 Card(String kind, int number){
		 this.kind = kind;
		 this.number = number;
		 
	 }
 }