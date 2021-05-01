package com.ticketmaster.service;

import java.util.List;

import com.ticketmaster.models.entities.Cliente;

public interface IClienteService {
	
	public void insert(Cliente cli);
	
	List<Cliente> list();
	
	public void delete(Integer idCliente);
	

}
