package org.sysreg.sia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.sysreg.sia.shared.UsoDTO;

@Entity
@Table(name = "USOS")
public class Uso implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// private char[] codigo = new char[2];
	private Integer id;

	@Column(name = "DESCRIPCION", length = 255)
	private String descripcion;

	// private Set<Recinto> recintos;

	// public char[] getCodigo() {
	// return codigo;
	// }
	//
	// public void setCodigo(char[] codigo) {
	// this.codigo = codigo;
	// }

	public String getDescripcion() {
		return descripcion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// public Set<Recinto> getRecintos() {
	// return recintos;
	// }
	//
	// public void setRecintos(Set<Recinto> recintos) {
	// this.recintos = recintos;
	// }

	// public UsoDTO toUsoDTO(){
	// return new UsoDTO(codigo, descripcion);
	// }

}