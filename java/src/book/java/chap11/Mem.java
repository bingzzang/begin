package book.java.chap11;

public class Mem implements Cloneable{	//복제할 수 있단 표시
	
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Mem(String id, String name, String password, int age, boolean adult) {
		//super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Mem getMember() {
		Mem cloned = null;
		try {
			cloned = (Mem) clone();	//clone()메소드의 리턴 타입은 object이므로 mem타입으로 캐스팅해야함
		} catch (CloneNotSupportedException e) {
			
		}
		return cloned;
	}
	

}
