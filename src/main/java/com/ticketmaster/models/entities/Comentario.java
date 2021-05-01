package com.ticketmaster.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Comentarios")
@SequenceGenerator(name = "genComentario", initialValue = 1, allocationSize = 1)
public class Comentario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "genComentario")
	@Column (name = "idComentario", columnDefinition = "NUMERIC(6)")
	private Integer idComentario;
	
	@ManyToOne(fetch = FetchType.LAZY)	
	@JoinColumn(name = "idCliente", nullable = true)
	private Cliente cliente;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEvento", nullable = true)
	private Evento evento;
	
	@Column(name = "contenido", length =200)
	private String contenido;

	//-- Constructor, getter and setter
	public Comentario() {
		
	}

	public Integer getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(Integer idComentario) {
		this.idComentario = idComentario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	
	
}
