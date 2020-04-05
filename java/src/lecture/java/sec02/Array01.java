package lecture.java.sec02;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[5];
		//배열에서는 모든 데이터의 자료형이 동일해야 함
		
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		for(int i=0; i<arr1.length;i++) {
			System.out.println("arr1["+i+"] = "+arr1[i]);
		}
		System.out.println();
		
		int[] arr2 = {200, 100, 234, 340, 484};
		
		for(int i=0; i<arr2.length;i++) {
			System.out.println("arr2["+i+"] = "+arr2[i]);
		}
	}

}
