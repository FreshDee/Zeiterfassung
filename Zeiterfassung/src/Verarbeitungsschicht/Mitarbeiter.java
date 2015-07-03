package Verarbeitungsschicht;

import java.io.Serializable;

public class Mitarbeiter implements Serializable {

	private int MA_ID;
	private String Name;
	private Position Pos;
	private String password;
	private double budget;
	public int getMA_ID() {
		return MA_ID;
	}
	public void setMA_ID(int mA_ID) {
		MA_ID = mA_ID;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public Position getPos() {
		return Pos;
	}
	
	public void setPos(Position pos) {
		Pos = pos;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public double getBudget() {
		return budget;
	}
	
	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	public Mitarbeiter(int mA_ID, String name, Position pos, String password,
			double budget) {
		super();
		MA_ID = mA_ID;
		Name = name;
		Pos = pos;
		this.password = password;
		this.budget = budget;
	}
	
	public String toString(){
		return "MA_ID: "+this.MA_ID+", Name: "+this.Name+", Budget: "+this.budget;
	}
	
}