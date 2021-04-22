package com.ticketmaster.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TiposDeEventos")
@SequenceGenerator(name = "genTipoDeEvento", initialValue = 1)
public class TipoDeEvento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genTipoDeEvento")
	@Column (name = "idTipoDeEvento", columnDefinition = "Numeric(6)")
	private Integer id;
	
	@OneToOne(mappedBy = "tipoDeEvento")
	private Evento evento;
	
	@Column(name = "nombre", length = 40)
	private String nombre;
	
	@Column(name = "descripcion", length = 60)
	private String descripcion;
	
	public TipoDeEvento() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
