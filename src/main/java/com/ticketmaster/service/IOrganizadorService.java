package com.ticketmaster.service;

import java.util.List;

import com.ticketmaster.models.entities.Organizador;


public interface IOrganizadorService {
	public void insert(Organizador org);
	List<Organizador> list();
	public void delete(int idOrganizador);
}
