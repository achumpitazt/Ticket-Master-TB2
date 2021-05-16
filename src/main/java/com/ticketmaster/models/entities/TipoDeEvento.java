package com.ticketmaster.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "TiposDeEventos")
public class TipoDeEvento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoDeEvento;
	
	@Column(name = "nombreTipoDeEvento", length = 40)
	private String nombreTipoDeEvento;
	
	@Column(name = "descripcionTipoDeEvento", length = 60)
	private String descripcionTipoDeEvento;
	
	public TipoDeEvento() {
		super();
	}
	
	public TipoDeEvento(Integer idTipoDeEvento, String nombreTipoDeEvento, String descripcionTipoDeEvento) {
		super();
		this.idTipoDeEvento = idTipoDeEvento;
		this.nombreTipoDeEvento = nombreTipoDeEvento;
		this.descripcionTipoDeEvento = descripcionTipoDeEvento;
	}

	public Integer getIdTipoDeEvento() {
		return idTipoDeEvento;
	}

	public void setIdTipoDeEvento(Integer idTipoDeEvento) {
		this.idTipoDeEvento = idTipoDeEvento;
	}

	public String getNombreTipoDeEvento() {
		return nombreTipoDeEvento;
	}

	public void setNombreTipoDeEvento(String nombreTipoDeEvento) {
		this.nombreTipoDeEvento = nombreTipoDeEvento;
	}

	public String getDescripcionTipoDeEvento() {
		return descripcionTipoDeEvento;
	}

	public void setDescripcionTipoDeEvento(String descripcionTipoDeEvento) {
		this.descripcionTipoDeEvento = descripcionTipoDeEvento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTipoDeEvento == null) ? 0 : idTipoDeEvento.hashCode());
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
		TipoDeEvento other = (TipoDeEvento) obj;
		if (idTipoDeEvento == null) {
			if (other.idTipoDeEvento != null)
				return false;
		} else if (!idTipoDeEvento.equals(other.idTipoDeEvento))
			return false;
		return true;
	}

	
	

	
	

	
	
	

}
