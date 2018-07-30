package models;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private List<UE> listUE;
	
	public Student(int id, String name, List<UE> listUE) {
		this.id = id;
		this.name = name;
		this.listUE = listUE;
	}
	
	public void addUE(UE ue) {
		this.listUE.add(ue);
	}
	
	public List<UE> getListUE() {
		return listUE;
	}
	public void setListUE(List<UE> listUE) {
		this.listUE = listUE;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
