package com.ticketmaster.service;

import java.util.List;

import com.ticketmaster.models.entities.Sexo;

public interface ISexoService {

	public void insert (Sexo sex);
	
	List<Sexo>list();
	
	public void delete(Integer idSexo);
}
