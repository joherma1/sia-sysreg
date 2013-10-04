package org.sysreg.sia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

public class Recinto implements Serializable {

	private RecintoId id = new RecintoId();
	private float superficie;
	private float pendiente;
	private float coefRegadio;
	private Coordenadas coordenadas;
	private Uso uso;

	public static class RecintoId implements Serializable {
		public Parcela parcela;
		public int recinto;

		public RecintoId() {
		}

		public RecintoId(Parcela parcela, int recinto) {
			super();
			this.parcela = parcela;
			this.recinto = recinto;
		}

		public Parcela getParcela() {
			return parcela;
		}

		public void setParcela(Parcela parcela) {
			this.parcela = parcela;
		}

		public int getRecinto() {
			return recinto;
		}

		public void setRecinto(int recinto) {
			this.recinto = recinto;
		}
	}

	public RecintoId getId() {
		return id;
	}

	public void setId(RecintoId id) {
		this.id = id;
	}

	public int getRecinto() {
		return id.recinto;
	}

	public void setRecinto(int recinto) {
		this.id.recinto = recinto;
	}

	public float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}

	public float getPendiente() {
		return pendiente;
	}

	public void setPendiente(float pendiente) {
		this.pendiente = pendiente;
	}

	public float getCoefRegadio() {
		return coefRegadio;
	}

	public void setCoefRegadio(float coefRegadio) {
		this.coefRegadio = coefRegadio;
	}

	public Parcela getParcela() {
		return id.parcela;
	}

	public void setParcela(Parcela parcela) {
		this.id.parcela = parcela;
	}

	public Coordenadas getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(Coordenadas coordenadas) {
		this.coordenadas = coordenadas;
	}

	public Uso getUso() {
		return uso;
	}

	public void setUso(Uso uso) {
		this.uso = uso;
	}

	public String toString() {
		return "Recinto [id=" + id.getRecinto() + ", superficie=" + superficie + ", pendiente=" + pendiente
				+ ", coefRegadio=" + coefRegadio + ", coordenadas=" + coordenadas.toString() + ", uso="
				+ uso.getDescripcion() + "]";
	}

}