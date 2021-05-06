package com.ticketmaster.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.dao.IComentarioDao;
import com.ticketmaster.models.entities.Comentario;
import com.ticketmaster.service.IComentarioService;

@Named
@RequestScoped
public class ComentarioServiceImpl implements IComentarioService{

	@Inject
	private IComentarioDao cDao;
	
	
	@Override
	public void insert(Comentario com) {
		cDao.insert(com);
		
	}

	@Override
	public List<Comentario> list() {
		
		return cDao.list();
	}

	@Override
	public void delete(Integer idComentario) {
		cDao.delete(idComentario);
		
	}

}
