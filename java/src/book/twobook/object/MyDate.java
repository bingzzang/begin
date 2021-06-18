package book.twobook.object;

public class MyDate {

	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return year +"-"+month+"-"+day;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate md = (MyDate)obj;
			if(this.year == md.year && this.month == md.month && this.day == md.day) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}
