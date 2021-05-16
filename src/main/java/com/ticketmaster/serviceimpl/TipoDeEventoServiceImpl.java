package com.ticketmaster.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.dao.ITipoDeEventoDao;
import com.ticketmaster.models.entities.TipoDeEvento;
import com.ticketmaster.service.ITipoDeEventoService;

@Named
@RequestScoped
public class TipoDeEventoServiceImpl implements ITipoDeEventoService{

	@Inject
	private ITipoDeEventoDao tDao;
	
	@Override
	public void insert(TipoDeEvento tev) {
		tDao.insert(tev);
		
	}

	@Override
	public List<TipoDeEvento> list() {
		
		return tDao.list();
	}

	@Override
	public void delete(Integer idTipoDeEvento) {
		
		tDao.delete(idTipoDeEvento);
		
	}

	

}
