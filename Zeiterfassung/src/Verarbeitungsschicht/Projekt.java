package Verarbeitungsschicht;

public class Projekt {
	
	private int ProjektID;
	private String Titel;
	private Mitarbeiter Leiter;
	private double Budget;
	public int getProjektID() {
		return ProjektID;
	}
	public void setProjektID(int projektID) {
		ProjektID = projektID;
	}
	public String getTitel() {
		return Titel;
	}
	public void setTitel(String titel) {
		Titel = titel;
	}
	public Mitarbeiter getLeiter() {
		return Leiter;
	}
	public void setLeiter(Mitarbeiter leiter) {
		Leiter = leiter;
	}
	public double getBudget() {
		return Budget;
	}
	public void setBudget(double budget) {
		Budget = budget;
	}
	
	public Projekt(int projektID, String titel, Mitarbeiter leiter, double budget) {
		super();
		ProjektID = projektID;
		Titel = titel;
		Leiter = leiter;
		Budget = budget;
	}
	
}
