package book.twobook.stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException{
		Person personRyu = new Person("류도롱", "주모");
		Person personDo = new Person("도동개", "의원");
		
		//직렬화
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(personRyu);
			oos.writeObject(personDo);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//역직렬화
		try (FileInputStream fis = new FileInputStream("serial.out");
			 ObjectInputStream ois = new ObjectInputStream(fis)){
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
