package basic.ex.method;

public class Cuboid {

	float v;
	
	float calVol(int x, int y, int h) {
		v = (float)x * (float)y *(float)h;
		
		return v;
		
	}
	public static void main(String[] args) {
		Cuboid c = new Cuboid();
		
		int width = 10;
		int length = 15;
		int height = 20;
		float volume = 0f;
		
		volume = c.calVol(width, length, height);
		System.out.println(volume);

	}

}
