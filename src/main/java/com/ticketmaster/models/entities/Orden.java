package com.ticketmaster.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Ordenes")
@SequenceGenerator(name = "genOrden", initialValue = 1)
public class Orden {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genOrden")
	@Column(name = "idOrden", columnDefinition = "NUMERIC (8)")
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "idPago", nullable = false)
	private Pago pago;
	
	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false)
	private Cliente cliente;
	
	@Column(name = "fecha")
	@Temporal(TemporalType.TIME)
	private Date fecha;
	
	@Column(name = "preciofinal", columnDefinition = "DECIMAL(5,2)")
	private float preciofinal;
	
	@OneToOne(mappedBy = "orden")
	private Detalle detalle;
	
	public Orden() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float getPreciofinal() {
		return preciofinal;
	}

	public void setPreciofinal(float preciofinal) {
		this.preciofinal = preciofinal;
	}

	public Detalle getDetalle() {
		return detalle;
	}

	public void setDetalle(Detalle detalle) {
		this.detalle = detalle;
	}
	
	

}
