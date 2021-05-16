package com.ticketmaster.service;

import java.util.List;

import com.ticketmaster.models.entities.Pais;

public interface IPaisService {
	
	public void insert(Pais pai);
	
	List<Pais>list();
	
	public void delete(Integer idPais);
	
	public List<Pais> findByName(Pais pai);

}
