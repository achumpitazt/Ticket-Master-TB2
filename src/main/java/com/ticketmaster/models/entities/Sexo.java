package com.ticketmaster.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sexos")
public class Sexo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "idSexo")
	private Integer idSexo;
	
	@Column(name = "nombreSexo", length = 40)
	private String nombreSexo;

	public Sexo() {
		super();
		
	}

	public Sexo(Integer idSexo, String nombreSexo) {
		super();
		this.idSexo = idSexo;
		this.nombreSexo = nombreSexo;
	}

	public Integer getIdSexo() {
		return idSexo;
	}

	public void setIdSexo(Integer idSexo) {
		this.idSexo = idSexo;
	}

	public String getNombreSexo() {
		return nombreSexo;
	}

	public void setNombreSexo(String nombreSexo) {
		this.nombreSexo = nombreSexo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSexo == null) ? 0 : idSexo.hashCode());
		result = prime * result + ((nombreSexo == null) ? 0 : nombreSexo.hashCode());
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
		Sexo other = (Sexo) obj;
		if (idSexo == null) {
			if (other.idSexo != null)
				return false;
		} else if (!idSexo.equals(other.idSexo))
			return false;
		if (nombreSexo == null) {
			if (other.nombreSexo != null)
				return false;
		} else if (!nombreSexo.equals(other.nombreSexo))
			return false;
		return true;
	}

	

}
