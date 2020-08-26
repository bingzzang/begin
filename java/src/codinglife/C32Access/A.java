package codinglife.C32Access;

class A {

	public String y() {
		return "public void y()";
	}
	
	private String z() {
		return "public void z()";
	}
	
	public String x() {
		return z();
	}
}
