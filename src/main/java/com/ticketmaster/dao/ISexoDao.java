package com.ticketmaster.dao;

import java.util.List;

import com.ticketmaster.models.entities.Sexo;

public interface ISexoDao {
	
	public void insert(Sexo sex);
	
	List<Sexo>list();
	
	public void delete(Integer idSexo);
	
	public List<Sexo> findByName(Sexo sex);

}
