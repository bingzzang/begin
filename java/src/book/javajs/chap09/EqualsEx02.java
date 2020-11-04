package book.javajs.chap09;

public class EqualsEx02 {

	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1==p2) System.out.println("p1과 p2는 같은 사람");
		else System.out.println("p1과 p2는 다른 사람");
		
		if(p1.equals(p2)) System.out.println("p1과 p2는 같은 사람");
		else System.out.println("p1과 p2는 다른 사람");
		
		String name = "a";
	}
}

class Person{
	long id;
	
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person) {
			return id == ((Person)obj).id;		//obj가 Object타입이므로 id값을 참조하기 위해서는 person타입으로 형변환이 필요함
		}else {
			return false;
		}
	}
	Person(long id){
		this.id= id;
	}
}
