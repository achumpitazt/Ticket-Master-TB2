package com.ticketmaster.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="MetodosPago")
@SequenceGenerator(name = "genMetodoPago", initialValue = 1)
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genMetodoPago")
    @Column(name="idMetodoPago")
    private Integer idMetodoPago;

    @Column(name = "nombreMetodoPago",length = 40 )
    private String nombreMetodoPago;

    @Column(name = "descripcion",length = 40)
    private String descripcion;
    
    //@OneToOne(mappedBy = "metodoPago")
    //private Pago pago;
    
    //Constructores
	public MetodoPago() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MetodoPago(Integer idMetodoPago, String nombreMetodoPago, String descripcion) {
		super();
		this.idMetodoPago = idMetodoPago;
		this.nombreMetodoPago = nombreMetodoPago;
		this.descripcion = descripcion;
	}

	//Get y Set
	public Integer getIdMetodoPago() {
		return idMetodoPago;
	}

	public void setIdMetodoPago(Integer idMetodoPago) {
		this.idMetodoPago = idMetodoPago;
	}

	public String getNombreMetodoPago() {
		return nombreMetodoPago;
	}

	public void setNombreMetodoPago(String nombreMetodoPago) {
		this.nombreMetodoPago = nombreMetodoPago;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMetodoPago == null) ? 0 : idMetodoPago.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MetodoPago other = (MetodoPago) obj;
		if (idMetodoPago == null) {
			if (other.idMetodoPago != null)
				return false;
		} else if (!idMetodoPago.equals(other.idMetodoPago))
			return false;
		return true;
	}
	
	
	
}