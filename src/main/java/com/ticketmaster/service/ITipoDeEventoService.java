package com.ticketmaster.service;

import java.util.List;

import com.ticketmaster.models.entities.TipoDeEvento;

public interface ITipoDeEventoService {
	
	public void insert (TipoDeEvento tev);
	
	List<TipoDeEvento> list();
	
	public void delete (Integer idTipoDeEvento);

}
