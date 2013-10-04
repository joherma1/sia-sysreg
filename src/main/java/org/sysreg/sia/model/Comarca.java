package org.sysreg.sia.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COMARCAS")
public class Comarca implements Serializable {

	@Id
	@GeneratedValue
	// Default AUTO
	private int codigo;

	@Column
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "PROVINCIA_ID")
	private Provincia provincia;

	@OneToMany(mappedBy = "comarca")
	private Set<Municipio> municipios = new HashSet<Municipio>();

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	//
	// public Set<Municipio> getMunicipios() {
	// return municipios;
	// }
	//
	// public void setMunicipios(Set<Municipio> municipios) {
	// this.municipios = municipios;
	// }

}
