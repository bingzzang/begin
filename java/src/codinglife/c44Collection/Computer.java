package codinglife.c44Collection;

class Computer implements Comparable{

	int serial;
	String owner;
	
	Computer(int serial, String owner){
		this.serial = serial;
		this.owner = owner;
	}

	@Override
	public int compareTo(Object o) {
		return this.serial - ((Computer)o).serial;
	}
	
	public String toString() {
		return serial+" "+owner;
	}
	
}
