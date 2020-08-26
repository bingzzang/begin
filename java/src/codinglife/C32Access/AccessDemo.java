package codinglife.C32Access;

public class AccessDemo {

	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.y());
//		System.out.println(a.z()); 에러
		System.out.println(a.x());
	}
}
