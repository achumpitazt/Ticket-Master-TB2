package com.ticketmaster.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Eventos")
@SequenceGenerator(name = "genEvento",initialValue = 1)
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genEvento")
	@Column(name = "idEvento", columnDefinition = "NUMERIC(6)")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "IdOrganizador",nullable = false)
	private Organizador organizador; //IdOrganizador
	
	@OneToOne
	@JoinColumn(name ="idTipoDeEvento", nullable = false)
	private TipoDeEvento tipoDeEvento;
	
	@Column( name = "titulo", length = 40 )
	private String titulo;
	
	@Column(name = "fecha")
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@Column( name = "descripcion", length = 60 )
	private String descripcion;
	
	@Column(name = "hora")
	@Temporal(TemporalType.TIME)
	private Date hora;
	
	@Column(name = "enlaceEvento", length = 200)
	private String enlace;
	
	@Column(name = "precioEvento", columnDefinition = "DECIMAL(5,2)")
	private float precioEvento;
	
	
	@OneToMany(mappedBy = "evento",fetch = FetchType.LAZY )
	private List<Comentario> comentarios;
	
	@OneToMany(mappedBy = "evento",fetch = FetchType.LAZY)
	private List<Ticket> tickets;
	
	public Evento() {
		
		comentarios = new ArrayList<Comentario>();
		tickets = new ArrayList<Ticket>();
				
	}
	
	// -- Constructor, Getter y Setter 

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Organizador getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Organizador organizador) {
		this.organizador = organizador;
	}

	public TipoDeEvento getTipoDeEvento() {
		return tipoDeEvento;
	}

	public void setTipoDeEvento(TipoDeEvento tipoDeEvento) {
		this.tipoDeEvento = tipoDeEvento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public float getPrecioEvento() {
		return precioEvento;
	}

	public void setPrecioEvento(float precioEvento) {
		this.precioEvento = precioEvento;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}
	
	
	
	

}
