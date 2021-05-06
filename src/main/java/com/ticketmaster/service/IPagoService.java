package com.ticketmaster.service;

import java.util.List;

import com.ticketmaster.models.entities.Pago;

public interface IPagoService {
	public void insert(Pago pag);

	public List<Pago> list();

	public void deleted(int idPago);

}
