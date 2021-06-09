package book.twobook.singleton;

public class Company {

	//유일한 instance생성
	private static Company instance = new Company();
	
	//생성자를 private로
	private Company() {
		
	}
	
	//외부에서 참조할 수 있는 public 메소드
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
