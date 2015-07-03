package Verarbeitungsschicht;

import java.io.Serializable;

public class Datum implements Serializable{
	private int d;
	private int m;
	private int y;
	
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Datum(int d, int m, int y) {
		super();
		this.d = d;
		this.m = m;
		this.y = y;
	}

}
