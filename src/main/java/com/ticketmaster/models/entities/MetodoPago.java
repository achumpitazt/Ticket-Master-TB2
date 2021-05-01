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
@Table(name="MetodosPago")
@SequenceGenerator(name = "genMetodoPago", initialValue = 1, allocationSize = 1)
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genMetodoPago")
    @Column(name="idMetodoPago")
    private Integer id;

    @Column(name = "nombre",length = 40 )
    private String nombre;

    @Column(name = "descripcion",length = 40)
    private String descripcion;
    
    @OneToOne(mappedBy = "metodoPago")
    private Pago pago;
    
    public MetodoPago() {
    	
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}
    
    //getter and setters
    
    

   
}