package book.twobook.polymorphism;

public class AnimalTest {

	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	public static void main(String[] args) {
		AnimalTest at = new AnimalTest();
		at.moveAnimal(new Animal());
		at.moveAnimal(new Human());		// Animal ani = new Human();
		at.moveAnimal(new Tiger());
		at.moveAnimal(new Eagle());
	}
}
