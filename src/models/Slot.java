package models;

import java.util.HashMap;

// Créneau horaire, 1 jour et 1 heure précise avec 1 jury
public class Slot {
	private Hour hour;
	private Day day;
	private Jury jury;
	private Student student;
	private boolean full = false;
	
	public Slot(Day day, Hour hour, Jury jury) {
		this.day = day;
		this.hour = hour;
		this.jury = jury;
	}
	
	public void bookSlot(Student student) {
		this.setStudent(student);
		this.setFull(true);
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public boolean isFull() {
		return full;
	}

	public void setFull(boolean full) {
		this.full = full;
	}

}
