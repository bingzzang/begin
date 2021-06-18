package book.twobook.object;

public class EqualTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "이곡길");
		Student studentLee2 = studentLee;
		Student studentGok = new Student(100, "이곡길");
		
		if(studentLee == studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같다.");
		} else {
			System.out.println("studentLee와 studentLee2의 주소는 다르다.");
		}
		
		if(studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 studentLee2는 동일하다.");
		}else {
			System.out.println("studentLee와 studentLee2는 동일하지 않다.");
		}
		
		if(studentLee == studentGok) {
			System.out.println("studentLee와 studentGok의 주소는 같다.");
		}else {
			System.out.println("studentLee와 studentGok의 주소는 다르다.");
		}
		
		if(studentLee.equals(studentGok)) {
			System.out.println("studentLee와 studentGok은 동일하다.");
		}else {
			System.out.println("studentLee와 studentGok은 동일하지 않다.");
		}
		
		System.out.println("studenLee의 hashCode : "+ studentLee.hashCode());
		System.out.println("studenGok의 hashCode : "+ studentGok.hashCode());
		
		System.out.println("studentLee의 실제 주소값 : "+ System.identityHashCode(studentLee));
		System.out.println("studentGok의 실제 주소값 : "+ System.identityHashCode(studentGok));
	}
}
