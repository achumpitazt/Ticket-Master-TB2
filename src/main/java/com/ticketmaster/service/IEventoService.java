package com.ticketmaster.service;

import java.util.List;

import com.ticketmaster.models.entities.Evento;

public interface IEventoService {
	
	public void insert(Evento eve);
	
	List<Evento>list();
	
	public void delete(Integer idEvento);
	
	

}
