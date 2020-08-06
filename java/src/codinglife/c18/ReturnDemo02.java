package codinglife.c18;

public class ReturnDemo02 {

	public static String getmember01(){
		
		return "Rose";
	}
	public static String getmember02() {
		return "Shuhua";
	}
	
	public static String getmember03() {
		return "Wendy";
	}
	
	public static String[] getMembers() {
		String members[] = {"Rose", "Shuhua", "Wendy"};
		return members;
	}
	public static void main(String[] args) {
//		System.out.println(getmember01());
//		System.out.println(getmember02());
//		System.out.println(getmember03());
		
		String [] members = getMembers();
		
		for(String name : members) {
			System.out.println(name);
		}
	}
}
