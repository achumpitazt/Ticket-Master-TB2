package com.ticketmaster.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Clientes")
@SequenceGenerator(name = "genCliente", initialValue = 1)
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genCliente")
	@Column(name = "idCliente", columnDefinition = "NUMERIC(6)")
	private Integer id;
	
	@Column( name = "Nombre", length = 40 )
	private String nombre;
	
	@Column( name = "Apellido", length = 40 )
	private String apellido;
	
	@Column( name = "Email", length = 40 )
	private String email;
	
	@Column( name = "Contrasena", length = 40 )
	private String contrasena;
	
	@Column( name = "Pais", length = 40 )
	private String pais;
	
	@Column( name = "Sexo", length = 40 )
	private String sexo;
	
	@OneToMany(mappedBy = "cliente")
	private List<Comentario>comentarios;
	
	@OneToMany(mappedBy = "cliente")
	private List<Orden> ordenes;
	
	
	// -- Constructor, Getter y Setter 
	public Cliente() {
		comentarios = new ArrayList<Comentario>();
		ordenes = new ArrayList<Orden>();
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public List<Orden> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(List<Orden> ordenes) {
		this.ordenes = ordenes;
	}
	
}
