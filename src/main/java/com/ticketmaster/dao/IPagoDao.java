package com.ticketmaster.dao;

import java.util.List;

import com.ticketmaster.models.entities.Pago;

public interface IPagoDao {
	public void insert(Pago pag);
	public List<Pago> list();
	public void deleted(int idPago);
}
