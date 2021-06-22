package book.twobook.generics;

public class GenericTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> pp = new GenericPrinter<Powder>();
		
		pp.setMaterial(new Powder());
//		Powder p = pp.getMaterial();
//		System.out.println(pp);
		pp.printing();
		
		GenericPrinter<Plastic> plp = new GenericPrinter<Plastic>();
		plp.setMaterial(new Plastic());
//		Plastic pla = plp.getMaterial();
//		System.out.println(plp);
		plp.printing();
		
		
	}
}
