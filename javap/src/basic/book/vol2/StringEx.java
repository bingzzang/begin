package basic.book.vol2;

public class StringEx {

	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMN";
		
		char ch1 = str.charAt(1);
		char ch2 = str.charAt(8);
		char ch3 = str.charAt(13);
		char ch4 = str.charAt(6);
		System.out.println(ch1+""+ch2+""+ch3+""+ch4);
		
		int len = str.length();
		System.out.println(len);
		
		int x = str.indexOf('F');
		System.out.println(x);
		
		String str2 = "OPQRSTUVWXYZ";
		
		StringBuffer sb = new StringBuffer(str);
		sb.append(str2);
		System.out.println(sb);
	}

}
