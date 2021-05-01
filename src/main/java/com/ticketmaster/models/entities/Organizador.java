package com.ticketmaster.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Organizadores")
@SequenceGenerator(name = "genOrganizador", initialValue = 1, allocationSize = 1)
public class Organizador {
	  @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genOrganizador")
	    @Column(name="IDOrganizador", columnDefinition = "NUMERIC(6)")
	    private Integer id;

	    @Column(name="nombre",length = 40)
	    private String nombre;

	    @Column(name="email",length = 40)
	    private String email;

	    @Column(name="contraseña",length = 40)
	    private String contraseña;
	    
	    @Column(name="descripcion",length = 80)
	    private String descripcion;
	    
	    @OneToMany(mappedBy = "organizador",fetch = FetchType.LAZY)
	    private List<Evento>eventos;
	    
	    public Organizador() {
	    	eventos = new ArrayList<Evento>();
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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getContraseña() {
			return contraseña;
		}

		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public List<Evento> getEventos() {
			return eventos;
		}

		public void setEventos(List<Evento> eventos) {
			this.eventos = eventos;
		}
	    
	    
}
