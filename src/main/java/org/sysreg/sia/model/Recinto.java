package org.sysreg.sia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RECINTOS")
@IdClass(RecintoId.class)
public class Recinto implements Serializable {
	private static final long serialVersionUID = 1L;

	// @Id Evitamos asi que se inerte la parcela de nuevo
	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "MUNICIPIO_ID", referencedColumnName = "MUNICIPIO_ID"),
			@JoinColumn(name = "AGREGADO", referencedColumnName = "AGREGADO"),
			@JoinColumn(name = "ZONA", referencedColumnName = "ZONA"),
			@JoinColumn(name = "POLIGONO", referencedColumnName = "POLIGONO"),
			@JoinColumn(name = "PARCELA", referencedColumnName = "PARCELA"), })
	private Parcela parcela;
	@Id
	private int recinto;

	@Column
	private float superficie;
	@Column
	private float pendiente;
	@Column
	private float coefRegadio;
	@Embedded
	private Coordenadas coordenadas;
	@ManyToOne
	@JoinColumn(name = "USO_ID")
	private Uso uso;

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
		return "Recinto [id=" + getRecinto() + ", superficie=" + superficie
				+ ", pendiente=" + pendiente + ", coefRegadio=" + coefRegadio
				+ ", coordenadas=" + coordenadas.toString() + ", uso="
				+ uso.getDescripcion() + "]";
	}

}