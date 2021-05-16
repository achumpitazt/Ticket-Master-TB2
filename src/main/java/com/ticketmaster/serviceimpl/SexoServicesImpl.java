package com.ticketmaster.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.dao.ISexoDao;
import com.ticketmaster.models.entities.Sexo;
import com.ticketmaster.service.ISexoService;

@Named
@RequestScoped
public class SexoServicesImpl implements ISexoService{

	@Inject
	private ISexoDao sDao;
	
	@Override
	public void insert(Sexo sex) {
		sDao.insert(sex);
		
	}

	@Override
	public List<Sexo> list() {
		
		return sDao.list();
	}

	@Override
	public void delete(Integer idSexo) {
		sDao.delete(idSexo);
		
	}

	@Override
	public List<Sexo> findByName(Sexo sex) {
		
		return sDao.findByName(sex);
	}

}
