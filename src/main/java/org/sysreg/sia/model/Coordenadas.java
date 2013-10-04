package org.sysreg.sia.model;

import java.io.Serializable;

//import org.sysreg.sia.shared.CoordenadasDTO;

public class Coordenadas implements Serializable {

	private double x;
	private double y;
	private String datum;
	private int huso;

	public Coordenadas() {

	}

	public Coordenadas(double x, double y, String datum, int huso) {
		super();
		this.x = x;
		this.y = y;
		this.datum = datum;
		this.huso = huso;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public int getHuso() {
		return huso;
	}

	public void setHuso(int huso) {
		this.huso = huso;
	}

	// public CoordenadasDTO toCoordenadasDTO() {
	// return new CoordenadasDTO(x, y, datum, huso);
	// }

	public String toString() {
		return "X: " + x + " Y: " + y + " Datum: " + datum + " Huso: " + huso;

	}

}