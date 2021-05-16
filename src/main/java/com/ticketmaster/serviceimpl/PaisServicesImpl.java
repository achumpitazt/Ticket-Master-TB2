package com.ticketmaster.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.dao.IPaisDao;
import com.ticketmaster.models.entities.Pais;
import com.ticketmaster.service.IPaisService;

@Named
@RequestScoped
public class PaisServicesImpl implements IPaisService{

	@Inject
	private IPaisDao pDao;
	
	@Override
	public void insert(Pais pai) {
		pDao.insert(pai);
		
	}

	@Override
	public List<Pais> list() {
		
		return pDao.list();
	}

	@Override
	public void delete(Integer idPais) {
		pDao.delete(idPais);
		
	}

	@Override
	public List<Pais> findByName(Pais pai) {
		
		return pDao.findByName(pai);
	}

}
