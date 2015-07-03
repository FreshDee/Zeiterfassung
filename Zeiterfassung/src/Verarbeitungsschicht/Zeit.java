package Verarbeitungsschicht;

import java.io.Serializable;

public class Zeit implements Serializable {
	
	private int h;
	private int m;
	
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	
	public Zeit(int h, int m) {
		super();
		this.h = h;
		this.m = m;
	}
	
}
