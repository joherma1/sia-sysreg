package org.sysreg.sia.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import org.sysreg.sia.shared.CampoDTO;
//import org.sysreg.sia.shared.ComarcaDTO;
//import org.sysreg.sia.shared.MunicipioDTO;
//import org.sysreg.sia.shared.ParcelaDTO;
//import org.sysreg.sia.shared.ParcelaDTO.ParcelaDTOId;
//import org.sysreg.sia.shared.ProvinciaDTO;
//import org.sysreg.sia.shared.RecintoDTO;
//import org.sysreg.sia.shared.RecintoDTO.RecintoDTOId;
//import org.sysreg.sia.shared.UsuarioDTO;

@Entity
@Table(name = "USUARIOS")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String usuario;
	@Column
	private String password;
	@Column
	private String nombre;
	@Column
	private String apellidos;
	@Column
	private String telefono;
	@Column
	private String direccion;
	@Column
	private String dni;

	@ManyToOne
	@JoinColumn(name = "MUNICIPIO_ID", nullable = false)
	private Municipio municipio;

	@OneToMany(mappedBy = "usuario")
	private Set<Campo> campos = new HashSet<Campo>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public Set<Campo> getCampos() {
		return campos;
	}

	public void setCampos(Set<Campo> campos) {
		this.campos = campos;
	}
	//
	// @Override
	// public String toString() {
	// String res = "Usuario [usuario=" + usuario + ", password=" + password +
	// ", nombre=" + nombre + ", apellidos="
	// + apellidos + ", telefono=" + telefono + ", direccion=" + direccion +
	// ", dni=" + dni + ", municipio="
	// + municipio.toString() + "]" + '\n';
	// for (Campo campo : campos)
	// for (Parcela parcela : campo.getParcelas())
	// for (Recinto recinto : parcela.getRecintos())
	// res += "Campo= " + campo.getNombre() + ", Parcela=" +
	// parcela.getId().getMunicipio().getCodigo()
	// + " " + parcela.getPoligono() + " " + parcela.getParcela() + ", Recinto"
	// + recinto.toString() + '\n';
	// return res;
	// }

	// public UsuarioDTO toUsuarioDTO() {
	// UsuarioDTO user = new UsuarioDTO(usuario, password, nombre, apellidos,
	// telefono, direccion, dni);
	//
	// ProvinciaDTO prov = new ProvinciaDTO(municipio.getComarca()
	// .getProvincia().getCodigo(), municipio.getComarca()
	// .getProvincia().getNombre());
	// ComarcaDTO com = new ComarcaDTO(municipio.getComarca().getCodigo(),
	// municipio.getComarca().getNombre(), prov);
	// MunicipioDTO mun = new MunicipioDTO(municipio.getCodigo(),
	// municipio.getNombre(), com);
	// user.setMunicipio(mun);
	//
	// // Revisar en el futuro
	// // Carga Eager de campos-parcelas-recintos
	// for (Campo campo : this.campos) {
	// CampoDTO campoDTO = new CampoDTO(campo.getCodigo(),
	// campo.getNombre(), user);
	//
	// // Transformamos las parcelas
	// for (Parcela parcela : campo.getParcelas()) {
	// ParcelaDTOId parcelaDTOId = new ParcelaDTOId(mun,
	// parcela.getAgregado(), parcela.getZona(),
	// parcela.getPoligono(), parcela.getParcela());
	//
	// ParcelaDTO parcelaDTO = new ParcelaDTO(parcelaDTOId,
	// parcela.getSuperficie(), parcela.getCoordenadas()
	// .toCoordenadasDTO(), campoDTO);
	//
	// // Transformamos los recintos
	// for (Recinto recinto : parcela.getRecintos()) {
	// RecintoDTOId recintoDTOId = new RecintoDTOId(parcelaDTO,
	// recinto.getRecinto());
	//
	// RecintoDTO recintoDTO = new RecintoDTO(recintoDTOId,
	// recinto.getSuperficie(), recinto.getPendiente(),
	// recinto.getCoefRegadio(), recinto.getCoordenadas()
	// .toCoordenadasDTO(), recinto.getUso()
	// .toUsoDTO());
	// // lo añadimos a la parcela
	// parcelaDTO.getRecintos().add(recintoDTO);
	// }
	//
	// // añadimos la parcela vcon los recintos al campo
	// campoDTO.getParcelas().add(parcelaDTO);
	// }
	//
	// // añadimos los campos al usuario
	// user.getCampos().add(campoDTO);
	// }
	//
	// return user;
	// }
}