package com.ticketmaster.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Detalles")
@SequenceGenerator(name = "genDetalle", initialValue =1, allocationSize = 1)
public class Detalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genDetalle")
	@Column(name = "idDetalle", columnDefinition = "NUMERIC(6)")
	private int id;
	
	@OneToOne
	@JoinColumn(name = "idOrden", nullable = false)
	private Orden orden;
	
	@Column(name = "cantidad")
	private Integer cantidad;
	
	@Column(name = "precioUnitario", columnDefinition = "DECIMAL(5,2)")
	private float precioUnitario;
	
	@Column(name = "precioFinal", columnDefinition = "DECIMAL(5,2)")
	private float precioFinal;
	
	@OneToMany(mappedBy = "detalle",fetch = FetchType.LAZY)
	private List<Ticket> tickets;
	
	public Detalle() {
		
		tickets = new ArrayList<Ticket>();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Orden getOrden() {
		return orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public float getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(float precioFinal) {
		this.precioFinal = precioFinal;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	

}
