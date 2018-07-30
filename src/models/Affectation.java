package models;

import java.util.HashMap;

public class Affectation {
	private HashMap<Slot, Student> affectation;
	private int nbAffectationsToDo;

	public HashMap<Slot, Student> getAffectation() {
		return affectation;
	}

	public void setAffectation(HashMap<Slot, Student> affectation) {
		this.affectation = affectation;
	}
	
	public int getNbAffectationsToDo() {
		return nbAffectationsToDo;
	}
	public void setNbAffectationsToDo(int nbAffectationsToDo) {
		this.nbAffectationsToDo = nbAffectationsToDo;
	}
}
