package com.ticketmaster.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;


@Entity
@Table(name = "Clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCliente")
	private Integer idCliente;
	
	@Column( name = "nombreCliente", length = 40 )
	private String nombreCliente;
	
	@Column( name = "apellidoCliente", length = 40 )
	private String apellidoCliente;
	
	@Column( name = "emailCliente", length = 40 )
	private String emailCliente;
	
	@Column( name = "contraseñaCliente", length = 40 )
	private String contraseñaCliente;
	
	@Column( name = "paisCliente", length = 40 )
	private String paisCliente;
	
	@Column( name = "sexoCliente", length = 40 )
	private String sexoCliente;
	
	@OneToMany(mappedBy = "cliente")
	private List<Comentario>comentarios;
	
	@OneToMany(mappedBy = "cliente")
	private List<Orden> ordenes;

	public Cliente() {
		super();
	}
	
	public Cliente(Integer idCliente, String nombreCliente, String apellidoCliente,String emailCliente,String contraseñaCliente, String paisCliente, String sexoCliente) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente= apellidoCliente;
		this.emailCliente = emailCliente;
		this.contraseñaCliente = contraseñaCliente;
		this.paisCliente = paisCliente;
		this.sexoCliente = sexoCliente;
		comentarios = new ArrayList<Comentario>();
		ordenes = new ArrayList<Orden>();
		
		// TODO Auto-generated constructor stub
	}
	
	//Getter y Setter 
	
	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getContraseñaCliente() {
		return contraseñaCliente;
	}

	public void setContraseñaCliente(String contraseñaCliente) {
		this.contraseñaCliente = contraseñaCliente;
	}

	public String getPaisCliente() {
		return paisCliente;
	}

	public void setPaisCliente(String paisCliente) {
		this.paisCliente = paisCliente;
	}

	public String getSexoCliente() {
		return sexoCliente;
	}

	public void setSexoCliente(String sexoCliente) {
		this.sexoCliente = sexoCliente;
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
