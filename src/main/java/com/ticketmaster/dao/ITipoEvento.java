package com.ticketmaster.dao;

import java.util.List;
import com.ticketmaster.models.entities.TipoDeEvento;

public interface ITipoEvento {
	public void insert(TipoDeEvento tie);
	public List<TipoDeEvento>list();
	public void delete(int idTipoEvento);
}
