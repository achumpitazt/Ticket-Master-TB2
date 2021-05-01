package com.ticketmaster.dao;

import java.util.List;
import com.ticketmaster.models.entities.Detalle;

public interface IDetalleDao {
	
	public void insert(Detalle det);
	public List<Detalle>List();
	public void delete(int idDetalle);

}
