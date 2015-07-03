package Verarbeitungsschicht;

public class Buchung {
	
	private int BuchungsID;
	private Datum Buchungsdatum;
	private Projekt Projekt_gebucht;
	private Mitarbeiter MA_gebucht;
	private Taetigkeit Taetigkeit_gebucht;
	
	public int getBuchungsID() {
		return BuchungsID;
	}
	public void setBuchungsID(int buchungsID) {
		BuchungsID = buchungsID;
	}
	public Datum getBuchungsdatum() {
		return Buchungsdatum;
	}
	public void setBuchungsdatum(Datum buchungsdatum) {
		Buchungsdatum = buchungsdatum;
	}
	public Projekt getProjekt_gebucht() {
		return Projekt_gebucht;
	}
	public void setProjekt_gebucht(Projekt projekt_gebucht) {
		Projekt_gebucht = projekt_gebucht;
	}
	public Mitarbeiter getMA_gebucht() {
		return MA_gebucht;
	}
	public void setMA_gebucht(Mitarbeiter mA_gebucht) {
		MA_gebucht = mA_gebucht;
	}
	public Taetigkeit getTaetigkeit_gebucht() {
		return Taetigkeit_gebucht;
	}
	public void setTaetigkeit_gebucht(Taetigkeit taetigkeit_gebucht) {
		Taetigkeit_gebucht = taetigkeit_gebucht;
	}
	
	public Buchung(int buchungsID, Datum buchungsdatum,
			Projekt projekt_gebucht, Mitarbeiter mA_gebucht,
			Taetigkeit taetigkeit_gebucht) {
		super();
		BuchungsID = buchungsID;
		Buchungsdatum = buchungsdatum;
		Projekt_gebucht = projekt_gebucht;
		MA_gebucht = mA_gebucht;
		Taetigkeit_gebucht = taetigkeit_gebucht;
	}

	
}
