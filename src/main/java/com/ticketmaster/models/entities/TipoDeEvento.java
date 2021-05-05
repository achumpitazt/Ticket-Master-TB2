package com.ticketmaster.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TiposDeEventos")
public class TipoDeEvento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "idTipoDeEvento")
	private Integer idTipoDeEvento;
	
	@OneToOne(mappedBy = "tipoDeEvento")
	private Evento evento;
	
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

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
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

	
	
	

}
