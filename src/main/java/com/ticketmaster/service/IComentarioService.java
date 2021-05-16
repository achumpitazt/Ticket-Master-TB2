package com.ticketmaster.service;

import java.util.List;

import com.ticketmaster.models.entities.Comentario;

public interface IComentarioService {
	
	public void insert(Comentario com);
	
	List<Comentario>list();
	
	public void delete(Integer idComentario);

}
