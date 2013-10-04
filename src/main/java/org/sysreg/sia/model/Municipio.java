package org.sysreg.sia.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MUNICIPIOS")
public class Municipio implements Serializable {

	@Id
	private int codigo;
	@Column
	private String nombre;
	@ManyToOne
	@JoinColumn(name = "COMARCA_ID")
	private Comarca comarca;
	@OneToMany(mappedBy = "municipio")
	private Set<Parcela> parcelas;
	@OneToMany(mappedBy = "municipio")
	private Set<Usuario> usuarios;

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

	public Comarca getComarca() {
		return comarca;
	}

	public void setComarca(Comarca comarca) {
		this.comarca = comarca;
	}

	public Provincia getProvincia() {
		return comarca.getProvincia();
	}

	public void setProvincia(Provincia provincia) {
		this.comarca.setProvincia(provincia);
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

	@Override
	public String toString() {
		return "Municipio [codigo=" + codigo + ", nombre=" + nombre + ", comarca=" + comarca.getNombre()
				+ ", provincia=" + getProvincia().getNombre() + "]";
	}
}