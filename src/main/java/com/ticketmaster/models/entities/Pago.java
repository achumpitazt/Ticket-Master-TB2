package com.ticketmaster.models.entities;

//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

@Entity
@Table(name= "Pagos")
@SequenceGenerator(name = "genPago", initialValue = 1, allocationSize = 1)
public class Pago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genPago")
	@Column(name = "idPago", columnDefinition = "NUMERIC(6)")
	private Integer idPago; 
	
	@ManyToOne
	@JoinColumn(name = "idMetodoPago", nullable = false)
	private MetodoPago metodoPago;
	//Primero implementar metodo pago
	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false)
	private Cliente cliente;
	
	@Column(name="titulartarjeta",length = 40)
	private String titulartarjeta;
	
	@Column(name="numeroDeTarjeta",length = 12)
	private String numeroDeTarjeta;
	
	@Column(name="cv",length = 4)
	private String cv;
	
	@Column(name = "fechaDeEmision",length = 8)
	//@Temporal(TemporalType.TIME)
	//private Date fechaDeEmision;
	private String fechaDeEmision;
	
	@Column(name = "preciofinal", columnDefinition = "DECIMAL(5,2)")
	private float preciofinal;
	
	//Constructor

	public Pago() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pago(Integer idPago, MetodoPago metodoPago, Cliente cliente, float total, String titulartarjeta,
			String numeroDeTarjeta, String cv, String fechaDeEmision, float preciofinal) {
		super();
		this.idPago = idPago;
		this.metodoPago = metodoPago;
		this.cliente = cliente;
		this.titulartarjeta = titulartarjeta;
		this.numeroDeTarjeta = numeroDeTarjeta;
		this.cv = cv;
		this.fechaDeEmision = fechaDeEmision;
		this.preciofinal = preciofinal;
	}
	//Get y Set
	public Integer getIdPago() {
		return idPago;
	}

	public void setIdPago(Integer idPago) {
		this.idPago = idPago;
	}

	public MetodoPago getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(MetodoPago metodoPago) {
		this.metodoPago = metodoPago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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

	public String getFechaDeEmision() {
		return fechaDeEmision;
	}

	public void setFechaDeEmision(String fechaDeEmision) {
		this.fechaDeEmision = fechaDeEmision;
	}

	public float getPreciofinal() {
		return preciofinal;
	}

	public void setPreciofinal(float preciofinal) {
		this.preciofinal = preciofinal;
	}
	
	
		
}
