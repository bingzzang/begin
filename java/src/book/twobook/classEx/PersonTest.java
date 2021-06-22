package book.twobook.classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {

	public static void main(String[] args) throws Exception{
		Class c = Class.forName("book.twobook.classEx.Person");
		
		Constructor[] cons = c.getConstructors();
		for(Constructor con : cons) {
			System.out.println(con);
		}
		
		System.out.println();
		
		Field[] fields = c.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		Method[] methods = c.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}
}
