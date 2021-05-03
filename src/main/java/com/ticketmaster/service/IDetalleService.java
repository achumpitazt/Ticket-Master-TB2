package com.ticketmaster.service;

import java.util.List;

import com.ticketmaster.models.entities.Detalle;

public interface IDetalleService {
	
	public void insert(Detalle det);
	List<Detalle> list();
	public void delete(int idDetalle);

}
