package org.sysreg.sia.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PARCELAS")
@IdClass(ParcelaId.class)
public class Parcela implements Serializable {
	private static final long serialVersionUID = 1L;

	// @Id Evitamos asi que inserte el municipio de nuevo
	@ManyToOne
	@JoinColumn(name = "MUNICIPIO_ID")
	private Municipio municipio;
	@Id
	private int agregado;
	@Id
	private int zona;
	@Id
	private int poligono;
	@Id
	private int parcela;
	@Column
	private float superficie;
	@ManyToOne
	@JoinColumn(name = "CAMPO_ID")
	private Campo campo;

	// private Set<Recinto> recintos = new HashSet<Recinto>();
	// private Coordenadas coordenadas;

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public int getAgregado() {
		return agregado;
	}

	public void setAgregado(int agregado) {
		this.agregado = agregado;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public int getPoligono() {
		return poligono;
	}

	public void setPoligono(int poligono) {
		this.poligono = poligono;
	}

	public int getParcela() {
		return parcela;
	}

	public void setParcela(int parcela) {
		this.parcela = parcela;
	}

	public float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}

	// public Set<Recinto> getRecintos() {
	// return recintos;
	// }
	//
	// public void setRecintos(Set<Recinto> recintos) {
	// this.recintos = recintos;
	// }
	//
	// public Coordenadas getCoordenadas() {
	// return coordenadas;
	// }
	//
	// public void setCoordenadas(Coordenadas coordenadas) {
	// this.coordenadas = coordenadas;
	// }
	//
	public Campo getCampo() {
		return campo;
	}

	public void setCampo(Campo campo) {
		this.campo = campo;
	}
}
