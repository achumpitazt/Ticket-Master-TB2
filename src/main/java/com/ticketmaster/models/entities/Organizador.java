package com.ticketmaster.models.entities;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

	    @Column(name="contrase�a",length = 40)
	    private String contrase�a;
	    
	    @Column(name="descripcion",length = 80)
	    private String descripcion;
	    
	    
	    
	    
		public Organizador() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

		public Organizador(Integer id, String nombre, String email, String contrase�a, String descripcion) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.email = email;
			this.contrase�a = contrase�a;
			this.descripcion = descripcion;
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

		public String getContrase�a() {
			return contrase�a;
		}

		public void setContrase�a(String contrase�a) {
			this.contrase�a = contrase�a;
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
			result = prime * result + ((id == null) ? 0 : id.hashCode());
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
			Organizador other = (Organizador) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

		
		
	    
	    
}
