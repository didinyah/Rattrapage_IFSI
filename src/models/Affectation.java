package models;

import java.util.HashMap;

public class Affectation {
	private HashMap<Student, Slot> affectation;

	public HashMap<Student, Slot> getAffectation() {
		return affectation;
	}

	public void setAffectation(HashMap<Student, Slot> affectation) {
		this.affectation = affectation;
	}
}
