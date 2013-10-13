package org.sysreg.sia.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Embeddable
public class RecintoId implements Serializable {
	private static final long serialVersionUID = 1L;

	private Parcela parcela;
	private int recinto;

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

	public int hashCode() {
		return new HashCodeBuilder(17, 31)
				. // two randomly chosen prime numbers
					// if deriving: appendSuper(super.hashCode()).
				append(parcela.getMunicipio().getCodigo())
				.append(parcela.getAgregado()).append(parcela.getZona())
				.append(parcela.getPoligono()).append(parcela.getParcela())
				.append(recinto).toHashCode();
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (!(obj instanceof ParcelaId))
			return false;

		RecintoId rhs = (RecintoId) obj;
		return new EqualsBuilder()
				.
				// if deriving: appendSuper(super.equals(obj)).
				append(parcela.getMunicipio().getCodigo(),
						rhs.getParcela().getMunicipio().getCodigo())
				.append(parcela.getAgregado(), rhs.getParcela().getAgregado())
				.append(parcela.getZona(), rhs.getParcela().getZona())
				.append(parcela.getPoligono(), rhs.getParcela().getPoligono())
				.append(parcela.getParcela(), rhs.getParcela().getParcela())
				.append(recinto, rhs.getRecinto()).isEquals();
	}

}