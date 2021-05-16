package com.ticketmaster.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.Table;


@Entity
@Table(name = "Clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	@Column( name = "nombreCliente", length = 40 )
	private String nombreCliente;
	
	@Column( name = "apellidoCliente", length = 40 )
	private String apellidoCliente;
	
	@Column( name = "emailCliente", length = 40 )
	private String emailCliente;
	
	@Column( name = "contraseñaCliente", length = 40 )
	private String contraseñaCliente;
	
	@ManyToOne
	@JoinColumn(name= "idPais", nullable = false)
	private Pais pais;
	
	@ManyToOne
	@JoinColumn(name= "idSexo", nullable = false)
	private Sexo sexo;
	
	
	
	@OneToMany(mappedBy = "cliente")
	private List<Comentario>comentarios;
	
	@OneToMany(mappedBy = "cliente")
	private List<Orden> ordenes;

	public Cliente() {
		super();
	}
	
	public Cliente(Integer idCliente, String nombreCliente, String apellidoCliente,String emailCliente,String contraseñaCliente, Pais pais, Sexo sexo) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente= apellidoCliente;
		this.emailCliente = emailCliente;
		this.contraseñaCliente = contraseñaCliente;
		this.pais = pais;
		this.sexo = sexo;
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

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
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

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCliente == null) ? 0 : idCliente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (idCliente == null) {
			if (other.idCliente != null)
				return false;
		} else if (!idCliente.equals(other.idCliente))
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
