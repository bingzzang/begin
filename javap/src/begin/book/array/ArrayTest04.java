package begin.book.array;

public class ArrayTest04 {
	//오름차순 정렬
	public static void main(String[] args) {
		int num[] = {3, 10, 1, 28, 30, 8};
		int temp = 0;
		
		System.out.println("###Before Change###");
		for(int a=0;a<num.length;a++) {
			System.out.println("num["+a+"] : "+num[a]);
		}
		
		for(int i=0;i<num.length;i++) {
			for(int j=i;j<num.length;j++) {
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.println("###After Change###");
		for(int a=0;a<num.length;a++) {
			System.out.println("num["+a+"] : "+num[a]);
		}
	}
}
