package org.sysreg.sia.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Embeddable
public class ParcelaId implements Serializable {
	private static final long serialVersionUID = 1L;
	private Municipio municipio;
	private int agregado;
	private int zona;
	private int poligono;
	private int parcela;

	public ParcelaId() {
	}

	public ParcelaId(Municipio municipio, int agregado, int zona, int poligono, int parcela) {
		super();
		this.municipio = municipio;
		this.agregado = agregado;
		this.zona = zona;
		this.poligono = poligono;
		this.parcela = parcela;
	}

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

	public int hashCode() {
		return new HashCodeBuilder(17, 31)
				. // two randomly chosen prime numbers
					// if deriving: appendSuper(super.hashCode()).
				append(municipio.getCodigo()).append(agregado).append(zona).append(poligono).append(parcela)
				.toHashCode();
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (!(obj instanceof ParcelaId))
			return false;

		ParcelaId rhs = (ParcelaId) obj;
		return new EqualsBuilder()
				.
				// if deriving: appendSuper(super.equals(obj)).
				append(municipio.getCodigo(), rhs.getMunicipio().getCodigo()).append(agregado, rhs.getAgregado())
				.append(zona, rhs.getZona()).append(poligono, rhs.getPoligono()).append(parcela, rhs.getParcela())
				.isEquals();
	}
}