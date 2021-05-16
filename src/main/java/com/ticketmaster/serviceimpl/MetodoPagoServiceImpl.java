package com.ticketmaster.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.dao.IMetodoPagoDao;
import com.ticketmaster.models.entities.MetodoPago;
import com.ticketmaster.service.IMetodoPagoService;

@Named
@RequestScoped
public class MetodoPagoServiceImpl implements IMetodoPagoService{

	@Inject
	private IMetodoPagoDao mDao;
	
	@Override
	public void insert(MetodoPago mpa) {
		mDao.insert(mpa);
	}

	@Override
	public List<MetodoPago> list() {
		return mDao.list();
	}

	@Override
	public void deleted(int idMetodoPago) {
		mDao.deleted(idMetodoPago);
	}
	
}
