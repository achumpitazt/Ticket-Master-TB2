package com.ticketmaster.serviceimlp;


import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.dao.IOrganizadorDao;
import com.ticketmaster.models.entities.Organizador;
import com.ticketmaster.service.IOrganizadorService;

@Named
@RequestScoped
public class OrganizadorServiceImpl implements IOrganizadorService {

	@Inject
	private IOrganizadorDao oDao;
	
	@Override
	public void insert(Organizador org) {
		oDao.insert(org);
		
	}

	@Override
	public List<Organizador> list() {
		
		return oDao.list();
	}

	@Override
	public void delete(int idOrganizador) {
		
		oDao.delete(idOrganizador);
		
	}
	
	
	

}
