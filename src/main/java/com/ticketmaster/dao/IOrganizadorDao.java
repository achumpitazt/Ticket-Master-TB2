package com.ticketmaster.dao;

import java.util.List;

import com.ticketmaster.models.entities.Organizador;


public interface IOrganizadorDao {
	public void insert(Organizador org);
	public List<Organizador>list();
	public void delete(int idOrganizador);
}
