package org.sysreg.sia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//import org.sysreg.sia.shared.CoordenadasDTO;

@Embeddable
public class Coordenadas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column
	private double x;
	@Column
	private double y;
	@Column
	private String datum;
	@Column
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