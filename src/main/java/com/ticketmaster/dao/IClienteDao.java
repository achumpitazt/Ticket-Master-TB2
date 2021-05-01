package com.ticketmaster.dao;

import java.util.List;

import com.ticketmaster.models.entities.Cliente;

public interface IClienteDao {
	
	public void insert(Cliente cli);
	
	public List<Cliente>list();
	
	public void delete(Integer idCliente);

}
