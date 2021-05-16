package com.ticketmaster.dao;

import java.util.List;

import com.ticketmaster.models.entities.Evento;

public interface IEventoDao {
	
	public void insert(Evento evento);
	
	public List<Evento>list();
	
	public void delete(Integer idEvento);
	
	

}
