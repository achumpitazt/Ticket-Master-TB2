package com.ticketmaster.serviceimpl;


import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.models.entities.Cliente;
import com.ticketmaster.service.IClienteService;
import com.ticketmaster.dao.IClienteDao;


@Named
@RequestScoped
public class ClienteServiceImpl implements IClienteService {

	
	@Inject
	private IClienteDao cDao;

	@Override
	public void insert(Cliente cli) {
		cDao.insert(cli);
		
	}

	@Override
	public List<Cliente> list() {
		
		return cDao.list();
	}

	@Override
	public void delete(Integer idCliente) {
		
		cDao.delete(idCliente);
		
	}
	
	

}
