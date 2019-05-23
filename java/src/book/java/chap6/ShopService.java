package book.java.chap6;

public class ShopService {
	//객체 싱글톤 만들기
	
	private static ShopService singleton = new ShopService();
	
	private ShopService() {
		
	}
	
	static ShopService getInstance() {
		return singleton;
	}
	
}
