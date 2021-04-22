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
@Table(name = "Tickets")
@SequenceGenerator(name = "genTicket", initialValue = 1)
public class Ticket{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genTicket")
    @Column(name = "idTicket", columnDefinition = "NUMERIC(6)")
    private Integer id;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idevento", nullable = false)
    private Evento evento;
    
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idDetalleOrden", nullable = false)
    private Detalle detalle;
    
    public Ticket () {
    	
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

	public Detalle getDetalle() {
		return detalle;
	}

	public void setDetalle(Detalle detalle) {
		this.detalle = detalle;
	}
    
    
   

    

}