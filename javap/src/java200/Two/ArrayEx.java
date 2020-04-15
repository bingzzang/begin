package java200.Two;

public class ArrayEx {

	double latitude01 = 37.52127220511242;
	double longitude01 = 127.0074462890625;	//서울
	
	double latitude02 = 35.137879119634185;
	double longitude02 = 129.04541015625; 	//부산
	
	void geoPoint() {
		
		System.out.println("서울 : "+latitude01 + "\t"+longitude01);
		System.out.println("부산 : "+latitude02 + "\t"+longitude02);
		System.out.println("-----------------------------------------");
		
		//실수 1차원 배열
		double[] latlng01 = {latitude01, longitude01};
		double[] latlng02 = {latitude02, longitude02};
		
		System.out.println("서울 : "+latlng01[0]+"\t"+latlng01[1]);
		System.out.println("부산 : "+latlng02[0]+"\t"+latlng02[1]);
		
		//실수 2차원 배열
		double [][] latlng = {
				{latitude01, longitude01}, {latitude02, longitude02}
		};
		System.out.println("-----------------------------------------");
		System.out.println("서울 : "+latlng[0][0]+"\t"+latlng[0][1]);
		System.out.println("부산 : "+latlng[1][0]+"\t"+latlng[1][1]);
	}
	
	void exForGeo() {
	
		
		//객체
		
		Geo geo01 = new Geo();
		
		geo01.latitude = latitude01;
		geo01.longitude = longitude01;
		
		System.out.println("### 서울 ###");
		System.out.println(geo01.latitude+"\t"+geo01.longitude);
		System.out.println("");
		
		Geo geo02 = new Geo();
		
		geo02.latitude = latitude02;
		geo02.longitude = longitude02;
		
		System.out.println("### 부산 ###");
		System.out.println(geo02.latitude+"\t"+geo02.longitude);
	}
	public static void main(String[] args) {
		ArrayEx ae = new ArrayEx();
//		ae.geoPoint();
		ae.exForGeo();
	}

}
