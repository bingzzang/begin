package book.java.chap10;

public class ClassCastExceptionExample {

	//억지로 타입 변환을 시도할 경우
	public static void main(String[] args) {
		Dog dog = new Dog();
		ChangeDog(dog);
		
		Cat cat = new Cat();
		ChangeDog(cat);
		
	}
	
	public static void ChangeDog(Animal animal) {
		//if(animal instanceof Dog) {
		//	Dog dog = (Dog) animal;
		}
	}


class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
