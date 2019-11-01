package basic.book.vol2;

public class Human {
	//상속예제 부모클래스
	
	private String sex;
	private String name;
	private int age;
	String job;
	
	public Human(String sex, String name, int age) {
		System.out.println("----------");
		System.out.println("성별 : "+sex );
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("----------");
		
		this.sex=sex;
		this.name=name;
		this.age=age;
	}
	
	public void walk() {
		name=this.name;
		System.out.println(name+"이(가) 걷고 있습니다");
	}
	
	public void work(String job) {
		name = this.name;
		System.out.println(name+"이(가) "+job+"이 되었습니다.");
	}
	
}
