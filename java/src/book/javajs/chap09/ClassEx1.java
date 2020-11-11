package book.javajs.chap09;

public class ClassEx1 {

	public static void main(String[] args) throws Exception{
		Card3 c = new Card3("HEART", 3);		//new 연산자로 객체 생성
		Card3 c2 = Card3.class.newInstance();	//class객체로 객체 생성
		
		Class obj = c.getClass();
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(obj.getName());
		System.out.println(obj.toGenericString());
		System.out.println(obj.toString());
	}
}

final class Card3 {
	String kind;
	int num;
	
	Card3(){
		this("SPADE", 1);
	}
	Card3(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		return kind + ":"+num;
	}
}
