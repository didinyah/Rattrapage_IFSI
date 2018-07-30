package models;

import java.util.HashMap;

// Créneau horaire, 1 jour et 1 heure précise avec 1 jury
public class Slot {
	private Hour hour;
	private Day day;
	private Jury jury;
	
	public Slot(Day day, Hour hour) {
		this.day = day;
		this.hour = hour;
	}
	
	public Hour getHour() {
		return hour;
	}
	public void setHour(Hour hour) {
		this.hour = hour;
	}
	public Day getDay() {
		return day;
	}
	public void setDay(Day day) {
		this.day = day;
	}

	public Jury getJury() {
		return jury;
	}

	public void setJury(Jury jury) {
		this.jury = jury;
	}

}
