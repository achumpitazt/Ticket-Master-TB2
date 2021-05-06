package com.ticketmaster.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.dao.IEventoDao;
import com.ticketmaster.models.entities.Evento;
import com.ticketmaster.service.IEventoService;

@Named
@RequestScoped
public class EventoServicesImpl implements IEventoService{

	@Inject
	private IEventoDao eDao;
	
	
	@Override
	public void insert(Evento eve) {
		eDao.insert(eve);
		
	}

	@Override
	public List<Evento> list() {
		// TODO Auto-generated method stub
		return eDao.list();
	}

	@Override
	public void delete(Integer idEvento) {
		eDao.delete(idEvento);
		
	}

}
