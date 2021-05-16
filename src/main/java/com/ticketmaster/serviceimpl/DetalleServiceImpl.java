package com.ticketmaster.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.dao.IDetalleDao;
import com.ticketmaster.models.entities.Detalle;
import com.ticketmaster.service.IDetalleService;

@Named
@RequestScoped
public class DetalleServiceImpl implements IDetalleService{

	@Inject
	private IDetalleDao dDao;
	
	@Override
	public void insert(Detalle det) {
		
		dDao.insert(det);
		
	}

	@Override
	public List<Detalle> list() {
		
		return dDao.List();
	}

	@Override
	public void delete(int idDetalle) {

		dDao.delete(idDetalle);
		
	
	}

}
