package com.ticketmaster.dao;

import java.util.List;

import com.ticketmaster.models.entities.Comentario;

public interface IComentarioDao {
	
	public void insert(Comentario com);
	
	public List<Comentario>list();
	
	public void delete(Integer idComentario);

}
