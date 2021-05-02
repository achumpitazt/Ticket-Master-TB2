package com.ticketmaster.dao;

import java.util.List;

import com.ticketmaster.models.entities.MetodoPago;

public interface IMetodoPagoDao {
	public void insert(MetodoPago mpa);

	public List<MetodoPago> list();

	public void deleted(int idMetodoPago);
}
