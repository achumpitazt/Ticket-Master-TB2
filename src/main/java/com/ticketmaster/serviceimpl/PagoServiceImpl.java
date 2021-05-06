package com.ticketmaster.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.dao.IPagoDao;
import com.ticketmaster.models.entities.Pago;
import com.ticketmaster.service.IPagoService;

@Named
@RequestScoped
public class PagoServiceImpl implements IPagoService{
	@Inject
	private IPagoDao pDao;
	
	@Override
	public void insert(Pago pag) {
		try {
			pDao.insert(pag);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<Pago> list() {
		return pDao.list();
	}

	@Override
	public void deleted(int idPago) {
		try {
			pDao.deleted(idPago);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}

}
