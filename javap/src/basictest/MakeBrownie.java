package basictest;

public class MakeBrownie {

	int brownie;
	
	int bake(int butter, int chocolate, int mixnut, int vanilla, int egg) {
		brownie = chocolate + butter + egg + vanilla + mixnut;
		
		return brownie/5;
	}
	public static void main(String[] args) {
		
		MakeBrownie mb = new MakeBrownie();
		int cnt = mb.bake(1, 1, 1, 1, 1);
		System.out.println(cnt);
	}

}
