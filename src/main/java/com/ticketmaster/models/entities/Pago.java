package com.ticketmaster.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name= "Pagos")
@SequenceGenerator(name = "genPago", initialValue = 1, allocationSize = 1)
public class Pago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genPago")
	@Column(name = "idPago", columnDefinition = "NUMERIC(6)")
	private Integer id;
	
	@OneToOne 
	@JoinColumn(name = "idMetodoPago", nullable = false)
	private MetodoPago metodoPago;
	
	
	@Column(name="titulartarjeta",length = 40)
	private String titulartarjeta;
	
	@Column(name="numeroDeTarjeta",length = 12)
	private String numeroDeTarjeta;
	
	@Column(name="cv",length = 4)
	private String cv;
	
	@Column(name = "fechaDeEmision")
	@Temporal(TemporalType.TIME)
	private Date fechaDeEmision;
	
	@Column(name = "preciofinal", columnDefinition = "DECIMAL(5,2)")
	private float preciofinal;
	
	@OneToOne(mappedBy = "pago")
	private Orden orden;
	
	public Pago() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MetodoPago getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(MetodoPago metodoPago) {
		this.metodoPago = metodoPago;
	}

	public String getTitulartarjeta() {
		return titulartarjeta;
	}

	public void setTitulartarjeta(String titulartarjeta) {
		this.titulartarjeta = titulartarjeta;
	}

	public String getNumeroDeTarjeta() {
		return numeroDeTarjeta;
	}

	public void setNumeroDeTarjeta(String numeroDeTarjeta) {
		this.numeroDeTarjeta = numeroDeTarjeta;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public Date getFechaDeEmision() {
		return fechaDeEmision;
	}

	public void setFechaDeEmision(Date fechaDeEmision) {
		this.fechaDeEmision = fechaDeEmision;
	}

	public float getPreciofinal() {
		return preciofinal;
	}

	public void setPreciofinal(float preciofinal) {
		this.preciofinal = preciofinal;
	}

	public Orden getOrden() {
		return orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}
	
	

}
