package Verarbeitungsschicht;

import java.io.Serializable;

public class Taetigkeit implements Serializable {

	private int TatigkeitsID;
	private boolean isbillable;
	private Zeit Anfang;
	private Zeit Ende;
	public int getTatigkeitsID() {
		return TatigkeitsID;
	}
	public void setTatigkeitsID(int tatigkeitsID) {
		TatigkeitsID = tatigkeitsID;
	}
	public boolean isIsbillable() {
		return isbillable;
	}
	public void setIsbillable(boolean isbillable) {
		this.isbillable = isbillable;
	}
	public Zeit getAnfang() {
		return Anfang;
	}
	public void setAnfang(Zeit anfang) {
		Anfang = anfang;
	}
	public Zeit getEnde() {
		return Ende;
	}
	public void setEnde(Zeit ende) {
		Ende = ende;
	}
	public Taetigkeit(int tatigkeitsID, boolean isbillable, Zeit anfang, Zeit ende) {
		super();
		TatigkeitsID = tatigkeitsID;
		this.isbillable = isbillable;
		Anfang = anfang;
		Ende = ende;
	}
	
	

}
