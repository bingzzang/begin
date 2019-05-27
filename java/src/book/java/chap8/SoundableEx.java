package book.java.chap8;

public class SoundableEx{

	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] agrs) {
		printSound(new Cat());
		printSound(new Dog());
	}

}
