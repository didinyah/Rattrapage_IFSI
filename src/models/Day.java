package models;

// Day with the number of available jurys
public class Day {
	private DayEnum day;
	private int availableJurys;
	
	public DayEnum getDay() {
		return day;
	}
	public void setDay(DayEnum day) {
		this.day = day;
	}
	public int getAvailableJurys() {
		return availableJurys;
	}
	public void setAvailableJurys(int availableJurys) {
		this.availableJurys = availableJurys;
	}
}
