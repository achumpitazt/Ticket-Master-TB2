package com.ticketmaster.service;

import java.util.List;

import com.ticketmaster.models.entities.MetodoPago;

public interface IMetodoPagoService {
	public void insert(MetodoPago mpa);

	List<MetodoPago> list();

	public void deleted(int idMetodoPago);
}
