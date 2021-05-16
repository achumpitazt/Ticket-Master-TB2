package com.ticketmaster.dao;

import java.util.List;

import com.ticketmaster.models.entities.Pais;

public interface IPaisDao {
	
	public void insert(Pais pai);
	
	public List<Pais>list();
	
	public void delete(int idPais);

}
