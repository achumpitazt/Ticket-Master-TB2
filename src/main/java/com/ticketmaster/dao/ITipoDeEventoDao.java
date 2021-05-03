package com.ticketmaster.dao;

import java.util.List;

import com.ticketmaster.models.entities.TipoDeEvento;

public interface ITipoDeEventoDao {
	
	public void insert(TipoDeEvento tev);
	
	public List<TipoDeEvento>list();
	
	public void delete (Integer idTipoDeEvento);

}
