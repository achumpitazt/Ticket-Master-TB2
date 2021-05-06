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

import javax.persistence.Table;



import java.util.List;

@Entity
@Table(name = "Eventos")
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEvento")
	private Integer idEvento;
	
	
	
	@ManyToOne
	@JoinColumn(name = "idOrganizador",nullable = false)
	private Organizador Organizador;
	
	@ManyToOne
	@JoinColumn(name ="idTipoDeEvento", nullable = false)
	private TipoDeEvento TipoDeEvento;
	
	@Column( name = "tituloEvento", length = 40 )
	private String tituloEvento;
	
	@Column(name = "fechaEvento")
	private String fechaEvento;
	
	@Column( name = "descripcionEvento", length = 60 )
	private String descripcionEvento;
	
	@Column(name = "horaEvento")
	private String horaEvento;
	
	@Column(name = "enlaceEvento", length = 200)
	private String enlaceEvento;
	
	@Column(name = "precioEvento", columnDefinition = "DECIMAL(5,2)")
	private float precioEvento;
	
	
	@OneToMany(mappedBy = "evento",fetch = FetchType.LAZY )
	private List<Comentario> comentarios;
	
	@OneToMany(mappedBy = "evento",fetch = FetchType.LAZY)
	private List<Ticket> tickets;

	public Evento() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	


	public Evento(Integer idEvento, com.ticketmaster.models.entities.Organizador organizador,
			com.ticketmaster.models.entities.TipoDeEvento tipoDeEvento, String tituloEvento, String fechaEvento,
			String descripcionEvento, String horaEvento, String enlaceEvento, float precioEvento,
			List<Comentario> comentarios, List<Ticket> tickets) {
		super();
		this.idEvento = idEvento;
		Organizador = organizador;
		
		this.tituloEvento = tituloEvento;
		this.fechaEvento = fechaEvento;
		this.descripcionEvento = descripcionEvento;
		this.horaEvento = horaEvento;
		this.enlaceEvento = enlaceEvento;
		this.precioEvento = precioEvento;
		this.comentarios = comentarios;
		this.tickets = tickets;
	}






	public Integer getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}

	public Organizador getOrganizador() {
		return Organizador;
	}

	public void setOrganizador(Organizador organizador) {
		Organizador = organizador;
	}

	public TipoDeEvento getTipoDeEvento() {
		return TipoDeEvento;
	}

	public void setTipoDeEvento(TipoDeEvento tipoDeEvento) {
		TipoDeEvento = tipoDeEvento;
	}

	public String getTituloEvento() {
		return tituloEvento;
	}

	public void setTituloEvento(String tituloEvento) {
		this.tituloEvento = tituloEvento;
	}

	public String getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(String fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public String getDescripcionEvento() {
		return descripcionEvento;
	}

	public void setDescripcionEvento(String descripcionEvento) {
		this.descripcionEvento = descripcionEvento;
	}

	public String getHoraEvento() {
		return horaEvento;
	}

	public void setHoraEvento(String horaEvento) {
		this.horaEvento = horaEvento;
	}

	public String getEnlaceEvento() {
		return enlaceEvento;
	}

	public void setEnlaceEvento(String enlaceEvento) {
		this.enlaceEvento = enlaceEvento;
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

	
	
	
	
	

	
	
	

}
