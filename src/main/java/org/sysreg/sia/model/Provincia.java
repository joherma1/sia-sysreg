package org.sysreg.sia.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PROVINCIAS")
public class Provincia implements Serializable {

	@Id
	private int codigo;

	@Column
	private String nombre;

	@OneToMany(mappedBy = "provincia")
	private Set<Comarca> comarcas = new HashSet<Comarca>();

	// private Set<Usuario> usuarios = new HashSet<Usuario>();
	// private Set<Parcela> parcelas;

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

	public Set<Comarca> getComarcas() {
		return comarcas;
	}

	public void setComarcas(Set<Comarca> comarcas) {
		this.comarcas = comarcas;
	}

	// public Set<Parcela> getParcelas() {
	// return parcelas;
	// }
	//
	// public void setParcelas(Set<Parcela> parcelas) {
	// this.parcelas = parcelas;
	// }
	//
	// public Set<Usuario> getUsuarios() {
	// return usuarios;
	// }
	//
	// public void setUsuarios(Set<Usuario> usuarios) {
	// this.usuarios = usuarios;
	// }
}