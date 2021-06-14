package book.twobook.polymorphism;

import java.util.ArrayList;

public class AnimalTest2 {

	ArrayList<Animal> list = new ArrayList<Animal>();
	
	public void addAnimal() {
		list.add(new Human());
		list.add(new Tiger());
		list.add(new Eagle());
		
		for(Animal ani:list) {
			ani.move();
		}
	}
	
	public void testCasting() {
		for(int i=0; i<list.size(); i++) {
			Animal ani = list.get(i);
			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			} else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			} else {
				Eagle e = (Eagle)ani;
				e.flying();
			}
		}
	}
	
	public static void main(String[] args) {
		AnimalTest2 at = new AnimalTest2();
		at.addAnimal();
		System.out.println("-----------------");
		System.out.println("원래 형으로 다운 캐스팅");
		System.out.println("-----------------");
		
		at.testCasting();
	}
}
