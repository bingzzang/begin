package book.java.chap11;

public class WrapperEx {

	void boxingUnboxingEx() {
		//Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		//Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
	
	void autoboxing() {
		//자동 Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
	
		//대입시 자동 Unboxing
		int value = obj;  	
		System.out.println("value: " + value);
		
		//연산시 자동 Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
	
	void stringToPrimitive() {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
	}
	public static void main(String[] args) {
		WrapperEx we = new WrapperEx();
//		we.boxingUnboxingEx();
//		we.autoboxing();
		we.stringToPrimitive();
	}

}
