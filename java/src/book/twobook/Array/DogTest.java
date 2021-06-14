package book.twobook.Array;

public class DogTest {

	public static void main(String[] args) {
		
		Dog[] dogs = new Dog[5];
		
		Dog dog1 = new Dog();
		dog1.setName("달곰");
		dog1.setType("말티즈");
		
		dogs[0] = dog1;
		
		Dog dog2 = new Dog();
		dog2.setName("동개");
		dog2.setType("포메");
		
		dogs[1] = dog2;
		
		Dog dog3 = new Dog();
		dog3.setName("참새");
		dog3.setType("비글");
		
		dogs[2] = dog3;
		
		Dog dog4 = new Dog();
		dog4.setName("호랭");
		dog4.setType("비숑");
		
		dogs[3] = dog4;
		
		Dog dog5 = new Dog();
		dog5.setName("루미");
		dog5.setType("진돗개");
		
		dogs[4] = dog5;
		
		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}
	}
}
